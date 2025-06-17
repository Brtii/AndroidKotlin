package com.berti.fundamentos

fun main (){
    // INTERPOLACION


    val primerNombre:String = "Pepito"
    val primerApellido:String = "Juarez"
    val edad: Int = 8
    val estatura: Double =1.20

    //val presentacion:String = "Hola mi nombre es "+ primerNombre +"\n" + edad + " " + estatura
    val presentacion: String= "Hola mi nombre es $primerNombre $primerApellido y tengo " +
            "la edad de $edad con una estatura de $estatura metros"

    println(presentacion)

}