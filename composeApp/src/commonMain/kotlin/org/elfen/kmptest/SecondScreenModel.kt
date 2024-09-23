package org.elfen.kmptest

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.elfen.kmptest.usecase.TestUsecase

class SecondScreenModel(
    private val usecase: TestUsecase
): ScreenModel {
    private val _value = MutableStateFlow("0")
    val value = _value.asStateFlow()

    fun get() {
        screenModelScope.launch {
            usecase.execute().collect { it ->
                delay(1000)
                _value.emit(it)
            }
        }
    }
}