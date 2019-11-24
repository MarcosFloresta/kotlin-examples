import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.util.Arrays
fun main(args: Array<String>) {
    val path = System.getProperty("user.dir") + "\\src\\test.txt"
    try {
        val encoded = Files.readAllBytes(Paths.get(path))
        println(Arrays.toString(encoded))
    } catch (e: IOException) {
    }
}