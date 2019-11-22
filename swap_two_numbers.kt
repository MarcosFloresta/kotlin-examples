fun main(args: Array<String>) {
    var first = 12.0f
    var second = 24.5f
    println("--Before swap--")
    println("First number = $first")
    println("Second number = $second")
    first = first - second
    second = first + second
    first = second - first
    println("--After swap--")
    println("First number = $first")
    println("Second number = $second")
}