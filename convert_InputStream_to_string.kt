import java.io.*
fun main(args: Array<String>) {
    val stream = ByteArrayInputStream("Hello there!".toByteArray())
    val sb = StringBuilder()
    var line: String?
    val br = BufferedReader(InputStreamReader(stream))
    line = br.readLine()
    while (line != null) {
        sb.append(line)
        line = br.readLine()
    }
    br.close()
    println(sb)
}