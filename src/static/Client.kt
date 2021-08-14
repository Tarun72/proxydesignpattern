package static

import Image
import javafx.geometry.Point2D

class Client {
    companion object {
        fun getImageFactory(name: String): Image {
            return BitmapImage(name)
        }
    }

    fun createImage() {
        val image: Image = getImageFactory("background.png")
        image.setBitMapLocation(point2D = Point2D(100.0, 100.0))
        println("location is ${image.location()}")
        println("rendering image")
        image.render()
    }
}

fun main() {
    Client().createImage()
}

