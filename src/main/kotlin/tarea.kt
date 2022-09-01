import kotlin.math.hypot
import kotlin.math.pow

fun main() {
    ejercicio1()
    ejercicio2()
    ejercicio3()
    ejercicio4()
    ejercicio5()
    ejercicio6()
    ejercicio7()
    ejercicio8()
    ejercicio9()
    ejercicio10()
    ejercicio11()
    ejercicio12()
    ejercicio13()
    ejercicio14()
    ejercicio15()
    ejercicio16()
}

const val PI = 3.1416

fun ejercicio1() {
    println("1. Pedir 2 numeros al usuario y sumarlos, restarlos, multiplicarlos y dividirlos.\n")

    var primerNumero: Int = 0
    var segundoNumero: Int = 0

    print("Ingrese primer numero: ")
    primerNumero = readLine()!!.toInt()
    print("Ingrese segundo numero: ")
    segundoNumero = readLine()!!.toInt()

    println("Suma: ${primerNumero+segundoNumero}")
    println("Resta: ${primerNumero-segundoNumero}")
    println("Multiplicacion: ${primerNumero*segundoNumero}")
    if (segundoNumero != 0){
        println("División: ${primerNumero.toDouble()/segundoNumero.toDouble()}")
    } else {
        println("No se puede dividir entre 0")
    }
}
fun ejercicio2() {
    println("\n2. Convertir Grados Celsius a Grados Fahrenheit (Propuesto)\n")

    var Celsius: Int = 0

    print("Ingrese la temperatura en Grados Celsius: ")
    Celsius = readLine()!!.toInt()

    println("La temperatura en Grados Fahrenheit es ${(9*Celsius)/5+32}°F")
}
fun ejercicio3() {
    println("\n3. Sacar la hipotenusa de un triángulo rectángulo, pidiendo al usuario el valor de los 2 catetos\n")

    var primerCateto: Double = 0.0
    var segundoCateto: Double = 0.0

    print("Ingrese el primer cateto: ")
    primerCateto = readLine()!!.toDouble()
    print("Ingrese el segundo cateto: ")
    segundoCateto = readLine()!!.toDouble()

    println("La hipotenusa es: ${Math.pow(Math.pow(primerCateto,2.0)+Math.pow(segundoCateto,2.0),(1.0/2.0))}")
}
fun ejercicio4() {
    println("\n4. Hacer un Programa que calcule longitudes de Circunferencia. (Propuesto)\n")

    var radio: Double = 0.0

    print("Ingrese el Radio de la Circunferencia: ")
    radio = readLine()!!.toDouble()

    println("La Longitud es: ${2*PI*radio}")
}
fun ejercicio5() {
    println("\n5. Hacer un Programa que calcule áreas de trapecios\n")

    var baseMayor: Int = 0
    var baseMenor: Int = 0
    var altura: Int = 0

    print("Ingrese base mayor: ")
    baseMayor = readLine()!!.toInt()
    print("Ingrese base menor: ")
    baseMenor = readLine()!!.toInt()
    print("Ingrese altura: ")
    altura = readLine()!!.toInt()
    println("El area del trapecio es: ${((baseMayor+baseMenor)/2)*altura}")
}
fun ejercicio6() {
    println("\n6. Calcule la media aritmética de 3 números cualesquiera (Propuesto)\n")

    var numero1: Int = 0
    var numero2: Int = 0
    var numero3: Int = 0

    print("Ingrese primer numero: ")
    numero1 = readLine()!!.toInt()
    print("Ingrese segundo numero: ")
    numero2 = readLine()!!.toInt()
    print("Ingrese tercer numero: ")
    numero3 = readLine()!!.toInt()

    println("La media Aritmetica es: ${(numero1+numero2+numero3)/3}")
}
fun ejercicio7() {
    println("\n7. Una tienda ofrece un descuento sobre el total de la compra y un cliente\n" +
            "desea saber cuánto deberá pagar finalmente por su compra.\n")

    var precioDelProducto: Double = 0.0
    var descuentoDelproducto: Double = 0.0
    var precioFinal: Double = 0.0

    print("Ingrese precio del producto: ")
    precioDelProducto = readLine()!!.toDouble()
    print("Ingrese Descuento: ")
    descuentoDelproducto = readLine()!!.toDouble()

    descuentoDelproducto = (descuentoDelproducto/100)*precioDelProducto
    println("El descuento es: $descuentoDelproducto")

    precioFinal = precioDelProducto-descuentoDelproducto
    println("El Precio final del producto es: $precioFinal")
}
fun ejercicio8() {
    println("\n8. Dadas las horas trabajadas de una persona y el valor por hora. Calcular su\n" +
            "salario e imprimirlo (Propuesto)\n")

    var horasDeTrabajo: Int = 0
    var valorPorHora: Int = 0

    print("Ingrese horas de trabajo: ")
    horasDeTrabajo = readLine()!!.toInt()
    print("Ingrese valor por hora: ")
    valorPorHora = readLine()!!.toInt()

    println("El Salario es: ${valorPorHora*horasDeTrabajo}")
}
fun ejercicio9() {
    println(
        "\n9. Calcular el nuevo salario de un obrero si obtuvo un incremento en porcentaje\n" +
                "sobre su salario anterior.\n"
    )

    var salario: Double = 0.0
    var incremento: Double = 0.0

    print("Ingrese salario: ")
    salario = readLine()!!.toDouble()
    print("Ingrese Incremento: ")
    incremento = readLine()!!.toDouble()

    incremento = (incremento/100)*salario
    println("El Incremento es: $incremento")

    println("El Salario actual es: ${salario+incremento}")
}
fun ejercicio10() {
    println(
        "\n10. Un alumno desea saber cual sera su calificación final en la materia de\n" +
                "Algoritmos. Dicha calificacion se compone de los siguientes porcentajes:\n" +
                "55% del promedio de sus tres calificaciones parciales.\n" +
                "30% de la calificacion del examen final.\n" +
                "15% de la calificacion de un trabajo final. (Propuesto)\n"
    )

    var promedioParcial: Double = 0.0
    var examenFinal: Double = 0.0
    var tareaFinal: Double = 0.0

    print("Ingrese promedio de calificaciones parciales: ")
    promedioParcial= readLine()!!.toDouble()
    print("Ingrese examen final: ")
    examenFinal = readLine()!!.toDouble()
    print("Ingrese trabajo final: ")
    tareaFinal = readLine()!!.toDouble()

    println("La Calificacion final es: ${(0.55*promedioParcial)+(0.30*examenFinal)+(0.15*tareaFinal)}")
}
fun ejercicio11() {
    println(
        "\n11. Calcular la cantidad de segundos que están incluidos en el número de horas,\n" +
                "minutos y segundos ingresados por el usuario.\n"
    )

    var horas: Int = 0
    var minutos: Int = 0
    var segundos: Int = 0

    print("Ingrese horas: ")
    horas = readLine()!!.toInt()
    print("Ingrese minutos: ")
    minutos = readLine()!!.toInt()
    print("Ingrese segundos: ")
    segundos = readLine()!!.toInt()

    println("Cantidad de segundos: ${(3600*horas)+(60*minutos)+segundos}")
}
fun ejercicio12() {
    println(
        "\n12. Hacer un Programa que obtenga la media geométrica de tres numeros.\n" +
                "(Propuesto)\n"
    )

    var numeroA: Double = 0.0
    var numeroB: Double = 0.0
    var numeroC: Double = 0.0

    print("Ingrese primer numero: ")
    numeroA = readLine()!!.toDouble()
    print("Ingrese segundo numero: ")
    numeroB = readLine()!!.toDouble()
    print("Ingrese tercer numero: ")
    numeroC = readLine()!!.toDouble()

    // "cbrt" = cubic root (raiz cúbica)
    println("La media Geometrica es: ${Math.cbrt(numeroA*numeroB*numeroC)}") //${Math.pow((numeroA*numeroB*numeroC),1.0/3.0)}")
}
fun ejercicio13() {
    println("\n13. Un maestro desea saber que porcentaje de hombres y que porcentaje de\n" +
            "mujeres hay en un grupo de estudiantes.\n")

    var estudiantesHombres: Int = 0
    var estudiantesMujeres: Int = 0
    var total: Double = 0.0

    print("Ingrese numero de estudiantes hombres: ")
    estudiantesHombres = readLine()!!.toInt()
    print("Ingrese numero de estudiantes mujeres: ")
    estudiantesMujeres = readLine()!!.toInt()

    total = (estudiantesHombres+estudiantesMujeres).toDouble()
    println("El total de alumnos es: ${total.toInt()}")
    println("El porcentaje de hombres es: ${(estudiantesHombres/total)*100}%")
    println("El porcentaje de mujeres es: ${(estudiantesMujeres/total)*100}%")
}
fun ejercicio14() {
    println("\n14. Volumen y Área de un Cubo (Propuesto)\n")

    var arista: Double = 0.0

    print("Ingrese arista de un cubo: ")
    arista = readLine()!!.toDouble()

    println("El Area de un cubo: ${6*Math.pow(arista,2.0)}")
    println("El volumen de un cubo es: ${Math.pow(arista,3.0)}")
}
fun ejercicio15() {
    println("\n15. Tres personas deciden invertir su dinero para fundar un empresa. Cada una de\n" +
            "ellas invierte una cantidad distinta. Obtener el porcentaje que cada quien invierte\n" +
            "con respecto a la cantidad total invertida.\n")

    var cantidad1: Double = 0.0
    var cantidad2: Double = 0.0
    var cantidad3: Double = 0.0
    var total: Double = 0.0

    print("Ingrese Cantidad 1: ")
    cantidad1 = readLine()!!.toDouble()
    print("Ingrese Cantidad 2: ")
    cantidad2 = readLine()!!.toDouble()
    print("Ingrese Cantidad 3: ")
    cantidad3 = readLine()!!.toDouble()
    total = cantidad1+cantidad2+cantidad3
    println("El total de inversion: ${total.toInt()}")

    println("Porcentaje de la primera inversion: ${(cantidad1/total)*100}%")
    println("Porcentaje de la segunda inversion: ${(cantidad2/total)*100}%")
    println("Porcentaje de la tercera inversion: ${(cantidad3/total)*100}%")
}
fun ejercicio16() {
    println("\n16. Volumen y Área de una Esfera. (Propuesto)\n")

    var radio: Double = 0.0

    print("Ingrese radio de la circunferencia: ")
    radio = readLine()!!.toDouble()
    println("El Area de la circunferencia es: ${((Math.pow(radio,2.0))*PI)*4}")
    println("El volumen de la circunferencia es: ${((Math.pow(radio,3.0))*PI)*4/3}")
}
