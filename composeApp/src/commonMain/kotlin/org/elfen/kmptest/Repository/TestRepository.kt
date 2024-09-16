package org.elfen.kmptest.Repository

interface TestRepository {
    fun getHoge() : String
}

class TestDataStore : TestRepository {
    override fun getHoge(): String = "hoge"
}