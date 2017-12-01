package excercise_5


fun main(args: Array<String>) {

    val max_num_multiple = 300L
    var min_mul = 1L
    var primeArray = mutableSetOf<Long>(2)

    if(primeArray.size <= 1)
        primeArray = populatePrimes(max_num_multiple, primeArray)

    for(i in 2L..max_num_multiple)
        if (!primeArray.contains(i)){
            val base = isPotencial(i, primeArray)
            if(base > 0) min_mul *= base
        }

    for (i in primeArray)
        min_mul *= i


    println(min_mul)
}

fun isPotencial (num : Long, primeArray : MutableSet<Long>) : Long
{
    var aux = num
    var result = aux

    val iterateList : Iterator<Long> = primeArray.iterator()
    while(iterateList.hasNext()) {
        val base = iterateList.next()

        while( result % base == 0L)
            result /= base
        if(result == 1L) return base
        else result = aux
    }
    return -1
}

fun populatePrimes(number : Long, primeArray: MutableSet<Long>) : MutableSet<Long> {
    for (n : Long in 3L..number.toInt())
        if(isPrime(n, primeArray))
            primeArray.add(n)
    return primeArray
}

fun isPrime (x:Long, primeArray: MutableSet<Long>) : Boolean {
    val iterateList : Iterator<Long> = primeArray.iterator()
    while(iterateList.hasNext()) {
        val nextElem = iterateList.next()
        if(x.rem(nextElem) == 0L && Math.ceil(Math.sqrt(x.toDouble())) >= nextElem)
            return false
    }
    return true
}