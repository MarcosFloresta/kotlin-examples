import java.util.*
fun main(args: Array<String>) {
    val array = arrayOf("a", "b", "c")
    val set = HashSet(Arrays.asList(*array))
    println("Set: $set")
}