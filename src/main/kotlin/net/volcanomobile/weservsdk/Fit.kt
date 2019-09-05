package net.volcanomobile.weservsdk

enum class Fit(internal val value: String)
{
    Inside("inside"),
    Outside("outside"),
    Cover("cover"),
    Fill("fill"),
    Contain("contain")
}

internal fun Fit.toQueryString() = "&fit=$value"