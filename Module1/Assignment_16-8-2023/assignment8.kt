fun main() {
    print("Enter the first number: ")
    val num1 = readLine()?.toIntOrNull() ?: 0

    print("Enter the second number: ")
    val num2 = readLine()?.toIntOrNull() ?: 0

    print("Enter the third number: ")
    val num3 = readLine()?.toIntOrNull() ?: 0

    val max = findMax(num1, num2, num3)

    println("The maximum value is: $max")
}

fun findMax(a: Int, b: Int, c: Int): Int {
    return if (a > b && a > c) {
        a
    } else if (b > c) {
        b
    } else {
        c
    }
}
