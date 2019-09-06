package net.volcanomobile.weservsdk.builder

import net.volcanomobile.weservsdk.Rectangle
import net.volcanomobile.weservsdk.WeservDsl

@WeservDsl
class RectangleBuilder internal constructor() {
    private var x: Int? = null
    private var y: Int? = null
    private var width: Int? = null
    private var height: Int? = null

    fun x(lambda: () -> Int) { x = lambda() }
    fun y(lambda: () -> Int) { y = lambda() }
    fun width(lambda: () -> Int) { width = lambda() }
    fun height(lambda: () -> Int) { height = lambda() }

    fun build() = Rectangle(x, y, width, height)
}