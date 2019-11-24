# FirstAWSLambdaMicronaut
My first AWS lambda with Kotlin and Micronaut

## Dependencies
 - [Kotlin](https://kotlinlang.org/) Language
 - [Gradlew Shadow Plugin](https://github.com/johnrengelman/shadow) to collapse all dependencies and project code into a single Jar file
 - [micronaut](https://micronaut.io/)
 - [Spek](https://www.spekframework.org/) for testing

## Description
- AppFunction is the entry point, it's implementing Function<HandlerInput, HandlerOutput>, this way the method apply will be invoked by Micronaut
- RequestHandler is using HandlerInput as input and HandlerOutput as output, both are dummy classes with a String inside
- Inside apply there is our *"logic"*

[Here](https://github.com/dcampogiani/FirstAWSLambda) you can find the same lambda without Micronaut
