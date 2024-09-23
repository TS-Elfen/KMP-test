package org.elfen.kmptest.modules

import cafe.adriel.voyager.core.registry.ScreenProvider
import cafe.adriel.voyager.core.registry.screenModule
import org.elfen.kmptest.FirstScreen
import org.elfen.kmptest.HomeScreen
import org.elfen.kmptest.SecondScreen

sealed class Screens : ScreenProvider {
    data object  Home: Screens()
    data object First: Screens()
    data class Second(val id: String) : Screens()
}

val appScreenModule = screenModule {
    register<Screens.Home> {
        HomeScreen()
    }
    register<Screens.First> {
        FirstScreen()
    }
    register<Screens.Second> { provider ->
        SecondScreen(provider.id)
    }
}