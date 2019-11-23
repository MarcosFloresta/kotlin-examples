fun main(args: Array<String>) {
    val number = 34
    var flag = false
    for (i in 2..number / 2) {
        // condition for i to be a prime number
        if (checkPrime(i)) {
            // condition for n-i to be a prime number
            if (checkPrime(number - i)) {
                // n = primeNumber1 + primeNumber2
                System.out.printf("%d = %d + %d\n", number, i, number - i)
                flag = true
            }
        }
    }
    if (!flag)
        println("$number cannot be expressed as the sum of two prime numbers.")
}
// Function to check prime number
fun checkPrime(num: Int): Boolean {
    var isPrime = true
    for (i in 2..num / 2) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}