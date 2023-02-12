/* Haga un algoritmo que solicite un número y si este es negativo lo convierta a positivo y lo imprima, realice este proceso
n cantidad de veces. */

fun main(){
    var numero: Int
    var continuar = "si"
    do{
        print("Ingrese un numero: ")
        numero = readLine()!!.toInt()
        if(numero < 0){
            numero =  numero * -1
        }
        println("El numero positivo es: $numero")
        print("¿Desea ingresar otro numero? (si/no): ")
        continuar = readLine()!!
    } while (continuar.uppercase() == "SI")
}