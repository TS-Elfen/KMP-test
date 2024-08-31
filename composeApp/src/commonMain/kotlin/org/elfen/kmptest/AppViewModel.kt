package org.elfen.kmptest

import cafe.adriel.voyager.core.model.ScreenModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class AppViewModel(private val greeting: Greeting): ScreenModel {
    private val _showsContent = MutableStateFlow(false)
    val showsContent = _showsContent.asStateFlow()

    private val _greet = MutableStateFlow(greeting.greet())
    val greet = _greet.asStateFlow()

    fun toggleContent() {
        _showsContent.update { !it }
    }
}