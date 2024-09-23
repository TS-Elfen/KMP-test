package org.elfen.kmptest.modules

import org.elfen.kmptest.SecondScreenModel
import org.koin.dsl.module

val ViewModelModules = module {
    factory {
        SecondScreenModel(get())
    }
}