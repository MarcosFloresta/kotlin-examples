fun main(args: Array<String>) {
    val str1: String? = null
    val str2 = "   "
    if (isNullOrEmpty(str1))
        println("str1 is null or empty.")
    else
        println("str1 is not null or empty.")
    if (isNullOrEmpty(str2))
        println("str2 is null or empty.")
    else
        println("str2 is not null or empty.")
}
fun isNullOrEmpty(str: String?): Boolean {
    if (str != null && !str.trim().isEmpty())
        return false
    return true
}
