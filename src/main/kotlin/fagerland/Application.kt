package fagerland

import configureRouting
import fagerland.plugins.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.plugins.cors.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    install(CORS) {
        anyHost()
    }
    configureRouting()
    configureSerialization()
}