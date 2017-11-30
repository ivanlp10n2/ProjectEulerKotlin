package excercise_4

fun main(args: Array<String>) {

    val num = 788887q   

    println("El numero $num ${if (checkPalindrome(num)) "es Palindromo" else "No es Palindromo" }")
}

fun checkPalindrome (num : Int) : Boolean {
    val str_num = num.toString()
    val iterations = if (str_num.length % 2 == 0) ((str_num.length) /2) -1  else ((str_num.length -1) /2) -1

    for (i in 0.. iterations){
        if(str_num[i] == str_num[(str_num.length-1)-i])
            println ("El numero ${str_num[i]} es igual a ${str_num[(str_num.length-1)-i]}")
        else return false
    }
    return true

}