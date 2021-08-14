package static

import Image
import javafx.geometry.Point2D

class BitmapImage(val name:String) : Image {
    private lateinit var location: Point2D

    override fun render() {
        println("Image $name is rendering from the location $location")
    }

    override fun location(): Point2D {
        return location
    }

    override fun setBitMapLocation(point2D: Point2D) {
        location = point2D
    }
}