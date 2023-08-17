fun main()
{
    print("Enter the first integer: ")
    val firstInput = readLine()?.toIntOrNull() ?: 0

    print("Enter the second integer: ")
    val secondInput = readLine()?.toIntOrNull() ?: 0

    val sum = firstInput + secondInput
    println("Sum of $firstInput and $secondInput is: $sum")
     
}