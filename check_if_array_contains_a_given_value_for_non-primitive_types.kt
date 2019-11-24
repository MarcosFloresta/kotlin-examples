import java.util.Arrays
fun main(args: Array<String>) {
    val strings = arrayOf("One", "Two", "Three", "Four", "Five")
    val toFind = "Four"
    val found = Arrays.stream(strings).anyMatch { t -> t == toFind }
    if (found)
        println("$toFind is found.")
    else
        println("$toFind is not found.")
}