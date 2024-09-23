package org.elfen.kmptest.modules

import org.elfen.kmptest.repository.TestDataStore
import org.elfen.kmptest.repository.TestRepository
import org.koin.dsl.module

val RepositoryModules = module  {
    single<TestRepository> { TestDataStore() }
}