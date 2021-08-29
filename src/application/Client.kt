package application

import Image
import location.Location
import static.BitmapImage

class Client {
    companion object {
        fun getImageFactory(name: String): Image {
            return BitmapImage(name)
        }
    }

    fun createImage() {
        val image: Image = getImageFactory("background.png")
        image.setBitMapLocation(point2D = Location(xCoordinates = 100.0, yCoordinates = 100.0))
        println("location is ${image.location()}")
        println("rendering image")
        image.render()
    }
}

fun main() {
    Client().createImage()
}

