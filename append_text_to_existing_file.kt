import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
fun main(args: Array<String>) {
    val path = System.getProperty("user.dir") + "\\src\\test.txt"
    val text = "Added text"
    try {
        Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.APPEND)
    } catch (e: IOException) {
    }
}