fun main(args: Array<String>) {
    val bytes = byteArrayOf(10, 2, 15, 11)
    for (b in bytes) {
        val st = String.format("%02X", b)
        print(st)
    }
}