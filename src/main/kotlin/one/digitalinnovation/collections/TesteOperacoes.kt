package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)
    for (salario in salarios){println(salario)}

    println("---------------------")
    println("Maior salário: ${salarios.maxOrNull()}") // Mostra o MAIOR salario usando a função maxOrNull
    println("Menor salário: ${salarios.minOrNull()}") // Mostra o MENOR salario usando a função minOrNull
    println("Média salários: ${salarios.average()}") // Mostra a MÉDIA salario usando a função average

    val salariosMarioQue2500 = salarios.filter { it > 2500.0 } // Filter vai criar um array com todos os resultados que foi filtrado
    println("---------------------")
    salariosMarioQue2500.forEach { println(it)}

    println("----------------")
    println(salarios.count { it in 2000.0..5000.0}) // Função count para dar resultado da quantidade de valores que foi encontrado
    println("----------------")
    println(salarios.find { it == 2250.0}) //Find vai imprimir somente o valor que foi resultado da expressão
    println("----------------")
    println(salarios.any { it == 1000.0}) // Any vai dizer se tem ou não qualquer resultado que é igual o resultado da expressão
}