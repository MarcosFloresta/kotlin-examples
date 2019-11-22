fun main(args: Array<String>) {
    val number = -12.3
    when {
        number < 0.0 -> println("$number is a negative number.")
        number > 0.0 -> println("$number is a positive number.")
        else -> println("$number is 0.")
    }
}