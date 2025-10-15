package example.myapp.decor

fun String.hasSpaces() = indexOf(" ") != -1

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

val AquariumPlant.isGreen: Boolean
    get() = color == "green"

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun main() {
    println("1 2 3".hasSpaces())
    println("123".hasSpaces())
    println()

    val plant = GreenLeafyPlant(size = 10)
    plant.print()
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()
    println(aquariumPlant.isGreen)
    val plant2: AquariumPlant? = null
    plant2.pull()
}