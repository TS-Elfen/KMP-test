package org.elfen.kmptest

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

data class SecondScreen(
    val id: String
): Screen {
    @Composable
    override fun Content() {
        Text("Hello, $id!")
    }
}