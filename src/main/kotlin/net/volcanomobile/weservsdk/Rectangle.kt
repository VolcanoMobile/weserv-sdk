package net.volcanomobile.weservsdk

import java.lang.StringBuilder

data class Rectangle internal constructor(
    val x: Int?,
    val y: Int?,
    val width: Int?,
    val height: Int?
)

internal fun Rectangle.toQueryString() =
    StringBuilder().apply {
        if (x != null)
            append("&cx=$x")
        if (y != null)
            append("&cy=$y")
        if (width != null)
            append("&cw=$width")
        if (height != null)
            append("&ch=$height")
    }.toString()