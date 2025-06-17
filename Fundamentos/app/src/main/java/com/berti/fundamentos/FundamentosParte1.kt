package com.berti.fundamentos

fun main(){
    //Comentario de linea
    /*
    Comentario de bloque
    bloque
    bloque
     */
    //DECLARACION VAL y VAR

    //DECLARACION sin tipado

    // Se declara el nombre con inicial minuscula
    val nombreAnimal = "perro"
    var edadAnimal = 3

    //DECLARACION con tipado
    val pesoAnimal:Double = 3.5
    val tamanoAnimal:Float = 1.5f //f al final lo vuelve float para definirlo y usar un menor espacio de memoria
    var razaAnimal:Char = 'A'

    //DIFERENCIA VAL y VAR
    // nombreAnimal = "gato" //No es  posible reasignar un valor
    edadAnimal = 5 //Es posible reasignat un valor porque es mutable

    println(10)
    println(nombreAnimal) //ctrl + D clona la linea
    println("Edad animal " + edadAnimal + " anios")
    println(pesoAnimal)
    println(tamanoAnimal)
    println(razaAnimal)
}