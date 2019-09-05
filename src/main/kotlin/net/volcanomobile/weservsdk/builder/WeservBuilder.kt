package net.volcanomobile.weservsdk.builder

import net.volcanomobile.weservsdk.Fit
import net.volcanomobile.weservsdk.Size
import net.volcanomobile.weservsdk.Weserv
import net.volcanomobile.weservsdk.WeservDsl
import java.net.URI

@WeservDsl
class WeservBuilder internal constructor() {
    private var url: URI? = null
    private var size: Size? = null
    private var fit: Fit? = null
    private var withoutEnlargement = false

    fun url(labmda: () -> String) { url = URI(labmda()) }

    fun size(lambda: SizeBuilder.() -> Unit) { size = SizeBuilder().apply(lambda).build() }

    fun fit(lambda: () -> Fit) { fit = lambda() }
    fun withoutEnlargement(lambda: () -> Boolean) { withoutEnlargement = lambda() }

    fun build(): Weserv =
        url?.let { url ->
            require(url.port == -1) { "Port not allowed" }

            val urlBuilder = StringBuilder("${url.host}${url.path}").apply {
                if (!url.query.isNullOrBlank()) {
                    append("?${url.query}" )
                }
                if (!url.fragment.isNullOrBlank()) {
                    append("#${url.fragment}")
                }
            }

            return Weserv(
                urlBuilder.toString(),
                url.scheme == "https",
                size,
                fit,
                withoutEnlargement
            )

        } ?: throw IllegalArgumentException("url is null")
}