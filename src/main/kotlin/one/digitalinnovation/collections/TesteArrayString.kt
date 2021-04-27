package one.digitalinnovation.collections

fun main() {
    val nome = Array(5) {""} //Array de String

    nome[0] = "Felipe"
    nome[1] = "Gabrielle"
    nome[2] = "Fatima"
    nome[3] = "Jose"
    nome[4] = "Maria"

    for(nomes in nome){
        println(nomes)
    }
    println("----------------------")
    nome.sort()
    nome.forEach{println(it)}

    val nomes2 = arrayOf("Gaules", "Liminha", "Alanzoka")
    println("----------------------")
    nomes2.sort()
    nomes2.forEach{println(it)}
}