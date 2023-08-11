fun main()
{
    println("Enter the number of terms for Fibonacci series:")
    val n = readLine()!!.toInt()

    var first = 0
    var second = 1

    print("Fibonacci Series up to $n terms: $first, $second")

    for (i in 3..n)
    
    {
        val next = first + second

        print(", $next")
        first = second
        second = next

    }

}