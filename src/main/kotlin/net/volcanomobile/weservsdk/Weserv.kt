package net.volcanomobile.weservsdk

import net.volcanomobile.weservsdk.builder.WeservBuilder
import java.net.URLEncoder

private const val BASE_URL = "https://images.weserv.nl/?url="

data class Weserv internal constructor(
    val url: String,
    val size: Size?,
    val fit: Fit?,
    val withoutEnlargement: Boolean,
    val crop: Crop?
)

fun weserv(lambda: WeservBuilder.() -> Unit) =
    WeservBuilder().apply(lambda).build()

fun Weserv.buildUrl() =
    StringBuilder(BASE_URL).apply {

        append(URLEncoder.encode(url, "UTF-8"))

        if (size != null)
            append(size.toQueryString())

        if (fit != null)
            append(fit.toQueryString())

        if (withoutEnlargement)
            append("&we")

        if (crop != null)
            append(crop.toQueryString())

    }.toString()