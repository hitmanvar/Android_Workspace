fun main()
{

    for(i in 1..5)//row
    {
        var id = i

        for(space in 0..(5-i))
        {
            print(" ")
        }

        for(j in 1..i)

        {

            print ("$id")

            id = id - 1
        }

        println()

    }

}