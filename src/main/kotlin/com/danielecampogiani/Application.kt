package com.danielecampogiani

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("com.danielecampogiani")
                .mainClass(Application.javaClass)
                .start()
    }
}