fun main(args: Array<String>) {
    val base = 3
    val powerRaised = 4
    val result = power(base, powerRaised)
    println("$base^$powerRaised = $result")
}
fun power(base: Int, powerRaised: Int): Int {
    if (powerRaised != 0)
        return base * power(base, powerRaised - 1)
    else
        return 1
}