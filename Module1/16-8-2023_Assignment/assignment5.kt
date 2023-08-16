fun main()
{
    print("Enter the dividend")
    val dividend = readLine()?.toIntOrNull() ?: 0

    print("Enter the divisor")
    val divisor = readLine()?.toIntOrNull() ?: 1

    if (divisor != 0) {
        val quotient = dividend / divisor
        val remainder = dividend % divisor

        println("Quotient: $quotient")
        println("Remainder: $remainder")

    }
    else
    {
        println("Division by zero is not allowed.")
    }

}