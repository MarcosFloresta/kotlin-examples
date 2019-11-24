import java.lang.Double.parseDouble
fun main(args: Array<String>) {
    val string = "12345s15"
    var numeric = true
    try {
        val num = parseDouble(string)
    } catch (e: NumberFormatException) {
        numeric = false
    }
    if (numeric)
        println("$string is a number")
    else
        println("$string is not a number")
}