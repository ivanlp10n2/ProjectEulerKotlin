package excercise_4

fun main(args: Array<String>) {

    val max_mult = 999L
    var iteracion = 0L
    for (n in max_mult downTo 1){
        for (i in max_mult downTo max_mult - iteracion)
            if (checkPalindrome(n*i)) println("$n * $i generan un palíndromo de ${n*i}")
        iteracion++
    }
//
//    for (i in 10 downTo 1)
//        for(n in 10 downTo 1) {
//            val num = n*i
//            println("El numero $num ${if (checkPalindrome(num)) "es Palindromo" else "No es Palindromo" }")
//        }


    val num = 788887


}

fun checkPalindrome (num : Long) : Boolean {
    val str_num = num.toString()
    val iterations = if (str_num.length % 2 == 0) ((str_num.length) /2) -1  else ((str_num.length -1) /2) -1

    for (i in 0.. iterations)
        if(str_num[i] != str_num[(str_num.length-1)-i]){
            return false
//        if(str_num[i] == str_num[(str_num.length-1)-i])
//            println ("El numero ${str_num[i]} es igual a ${str_num[(str_num.length-1)-i]}")
//        else return false
    }
    return true

}