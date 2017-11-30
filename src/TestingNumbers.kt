fun main(args: Array<String>) {

    val max_mult = 9
    var iteracion = 0
    for (n in max_mult downTo 1){
        for (i in max_mult downTo max_mult - iteracion)
            println("$n * $i")
       iteracion++
    }

}
