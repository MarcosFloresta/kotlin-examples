fun main(args: Array<String>) {
    val c = 'a'
    if (c in 'a'..'z' || c in 'A'..'Z')
        println("$c is an alphabet.")
    else
        println("$c is not an alphabet.")
}