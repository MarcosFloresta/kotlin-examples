fun main(args: Array<String>) {
    val octal = 67
    val binary = convertOctalToBinary(octal)
    println("$octal in octal = $binary in binary")
}
fun convertOctalToBinary(octalNumber: Int): Long {
    var octalNumber = octalNumber
    var decimalNumber = 0
    var i = 0
    var binaryNumber: Long = 0
    while (octalNumber != 0) {
        decimalNumber += (octalNumber % 10 * Math.pow(8.0, i.toDouble())).toInt()
        ++i
        octalNumber /= 10
    }
    i = 1
    while (decimalNumber != 0) {
        binaryNumber += (decimalNumber % 2 * i).toLong()
        decimalNumber /= 2
        i *= 10
    }
    return binaryNumber
}
