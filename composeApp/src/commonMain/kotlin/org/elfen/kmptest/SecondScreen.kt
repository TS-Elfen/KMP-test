package org.elfen.kmptest

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.koinScreenModel
import org.elfen.kmptest.modules.Screens

data class SecondScreen(
    val id: String
): Screen {
    @Composable
    override fun Content() {
        val screenModel = koinScreenModel<SecondScreenModel>()
        val state = screenModel.value.collectAsState().value
        screenModel.get()
        Text("Hello, $state! Good bye, $id")
    }
}