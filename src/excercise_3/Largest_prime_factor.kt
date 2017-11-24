package excercise_3


fun main(args: Array<String>) {


    var primeNumbersList : MutableList<Int> = mutableListOf(2)
    var auxPrimeNumberList : List<Int> = listOf()
    val number  = 10

    val root = Math.sqrt(number.toDouble())
    println(root)

    while (root > primeNumbersList.last())
    {
        if ( )
    }

    for( i in 3..number) {
        if(root > primeNumbersList.last()){
            println(primeNumbersList.last())
            for (item: Int in primeNumbersList) {
                if (i % item != 0){
                    println(i)
//                    if( i % primeNumbersList.last() != 0)
//                        primeNumbersList.add(i)
                }else break
            }

        }

    }




    println("La lista contiene $primeNumbersList")

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