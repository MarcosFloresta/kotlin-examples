class Complex(internal var real: Double, internal var imag: Double)
fun main(args: Array<String>) {
    val n1 = Complex(2.3, 4.5)
    val n2 = Complex(3.4, 5.0)
    val temp: Complex
    temp = add(n1, n2)
    System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag)
}
fun add(n1: Complex, n2: Complex): Complex {
    val temp = Complex(0.0, 0.0)
    temp.real = n1.real + n2.real
    temp.imag = n1.imag + n2.imag
    return temp
}