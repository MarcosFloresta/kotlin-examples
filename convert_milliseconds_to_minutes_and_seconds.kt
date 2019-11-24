fun main(args: Array<String>) {
    val milliseconds: Long = 1000000
    val minutes = milliseconds / 1000 / 60
    val seconds = milliseconds / 1000 % 60
    println("$milliseconds Milliseconds = $minutes minutes and $seconds seconds.")
}