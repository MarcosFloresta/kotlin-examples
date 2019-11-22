fun main(args: Array<String>) {
    val n1 = -4.5
    val n2 = 3.9
    val n3 = 5.5
    when {
        n1 >= n2 && n1 >= n3 -> println("$n1 is the largest number.")
        n2 >= n1 && n2 >= n3 -> println("$n2 is the largest number.")
        else -> println("$n3 is the largest number.")
    }
}