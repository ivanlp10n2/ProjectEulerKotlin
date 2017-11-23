package excercise_2

fun main(args: Array<String>) {

    var fibonacci_sum = 1
    var fibonacci_even_sum = 0

    var first = 1
    var second = 1

    /*Probably not the best solution, but it works*/

    while ( fibonacci_sum < 4000000 )
    {
        println(fibonacci_sum)
        if (fibonacci_sum % 2 == 0) fibonacci_even_sum += fibonacci_sum
        fibonacci_sum = first + second
        first = second
        second = fibonacci_sum
    }

    println("The result is " + fibonacci_even_sum)


}