package com.kotlinj

fun main(){

    println("Hello World !")

    val Students = listOf<Students>(
        Students("Jerry", 180, 50),
        Students("Jim", 190, 70),
        Students("Joshua", 160, 40),
        Students("Jpan", 200, 80),
    )
}
data class Students(
    val name:String,
    val height:Int,
    val weight:Int,) {
    fun print(){("$name\t$height\t$weight\t${weight / (height * height)}")}

    fun grading(): String {
        var grading = "F"
        when (weight / (height * height) / 10) {
            in 9..10 -> "A"
            8 -> "B"
            7 -> "C"
            6 -> "D"
            else -> "F"
        }
        return grading
    }
}


