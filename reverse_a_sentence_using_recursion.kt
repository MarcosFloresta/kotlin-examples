fun main(args: Array<String>) {
    val sentence = "Go work"
    val reversed = reverse(sentence)
    println("The reversed sentence is: $reversed")
}
fun reverse(sentence: String): String {
    if (sentence.isEmpty())
        return sentence
    return reverse(sentence.substring(1)) + sentence[0]
}