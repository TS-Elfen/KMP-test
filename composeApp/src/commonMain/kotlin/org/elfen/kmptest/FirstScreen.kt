package org.elfen.kmptest

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomAppBar
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator

class FirstScreen: Screen {
    @Composable
    override fun Content() {
        Navigator(screen = HomeScreen()) { navigator ->
            Scaffold(
                topBar = {
                    TopAppBar(
                        backgroundColor = MaterialTheme.colors.primary,
                        contentColor = Color.White,
                        title = {
                            Text(text = "title")
                        }
                    )
                },
                content = { padding ->
                    Box(
                        modifier = Modifier
                            .padding(padding)
                            .fillMaxWidth()
                    ) {
                        CurrentScreen()
                    }
                },
                bottomBar = {
                    BottomAppBar(
                        backgroundColor = MaterialTheme.colors.primary,
                        contentColor = Color.White,
                    ) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            text = "Bottom app bar",
                        )
                    }
                }
            )

        }
    }
}