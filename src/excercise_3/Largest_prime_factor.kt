package excercise_3


fun main(args: Array<String>) {

    var primeNumbersList : MutableList<Long> = mutableListOf(2)
    val number  = 600851475143L

    var thereIsNoPrimeNumber = true
    var divisor = 2L
    var remainder : Long

    var factor : Long = 0

    while (thereIsNoPrimeNumber)
    {
        remainder = number.rem(divisor)
        if(remainder == 0L){
            factor= number/divisor
            println("Factor actual = $factor")
            if(primeNumbersList.size <= 1)
            //Completa los primos < sqrt(number) en la lista
                primeNumbersList = populatePrimes(factor, primeNumbersList)

            thereIsNoPrimeNumber = !isPrime(factor, primeNumbersList)
        }
        divisor++
    }

    println("Bien papu, lo lograste. Sos crack!!! \n El número es ${number / divisor}")

}

fun populatePrimes(number : Long, primeArray: MutableList<Long>) : MutableList<Long> {
    val root = Math.ceil(Math.sqrt(number.toDouble()))
    for (n : Long in 3L..root.toInt())
        if(isPrime(n, primeArray))
            primeArray.add(n)
    return primeArray
}

fun isPrime (x:Long, primeArray: MutableList<Long>) : Boolean {
    val iterateList : Iterator<Long> = primeArray.iterator()
    while(iterateList.hasNext()) {
        val nextElem = iterateList.next()
        if(x.rem(nextElem) == 0L && Math.ceil(Math.sqrt(x.toDouble())) > nextElem)
            return false
    }
    return true
}