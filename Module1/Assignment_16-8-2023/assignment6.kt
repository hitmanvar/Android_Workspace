fun main()
{
    print("Enter an integer: ")
    val num = readLine()?.toIntOrNull() ?: 0

    if (num % 2 == 0) {
        println("$num is even.")
    } else
    {
        println("$num is odd.")
    }
}