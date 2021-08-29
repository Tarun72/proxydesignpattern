package static

import Image
import location.Location

class ProxyImage(val name: String) : Image {
    private lateinit var bitmapImage: BitmapImage
    private lateinit var location: Location

    override fun render() {
        if (::bitmapImage.isInitialized) {
            bitmapImage.setBitMapLocation(location)
        }else{
            println("Proxy image rendering $location")
            bitmapImage = BitmapImage(name)
            bitmapImage.setBitMapLocation(location)
        }
    }

    override fun location(): Location {
        return if (::bitmapImage.isInitialized) {
            bitmapImage.location()
        } else {
            location
        }
    }

    override fun setBitMapLocation(point2D: Location) {
        if (::bitmapImage.isInitialized) {
            bitmapImage.setBitMapLocation(point2D)
        } else {
            location = point2D
        }
    }
}