fun main(args: Array<String>) {
    val c = '*'
    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
        println("$c is an alphabet.")
    else
        println("$c is not an alphabet.")
}