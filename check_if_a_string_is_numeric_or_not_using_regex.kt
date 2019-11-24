fun main(args: Array<String>) {
    val string = "-1234.15"
    var numeric = true
    numeric = string.matches("-?\\d+(\\.\\d+)?".toRegex())
    if (numeric)
        println("$string is a number")
    else
        println("$string is not a number")
}