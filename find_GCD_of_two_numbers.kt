fun main(args: Array<String>) {
    var n1 = 81
    var n2 = 153
    while (n1 != n2) {
        if (n1 > n2)
            n1 -= n2
        else
            n2 -= n1
    }
    println("G.C.D = $n1")
}