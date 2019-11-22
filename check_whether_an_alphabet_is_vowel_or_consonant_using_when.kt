fun main(args: Array<String>) {
    val ch = 'z'
    when(ch) {
        'a', 'e', 'i', 'o', 'u' -> println("$ch is vowel")
        else -> println("$ch is consonant")
    }
}
