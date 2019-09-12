package net.volcanomobile.weservsdk

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class WeservTests {

    @Test
    fun `no Url throws exception`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            weserv {  }
        }
    }
}