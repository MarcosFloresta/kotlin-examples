fun main(args: Array<String>) {
    val num = 33
    var i = 2
    var flag = false
    while (i <= num / 2) {
        // condition for nonprime number
        if (num % i == 0) {
            flag = true
            break
        }
        ++i
    }
    if (!flag)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}