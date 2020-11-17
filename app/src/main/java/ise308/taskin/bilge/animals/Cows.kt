package ise308.taskin.bilge.animals

class Cows(animaltype: String, color: String, age: Int): Animals(animaltype, color, age) {
    override  val color: "White or black"
    override fun food(){
        println("cows are herbivore")
    }
}