fun main(args: Array<String>) {
    var low = 20
    val high = 50
    while (low < high) {
        if (checkPrimeNumber(low))
            print(low.toString() + " ")
        ++low
    }
}
fun checkPrimeNumber(num: Int): Boolean {
    var flag = true
    for (i in 2..num / 2) {
        if (num % i == 0) {
            flag = false
            break
        }
    }
    return flag
}