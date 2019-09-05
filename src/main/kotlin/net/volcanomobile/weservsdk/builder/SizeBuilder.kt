package net.volcanomobile.weservsdk.builder

import net.volcanomobile.weservsdk.Size
import net.volcanomobile.weservsdk.WeservDsl

@WeservDsl
class SizeBuilder internal constructor() {
    private var width: Int? = null
    private var height: Int? = null

    fun width(lambda: () -> Int) { this.width = lambda() }
    fun height(lambda: () -> Int) { this.height = lambda() }

    fun build() = Size(width, height)
}