@file:Suppress("PLUGIN_IS_NOT_ENABLED")

package fagerland.dto

import kotlinx.serialization.Serializable

@Serializable
data class Customer(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String
)

val customerStorage = mutableListOf<Customer>()
