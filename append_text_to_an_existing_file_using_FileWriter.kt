import java.io.FileWriter
import java.io.IOException
fun main(args: Array<String>) {
    val path = System.getProperty("user.dir") + "\\src\\test.txt"
    val text = "Added text"
    try {
        val fw = FileWriter(path, true)
        fw.write(text)
        fw.close()
    } catch (e: IOException) {
    }
}