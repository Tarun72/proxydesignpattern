import javafx.geometry.Point2D

interface Image {
    fun render()
    fun location(): Point2D
    fun setBitMapLocation(point2D: Point2D)
}