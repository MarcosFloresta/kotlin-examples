fun main(args: Array<String>) {
    val binary: Long = 101001
    val octal = convertBinarytoOctal(binary)
    println("$binary in binary = $octal in octal")
}
fun convertBinarytoOctal(binaryNumber: Long): Int {
    var binaryNumber = binaryNumber
    var octalNumber = 0
    var decimalNumber = 0
    var i = 0
    while (binaryNumber.toInt() != 0) {
        decimalNumber += (binaryNumber % 10 * Math.pow(2.0, i.toDouble())).toInt()
        ++i
        binaryNumber /= 10
    }
    i = 1
    while (decimalNumber != 0) {
        octalNumber += decimalNumber % 8 * i
        decimalNumber /= 8
        i *= 10
    }
    return octalNumber
}