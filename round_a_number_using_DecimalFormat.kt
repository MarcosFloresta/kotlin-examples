import java.math.RoundingMode
import java.text.DecimalFormat
fun main(args: Array<String>) {
    val num = 1.34567
    val df = DecimalFormat("#.###")
    df.roundingMode = RoundingMode.CEILING
    println(df.format(num))
}