fun main(args: Array<String>) {
    val n1 = 72
    val n2 = 120
    var gcd = 1
    var i = 1
    while (i <= n1 && i <= n2) {
        // Checks if i is factor of both integers
        if (n1 % i == 0 && n2 % i == 0)
            gcd = i
        ++i
    }
    val lcm = n1 * n2 / gcd
    println("The LCM of $n1 and $n2 is $lcm.")
}