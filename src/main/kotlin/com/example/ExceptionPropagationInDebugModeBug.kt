package com.example

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val ex = RuntimeException()
    try {
        coroutineScope {
            throw ex
        }
    } catch (e: RuntimeException) {
        check(e === ex) { "should be equal" }
    }
}
