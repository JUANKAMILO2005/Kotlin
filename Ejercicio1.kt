/* Algoritmo que calcule solicite el nombre y la materia de un estudiante, así como 3 notas parciales y con esto calcule el
promedio de notas, valide que si el estudiante saca un promedio menor que 3.5 entonces indique que el estudiante perdió la
materia, el mensaje deberá mencionar el nombre y la materia del estudiante  */

fun main() {
    println("Ingrese el nombre del estudiante: ")
    val nombre = readLine()!!
    println("Ingrese el nombre de la materia: ")
    val materia = readLine()!!
    println("Ingrese la primer nota: ")
    val nota1 = readLine()!!.toFloat()
    println("Ingrese la segunda nota: ") 
    val nota2 = readLine()!!.toFloat()
    println("Ingrese la tercer nota: ")
    val nota3 = readLine()!!.toFloat()
    val prom = (nota1 + nota2 + nota3) / 3
    println("El promedio de las notas es: $prom")
    if(prom < 3.5)
    println("El estudiante $nombre perdio la materia $materia")
}