package com.berti.fundamentos

fun main(){
    var num:Int = 0
    var nullNum:Int? = null // ? no conozco el valor o la info
    var texto:String = ""
    var nullTexto:String? = null
    nullNum = 8
    nullTexto = "Kotlin"

    println(num)
    println(nullNum)
    println(texto)
    println(nullTexto)

    //Obligar a una variable a no ser null
    println("Obligar variable "+ nullNum!!)
    var noNulaObligatoria:String = "Obligado" !! // !! obliga a la variable a no ser nula
    var posibleNula:String = "Posible nula"
    println(noNulaObligatoria)
    println(posibleNula)


}