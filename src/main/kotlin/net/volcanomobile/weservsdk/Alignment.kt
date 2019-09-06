package net.volcanomobile.weservsdk

sealed class Alignment(internal val value: String)
{
    // Position based
    object Center: Alignment("center")
    object Top: Alignment("top")
    object Right: Alignment("right")
    object Bottom: Alignment("bottom")
    object Left: Alignment("left")
    object TopLeft: Alignment("top-left")
    object BottomLeft: Alignment("bottom-left")
    object BottomRight: Alignment("bottom-right")
    object TopRight: Alignment("top-right")

    // Focal point
    class Focal(x: Int, y: Int): Alignment("focal-$x-$y")

    // Smart crop
    object Entropy: Alignment("entropy")
    object Attention: Alignment("attention")
}

internal fun Alignment.toQueryString() = "&a=$value"