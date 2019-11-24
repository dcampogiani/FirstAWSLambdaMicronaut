package com.danielecampogiani

import io.micronaut.function.client.FunctionClient
import io.micronaut.http.annotation.Body
import io.reactivex.Single
import javax.inject.Named

@FunctionClient
interface AppClient {

    @Named("app")
    fun apply(@Body body: HandlerInput): Single<HandlerOutput>
}
