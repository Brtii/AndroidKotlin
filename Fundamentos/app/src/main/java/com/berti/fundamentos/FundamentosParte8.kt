package com.berti.fundamentos

fun main(){{}
    listas()
    }

//Arreglos
fun arreglos(){
    //Arreglos numericos
    // arrayOf es el verdadero array
    // array es un recurso, otra vaina
    var numerico = arrayOf(1,2,3,4,5) //Los valores en las posiciones son variables, se pueden modificar sus valores aunque el arreglo sea val
    var numericoConTipo = intArrayOf(6,7,8,9,10)

    //Arreglos de cadena de caracterez
    val colores = arrayOf("rojo", "azul", "amarillo")
    val frutas = arrayOf("manzana", "arandano", "mango")

    numerico[4] = 55 // asignar un nuevo valor a la posicion
    println(numerico[0]) // imprime lo que haya en la posicion 0
    println(numerico[2])
    println(numerico[4])

    println(numericoConTipo[0])
    println(colores.size)
    println(colores.first())
    println(colores.last())

    for (i in numerico){
        println(i)
    }

    for (i in frutas){
        print("$i, ")
    }

    for (i in numerico.indices){
        println("Posicion $i: ${numerico[i]}")
    }

    for (i in colores){
        println(i)
    }

    for (i in frutas){
        println(i)
    }
}


//LISTAS

fun listas(){
    //Listas inmutables - como los arreglos
    //Listas numericas
    val numeros = listOf(10, 20, 30, 40, 50) // <> ya no es necesario si no le asigno tipo
    val numerosTipados = listOf<Int>(11,22,33,44,55) //<> define el tipo de lista
    //Listas de cadena
    val mascotas = listOf("perro", "gato", "pez", "gallina")
    val verduras = listOf<String>("papa", "zanahoria", "brocoli")

    println(mascotas[0])
    println(mascotas)
    println(mascotas.size)
    println(mascotas.first())
    println(mascotas.last())

    //Recorrer una lista
    for (i in verduras){
        println(i)
    }

    // Listas mutables - se pueden modificar
    val vehiculos = mutableListOf("Toyota", "Honda", "Mazda", "Nissan")

    //Recorrer una lista
    for (i in vehiculos){
        println(i)
    }

    println(vehiculos)
    println(vehiculos.size)
    vehiculos.add("patito")
    println(vehiculos)
    vehiculos.add("gatito")
    println(vehiculos)
    println(vehiculos.size)
    vehiculos.removeLast()
    println(vehiculos)
    vehiculos.remove("Honda")
    println(vehiculos)
    vehiculos.removeAt(3)
    println(vehiculos)
    vehiculos.removeAt(vehiculos.lastIndex)
    println(vehiculos)
}