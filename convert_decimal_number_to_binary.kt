fun main(args: Array<String>) {
    val num = 19
    val binary = convertDecimalToBinary(num)
    println("$num in decimal = $binary in binary")
}
fun convertDecimalToBinary(n: Int): Long {
    var n = n
    var binaryNumber: Long = 0
    var remainder: Int
    var i = 1
    var step = 1
    while (n != 0) {
        remainder = n % 2
        System.out.printf("Step %d: %d/2, Remainder = %d, Quotient = %d\n", step++, n, remainder, n / 2)
        n /= 2
        binaryNumber += (remainder * i).toLong()
        i *= 10
    }
    return binaryNumber
}