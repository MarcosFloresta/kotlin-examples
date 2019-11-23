fun main(args: Array) {
    val number = 1634
    var originalNumber: Int
    var remainder: Int
    var result = 0
    var n = 0
    originalNumber = number
    while (originalNumber != 0) {
        originalNumber /= 10
        ++n
    }
    originalNumber = number
    while (originalNumber != 0) {
        remainder = originalNumber % 10
        result += Math.pow(remainder.toDouble(), n.toDouble()).toInt()
        originalNumber /= 10
    }
    if (result == number)
        println("$number is an Armstrong number.")
    else
        println("$number is not an Armstrong number.")
}
