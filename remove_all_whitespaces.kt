fun main(args: Array<String>) {
    var sentence = "T    his is b  ett     er."
    println("Original sentence: $sentence")
    sentence = sentence.replace("\\s".toRegex(), "")
    println("After replacement: $sentence")
}