package org.elfen.kmptest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform