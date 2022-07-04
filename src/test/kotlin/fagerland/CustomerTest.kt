package fagerland

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import org.junit.Test
import kotlin.test.assertEquals

class CustomerTest {

    @Test
    fun testGetCustomers() = testApplication {
        val response = client.get("/customer")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("No customers found", response.bodyAsText())
    }
}