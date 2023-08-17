fun main()
{

    print("Enter a character: ")
    val charInput = readLine()?.get(0) ?: ' '

    val asciiValue = charInput.toInt()
    println("ASCII value of '$charInput' is: $asciiValue")
    
} 