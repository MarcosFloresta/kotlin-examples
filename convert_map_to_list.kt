import java.util.ArrayList
import java.util.HashMap
fun main(args: Array<String>) {
    val map = HashMap<Int, String>()
    map.put(1, "a")
    map.put(2, "b")
    map.put(3, "c")
    map.put(4, "d")
    map.put(5, "e")
    val keyList = ArrayList(map.keys)
    val valueList = ArrayList(map.values)
    println("Key List: $keyList")
    println("Value List: $valueList")
}