package com.berti.fundamentos

fun main(){
    //condiWhen()
    condiWhen2(2)
    if(condiWhen3() == 1){
        println("Es una unidad")
    } else if (condiWhen3() == 10) // si el resultado del if o else if es una sola linea no necesita llaves
        println("Es una decena")
    else if (condiWhen3() == 100)
        println("Es una centena")
    else
        println("No hay information")

}


fun condiWhen(){
    //Conocer dias de la semana por su numero
    val dia = 40
    when(dia){
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")
        else -> println("Numero de dia incorrecto")
    }
}

fun condiWhen2(nota:Int?){
    //Analizar la nota de un estudiante
    if (nota == null){
        println("Nota es nula")
    } else{
        val resultado = when(nota){
            in 0 .. 5 -> "Reprobado" // in para definir rangos
            6,7 -> "Regular"
            8,9 -> "Bueno"
            10 -> "Excelente"
            else -> "Nota  inválida"
        }
        println(resultado)
    }
}

fun condiWhen3():Int {
    //Reconocer unidades decenas y centenas
    val x = 10
    val retorno = when(x){
        in 0 .. 9 -> 1
        in 10 .. 99 -> 10
        in 100 .. 999 -> 100
        else -> 0
    }
    return retorno
}