fun main() {
    print("Введи количество символов n : ")
    val n = readLine()!!.toInt()
    println("Вы ввели n = $n")
    print("Введи число a : ")
    val a = readLine()!!.toDouble()
    println("Ваше число a = $a")
    var x = 0.0
    val s = (1/a)+(1/(a+1))
    //println("$s")
    for (i in 2 .. n ) {
        x = (x + s * (1 / (a + i)))
        }
          println("$x")
}
