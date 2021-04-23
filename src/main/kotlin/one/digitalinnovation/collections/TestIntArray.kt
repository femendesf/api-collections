package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5) // Sempre declarar o tamanho do IntArray

    values[0] = 5
    values[1] = 8
    values[2] = 2
    values[3] = 4
    values[4] = 7

    println("For")
    for (valor in values){
        println(valor)
    }
    println("***************************")
    println("ForEach")
    values.forEach {
        println(it)
    }
    println("***************************")
    println("For para os indices '.indices'")
    for(index in values.indices){
        println(values[index]) // Vai imprimir o valor armazenado dentro do indice
    }

    println("***************************")
    values.sort() // Função que vai organizar a lista em ordem crescente
    values.forEach {
        println(it)
    }

}