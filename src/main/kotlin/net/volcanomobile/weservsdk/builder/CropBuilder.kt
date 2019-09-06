package net.volcanomobile.weservsdk.builder

import net.volcanomobile.weservsdk.Alignment
import net.volcanomobile.weservsdk.Crop
import net.volcanomobile.weservsdk.Rectangle
import net.volcanomobile.weservsdk.WeservDsl

@WeservDsl
class CropBuilder internal constructor() {
    private var preCrop = false
    private var trim : Int? = null
    private var rectangle: Rectangle? = null
    private var alignment: Alignment? = null

    fun preCrop(lambda: () -> Boolean) { preCrop = lambda() }
    fun trim(lambda: () -> Int) { trim = lambda() }
    fun rectangle(lambda: RectangleBuilder.() -> Unit) { rectangle = RectangleBuilder().apply(lambda).build() }
    fun alignment(lambda: () -> Alignment) { alignment = lambda() }

    fun build() = Crop(preCrop, rectangle, alignment, trim)
}