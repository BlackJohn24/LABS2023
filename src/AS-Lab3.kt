fun main() {
    print("Введи список сиволов : ")
    val s = readLine()!!.toString()
    println("Ваш список  : $s")
    print("Введи символ для поиска : ")
    val c = readLine()!!.toString()

    var index = s.indexOf(c)
    while (index != s.lastIndex) {
       index = s.indexOf(c, index + 1)
            }
    println("Последний индекс указанного вами элемента $index")
 }

