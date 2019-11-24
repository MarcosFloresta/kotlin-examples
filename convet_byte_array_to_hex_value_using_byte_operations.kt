import kotlin.experimental.and
private val hexArray = "0123456789ABCDEF".toCharArray()
fun bytesToHex(bytes: ByteArray): String {
    val hexChars = CharArray(bytes.size * 2)
    for (j in bytes.indices) {
        val v = (bytes[j] and 0xFF.toByte()).toInt()
        hexChars[j * 2] = hexArray[v ushr 4]
        hexChars[j * 2 + 1] = hexArray[v and 0x0F]
    }
    return String(hexChars)
}
fun main(args: Array<String>) {
    val bytes = byteArrayOf(10, 2, 15, 11)
    val s = bytesToHex(bytes)
    println(s)
}