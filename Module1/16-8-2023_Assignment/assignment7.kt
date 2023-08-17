fun main()
{
    val str = "My Name Is Hit"
    val ch = 'H'
    var frequency = 0

    for (i in 0..str.length - 1)
    {
        if (ch == str[i]) {
            ++frequency
        }
    }

    println("Frequency of $ch = $frequency")
} 