fun main(args: Array<String>) {
    val decimal = 78
    val octal = convertDecimalToOctal(decimal)
    println("$decimal in decimal = $octal in octal")
}
fun convertDecimalToOctal(decimal: Int): Int {
    var decimal = decimal
    var octalNumber = 0
    var i = 1
    while (decimal != 0) {
        octalNumber += decimal % 8 * i
        decimal /= 8
        i *= 10
    }
    return octalNumber
}