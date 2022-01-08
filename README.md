# Kotlin TornadoFX Template

## What is it?

This is an example of how to work with JavaFX/TornadoFX on Kotlin with target JVM 11 or above.

Shall support OpenJDK 11 or any other 11-compatible JDK, e.g. GraalVM 21.

Downgrading to JDK 8 may work, but I have not tested it, and JLink magic will be lost.

Upgrading to JDK 17 may also work, but I have not tested it either.

Building to native image with GraalVM/GluonFX shall also work, if modified accordingly. See
official docs https://docs.gluonhq.com/ or my (not-well-documented) example 
https://github.com/nikita-tomilov/kotlin-javafx-graalvm.

## What does it have?

0. Kotlin
1. Slf4j with ```companion object : KLogging()```: https://github.com/MicroUtils/kotlin-logging
2. JUnit tests with AssertJ https://assertj.github.io/doc/
3. TornadoFX with Jetpack-Compose-inspired GUI creation: https://tornadofx.io/

## What are the building options?
0. Plain fat jar build
```
mvn clean package
```
Note that this fat jar will require a JavaFX-bundled JDK 
(for example, Azul builds: https://www.azul.com/downloads/?version=java-11-lts&package=jdk-fx)
or manual fiddling with JavaFX SDK:
```
$ /usr/lib/jvm/java-11-openjdk-amd64/bin/java -jar kotlin-tornadofx-template-1.0-SNAPSHOT-fatjar.jar
Error: JavaFX runtime components are missing, and are required to run this application
$ echo $?
1
$ /opt/zulu11.48.21-ca-fx-jdk11.0.11-linux_x64/bin/java -jar kotlin-tornadofx-template-1.0-SNAPSHOT-fatjar.jar
$ echo $?
0
```

## How to run it?
0. Via importing the project to IntelliJ IDEA
1. Via building and running fat jar file, as shown above
2. Via OpenJFX Maven plugin:
```
mvn javafx:run
```
