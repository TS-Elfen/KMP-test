package org.elfen.kmptest.usecase

import kotlinx.coroutines.flow.Flow
import org.elfen.kmptest.repository.TestRepository

interface TestUsecase {
    fun execute() : Flow<String>
}

class TestInteractor(
    val testRepository: TestRepository
): TestUsecase {
    override fun execute(): Flow<String> {
        return testRepository.getFuga()
    }
}