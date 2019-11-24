package com.danielecampogiani;

import io.micronaut.function.FunctionBean
import io.micronaut.function.executor.FunctionInitializer
import java.util.function.Function

@FunctionBean("app")
class AppFunction : FunctionInitializer(), Function<HandlerInput, HandlerOutput> {

    val echo: Echo = EchoImpl()

    override fun apply(input: HandlerInput): HandlerOutput {
        return HandlerOutput(echo.echo(input.message))
    }
}

/**
 * This main method allows running the function as a CLI application using: echo '{}' | java -jar function.jar
 * where the argument to echo is the JSON to be parsed.
 */
fun main(args: Array<String>) {
    val function = AppFunction()
    function.run(args) { context -> function.apply(context.get(HandlerInput::class.java)) }
}