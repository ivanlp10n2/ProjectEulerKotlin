import excercise_3.populatePrimes

fun main(args: Array<String>) {

//    val max_mult = 30
//    var iteracion = 0
//    var hayMultiplo = false
//    var actualNum = max_mult
//
//    while (!hayMultiplo) {
//        if (isDivisible(max_mult, actualNum))
//           hayMultiplo = true
//        else
//            actualNum += max_mult
//
//    }

    val max_mul = 9
    var primeNumbersList : MutableList<Long> = mutableListOf(2)

    primeNumbersList = populatePrimes(19L, primeNumbersList)
}

fun isDivisible (maxNum : Int, numAct : Int) : Boolean
{
    for (i in maxNum downTo 1)
        if (numAct % i != 0) return false
    return true
}

