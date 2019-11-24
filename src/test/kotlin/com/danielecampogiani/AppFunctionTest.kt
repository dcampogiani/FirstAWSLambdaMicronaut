package com.danielecampogiani

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.jupiter.api.Assertions.assertEquals


class AppFunctionTest: Spek({

    describe("app function") {
        val server = ApplicationContext.run(EmbeddedServer::class.java)
        val client = server.applicationContext.getBean(AppClient::class.java)

        it("should return 'app'") {
            val body = HandlerInput("app")
            assertEquals(
                "app", 
                client.apply(body).blockingGet().message
            )
        }

        afterGroup {
            server.stop()
        }
    }
})
