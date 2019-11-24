fun main(args: Array<String>) {
    val rows = 4
    var number = 1
    for (i in 1..rows) {
        for (j in 1..i) {
            print("$number ")
            ++number
        }
        println()
    }
}