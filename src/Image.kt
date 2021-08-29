import location.Location

interface Image {
    fun render()
    fun location(): Location
    fun setBitMapLocation(point2D: Location)
}