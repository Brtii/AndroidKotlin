package com.berti.fundamentos

fun main(){
    //Funcion simple:
    hola()
    //Funcion con parametros:
    unirNombreYApellido("Otto", "Temaj")
    //Funcion con variables como parametros
    var nombre: String= "Juana"
    var apellido: String= "D' Arc"
    unirNombreYApellido(nombre, apellido)
    //Funcion con retorno
    println(miNumeroPi())

    var myPi = miNumeroPi()
    println(myPi)

    println(myPi * 100)

    //Funcion con parametros y retorno
    val resultado = sumarDosNumeros(5,5) //Funcion con argumentos
    println("la suma es $resultado")
    var n1= 6
    var n2= 6
    println("la suma es ${sumarDosNumeros(n1,n2)}")
}
                    //FUNCIONES PROPIAS

        //simples
        fun hola(){
            println("Hola!")
        }
        //palabra reservada fun - define una funcino
        //hola es el nombre o identificador de la funcion
        // () apartado de parametrizacion
        // : Retorno  es el tipo de valor a retornar
        //{} el cuerpo de la funcion


        //con parametros
        fun unirNombreYApellido(nombre: String, apellido: String){
            val union: String= "$nombre $apellido"
            println(union)
        }


        //con retorno
        fun miNumeroPi(): Double{  // :Double es el tipo de valor a retornar
            val myPi:Double = 3.14
            return myPi
        }


        //con parametros y retorno
        fun sumarDosNumeros(num1:Int, num2:Int):Int {
            var suma = num1+num2
            return suma
        }
