package org.elfen.kmptest.repository

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

interface TestRepository {
    fun getFuga() : Flow<String>
}

class TestDataStore : TestRepository {
    override fun getFuga(): Flow<String> = flow{
        delay(1000)
        emit("Fuga")
    }
}