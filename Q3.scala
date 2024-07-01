object Practical3 extends App {
    def arithmeticMean(num1: Double, num2: Double): Double = {
        (num1 + num2) / 2
    } 

    var mean = arithmeticMean(12.0, 11.0)

    println(f"Mean: $mean%.2f")
}
