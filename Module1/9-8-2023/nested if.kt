fun main() {

    val n1 = -4.5
    val n2 = 5.9
    val n3 = 3.7

    if (n1 >= n2 && n1 >= n3)
        println("$n1 is the largest number.")

    else if (n2 >= n1 && n2 >= n3)
        println("$n2 is the largest number.")

    else
        println("$n3 is the largest number.")

}