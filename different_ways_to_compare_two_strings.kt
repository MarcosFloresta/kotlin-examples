fun main(args: Array<String>) {
    val style = buildString { "Bold" }
    val style2 = buildString { "Bold" }
    var result = style.equals("Bold") // true
    println(result)
    result = style2 === "Bold" // false
    println(result)
    result = style === style2 // false
    println(result)
    result = "Bold" === "Bold" // true
    println(result)
}