import java.util.stream.IntStream
fun main(args: Array<String>) {
    val num = intArrayOf(1, 2, 3, 4, 5)
    val toFind = 7
    val found = IntStream.of(*num).anyMatch { n -> n == toFind }
    if (found)
        println("$toFind is found.")
    else
        println("$toFind is not found.")
}