import java.io.PrintWriter
import java.io.StringWriter
fun main(args: Array<String>) {
    try {
        val division = 0 / 0
    } catch (e: ArithmeticException) {
        val sw = StringWriter()
        e.printStackTrace(PrintWriter(sw))
        val exceptionAsString = sw.toString()
        println(exceptionAsString)
    }
}