package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 6, 8, 5, 10, 3) // intArrayOf não precisa declarar o tamanho
    values.sort()

    values.forEach {
        println(it)
    }

}