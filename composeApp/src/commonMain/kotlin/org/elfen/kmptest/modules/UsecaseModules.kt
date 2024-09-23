package org.elfen.kmptest.modules

import org.elfen.kmptest.repository.TestRepository
import org.elfen.kmptest.usecase.TestInteractor
import org.elfen.kmptest.usecase.TestUsecase
import org.koin.dsl.module

val UsecaseModules = module {
    single<TestUsecase> { TestInteractor(get()) }
}