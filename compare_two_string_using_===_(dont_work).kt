fun main(args: Array<String>) {
    val style = buildString { "Bold" }
    val style2 = buildString { "Bold" }
    if (style === style2)
        println("Equal")
    else
        println("Not Equal")
}