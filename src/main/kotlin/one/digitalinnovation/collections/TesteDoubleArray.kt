package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(1.500,2.850, 3.750, 8.980)
    val salarios1 = doubleArrayOf(2.850, 1.100, 9.650)

    salarios.forEach{println(it)}
    println("---------------------")
    salarios1.forEach{println(it)}

    val salarios2 = DoubleArray(3)
    salarios2[0] = 8.500
    salarios2[1] = 4.750
    salarios2[2] = 5.755
    println("---------------------")
    salarios2.forEach{println(it)}

    salarios.forEachIndexed { index, salario -> //For para cada indice e valor
        salarios[index] = salario * 1.1
    }

    println("---------------------")
    salarios.forEach{println(it)}
}