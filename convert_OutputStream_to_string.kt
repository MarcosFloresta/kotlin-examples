import java.io.*
fun main(args: Array<String>) {
    val stream = ByteArrayOutputStream()
    val line = "Hello there!"
    stream.write(line.toByteArray())
    val finalString = String(stream.toByteArray())
    println(finalString)
}