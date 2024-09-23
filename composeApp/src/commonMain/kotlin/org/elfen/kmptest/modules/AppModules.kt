package org.elfen.kmptest.modules

import org.koin.core.module.Module

fun appModules(): List<Module> = listOf(
    ViewModelModules,
    RepositoryModules,
    UsecaseModules
)