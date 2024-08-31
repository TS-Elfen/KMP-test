package org.elfen.kmptest

import org.koin.dsl.module

class AppModule {
    val homeModule = module {
        factory { AppViewModel(greeting = Greeting()) }
    }
}