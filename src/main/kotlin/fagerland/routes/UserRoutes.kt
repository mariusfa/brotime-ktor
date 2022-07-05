package fagerland.routes

import fagerland.dto.UserDTO
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.userRouting() {
    route("user") {
        post("register") {
            val user = call.receive<UserDTO>()
            call.respond(user)
        }
        post("login") {

        }
    }
}