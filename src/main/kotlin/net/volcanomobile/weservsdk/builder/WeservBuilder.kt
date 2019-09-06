package net.volcanomobile.weservsdk.builder

import net.volcanomobile.weservsdk.*
import net.volcanomobile.weservsdk.WeservDsl
import java.net.URI

@WeservDsl
class WeservBuilder internal constructor() {
    private var url: String? = null
    private var size: Size? = null
    private var fit: Fit? = null
    private var withoutEnlargement = false
    private var crop: Crop? = null

    fun url(labmda: () -> String) { url = labmda() }

    fun size(lambda: SizeBuilder.() -> Unit) { size = SizeBuilder().apply(lambda).build() }

    fun fit(lambda: () -> Fit) { fit = lambda() }
    fun withoutEnlargement(lambda: () -> Boolean) { withoutEnlargement = lambda() }

    fun crop(labmda: CropBuilder.() -> Unit) { crop = CropBuilder().apply(labmda).build() }

    fun build(): Weserv =
        url?.let { url ->
            return Weserv(
                url,
                size,
                fit,
                withoutEnlargement,
                crop
            )

        } ?: throw IllegalArgumentException("url is null")
}