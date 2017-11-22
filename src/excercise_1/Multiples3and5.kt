package excercise_1

fun main(args: Array<String>) {

    var sum : Int = 0

    for (i in 0..999){
        if ((i % 3 == 0) || (i % 5 == 0))
        {
            println(i)
            sum += i
        }
    }

    println(sum)

}