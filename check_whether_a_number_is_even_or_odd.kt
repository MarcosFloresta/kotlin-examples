import java.util.*
fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    val num = reader.nextInt()
    val evenOdd = if (num % 2 == 0) "even" else "odd"
    println("$num is $evenOdd")
}
