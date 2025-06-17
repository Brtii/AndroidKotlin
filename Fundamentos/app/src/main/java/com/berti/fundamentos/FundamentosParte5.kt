package com.berti.fundamentos

fun main (){
    //condicionesIfElse()
    //condicionesIfElse2(15,15)
    ifAnidados()
}

fun condicionesIfElse(){
    //Condicion para obtener mi DPI
    val edadActual:Int = 19
    val edadParaDPI:Int = 18
    if (edadActual >= edadParaDPI){
        println("Ya puedes obtener tu DPI")
    } else{
        println("Deber esperar para tu DPI porque aun tienes $edadActual")
    }

}

//Funciones con el mismo nombre no funcionan, a no ser que una reciba parametros o retorne algo
fun condicionesIfElse2(num1:Int, num2:Int){
    //Comparar 2 numeros
    if (num1 > num2){
        println("$num1 es mayor a $num2")
    }
    else if (num1 == num2){
        println("$num1 es igual a $num2" )
    }
    else{
        println("$num2 es mayor a $num1")
    }

}

fun ifAnidados(){
    val pase1 = true
    val pase2 = true
    val codigo = 12345

    if (pase1 && pase2) {  //Booleanos se toman por defecto true, if boolean = true cuando no se definen en el if
        if (codigo == 123456){
            println("Bienvenido")
        } else {
            println("Código incorrecto")
        }
    } else {
        println("No tienes ningun pase")
    }
}