fun main(){

    val h = 21
    val r = 23

    println("Enter operator")
    println("1 : Addition")
    println("2 : Subtraction")
    println("3 : Multiplication")
    println("4 : Division")
    val operator = readLine()

    when (operator) {
        "1" -> println("$h + $r = ${h + r}")
        "2" -> println("$h - $r = ${h - r}")
        "3" -> println("$h * $r = ${h * r}")
        "4" -> println("$h / $r = ${h / r}")
        else -> println("$operator is invalid")
    }
}