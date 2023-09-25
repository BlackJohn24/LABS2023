import java.util.*
fun pass(n:Int){
val chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ#@!"
var pass = ""
for (i in 1..n)
pass += chars[Math.floor(Math.random()%Calendar.getInstance().timeInMillis * chars.length).toInt()]
print( " $pass " )
}
fun printer (n:Int) {
    for (j in 0 .. 10) pass(n)
    println()
}
fun main() {
    //print(Calendar.getInstance().timeInMillis)
    print("Введи количество символов в пароле : ")
    val n = readLine()!!.toInt()
    for (j in 0..10) printer(n)

}


