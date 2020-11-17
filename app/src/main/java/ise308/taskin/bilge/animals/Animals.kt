package ise308.taskin.bilge.animals

import android.os.Parcel
import android.os.Parcelable

class Animals( val animaltype: String, val color: String, val age: Int ) {

    constructor(animaltype: String, color: String, age: Int): this (animaltype,color, age)
    val color: "white"

    fun food(){
        println("animals eat food")
    }

}
