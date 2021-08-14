package static

import Image
import javafx.geometry.Point2D

class ProxyImage(val name: String) : Image {
    private lateinit var bitmapImage: BitmapImage
    private lateinit var location: Point2D

    override fun render() {
        if (!::bitmapImage.isInitialized) {
            bitmapImage = BitmapImage(name)
            bitmapImage.setBitMapLocation(location)
        }
    }

    override fun location(): Point2D {
        return if (::bitmapImage.isInitialized) {
            bitmapImage.location()
        } else {
            location
        }
    }

    override fun setBitMapLocation(point2D: Point2D) {
        if (::bitmapImage.isInitialized) {
            bitmapImage.setBitMapLocation(point2D)
        } else {
            location = point2D
        }
    }
}