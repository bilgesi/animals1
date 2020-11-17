package ise308.taskin.bilge.animals

class Dogs(animaltype: String, color: String, age: Int): Animals(animaltype, color, age) {
    override val color: "Black"
    override fun food(){
        println("dogs are carnivores.")
    }
}