import java.util.ArrayList;
import org.apache.commons.collections.ListUtils;
fun main(args: Array<String>) {
    val list1 = ArrayList<String>()
    list1.add("a")
    val list2 = ArrayList<String>()
    list2.add("b")
    val joined = ListUtils.union(list1, list2)
    println("list1: $list1")
    println("list2: $list2")
    println("joined: $joined")
}