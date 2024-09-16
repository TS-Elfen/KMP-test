package org.elfen.kmptest

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch
import org.elfen.kmptest.Repository.TestRepository

class SecondScreenModel(
    // private val repository: TestRepository
): ScreenModel {
    fun numbers(): Flow<String> = flowOf("1", "2", "3")
    private val _number = MutableStateFlow("0")
    val number = _number.asStateFlow()

    fun get() {
        screenModelScope.launch {
            numbers().collect() { it ->
                delay(1000)
                _number.emit(it)
            }
        }
    }
}