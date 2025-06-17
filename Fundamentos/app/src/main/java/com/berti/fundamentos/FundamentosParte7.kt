package com.berti.fundamentos

fun main (){
    //cicloFor()
    //cicloFor2()
    //cicloFor3(20)
    //cicloWhile()
    //cicloWhile2(5,100)
    //cicloDoWhile()
    cicloDoWhile2(30,20)
}

                    //CICLO FOR
fun cicloFor(){
    for( i in 1..10 step 2){  //step son saltos que puede hacer un for
        println("Numero $i ")
    }

}

fun cicloFor2(){
    for( i in 1..10){
        if ( i ==2){
            println("Numero $i ")
        }
    }
}

fun cicloFor3(numFinal:Int){
    for (i in 1..numFinal){
        println("Serie No. $i")
    }
}
                    //CICLO WHILE

fun cicloWhile(){
    var contador = 1
    while (contador <= 3){
        println("Contador No. $contador")
        contador++                      //++ es un +1
    }

}

fun cicloWhile2(iniContador:Int, finContador:Int){      // Parametros se consideran val y no var
    var inicio = iniContador        // ya que es val en ningun momento podra cambiar, entonces se crea una var que si va a cambiar con el ++
    while(inicio <= finContador){
        println("Serie No. $inicio")
        inicio++
    }
}

fun cicloDoWhile(){         //No prioriza la condicion, ejecuta el bucle por lo menos 1 vez
    var intentos = 3
    do {
        println("Intento No. $intentos")
        intentos++
    }while (intentos <=2)

}

fun cicloDoWhile2(inicio:Int, fin:Int){
    var i = inicio
    do {
        println("Serie No.$i")
        i++
    }while (i < fin)
}


