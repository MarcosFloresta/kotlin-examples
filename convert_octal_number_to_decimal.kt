fun main(args: Array<String>) {
    val octal = 116
    val decimal = convertOctalToDecimal(octal)
    println("$octal in octal = $decimal in decimal")
}
fun convertOctalToDecimal(octal: Int): Int {
    var octal = octal
    var decimalNumber = 0
    var i = 0
    while (octal != 0) {
        decimalNumber += (octal % 10 * Math.pow(8.0, i.toDouble())).toInt()
        ++i
        octal /= 10
    }
    return decimalNumber
}