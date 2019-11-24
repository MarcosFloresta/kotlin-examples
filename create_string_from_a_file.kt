import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Paths
fun main(args: Array<String>) {
    val path = System.getProperty("user.dir") + "\\src\\test.txt"
    val encoding = Charset.defaultCharset()
    val encoded = Files.readAllBytes(Paths.get(path))
    val lines = String(encoded, encoding)
    println(lines)
}