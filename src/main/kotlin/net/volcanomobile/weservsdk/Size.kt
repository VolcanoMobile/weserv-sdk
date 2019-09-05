package net.volcanomobile.weservsdk

import java.lang.StringBuilder

data class Size internal constructor(
    val width: Int?,
    val height: Int?
)

internal fun Size.toQueryString() =
    StringBuilder().apply {
        if (width != null)
            append("&w=$width")
        if (height != null)
            append("&h=$height")
    }.toString()