package static

import Image
import location.Location

class BitmapImage(val name:String) : Image {
    private lateinit var location: Location

    override fun render() {
        println("Image $name is rendering from the location $location")
    }

    override fun location(): Location {
        return location
    }

    override fun setBitMapLocation(point2D: Location) {
        location = point2D
    }
}