package net.volcanomobile.weservsdk

data class Crop internal constructor(
    val preCrop: Boolean,
    val rectangle: Rectangle?,
    val alignment: Alignment?,
    val trim: Int?
)

internal fun Crop.toQueryString() =
    StringBuilder().apply {
        if (preCrop)
            append("&precrop")

        if (alignment != null)
            append(alignment.toString())

        if (rectangle != null)
            append(rectangle.toQueryString())

        if (trim != null)
            append("&trim=$trim")
    }.toString()