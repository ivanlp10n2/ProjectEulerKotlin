package excercise_3


fun main(args: Array<String>) {


    var primeNumbersList : Set<Int> = setOf(1,2)

    val number = 10

    var elem: Int
    var iterator = primeNumbersList.iterator()

    for( i in 1..number)
    {
        while (iterator.hasNext()){
            elem = 
        }
    }
}

fun isPrime (x:Int, primeArray: MutableList<Int>) : Boolean
{
    val iterateList = primeArray.iterator()
    while(iterateList.hasNext())
    {
        println(iterateList.next())
        if(iterateList.next() % x == 0) return true
    }
    primeArray.add(x)
    return false
}