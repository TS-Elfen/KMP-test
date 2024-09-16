package org.elfen.kmptest

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen

data class SecondScreen(
    val id: String
): Screen {
    @Composable
    override fun Content() {
        val screenModel = rememberScreenModel { SecondScreenModel() }
        val state = screenModel.number.collectAsState().value
        screenModel.get()
        Text("Hello, $state!")
    }
}