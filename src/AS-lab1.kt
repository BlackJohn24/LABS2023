import kotlin.math.PI
import kotlin.math.sin
import kotlin.math.sqrt

fun main() {
    catet()
    gepotenusa()
    ploshad()

}
fun catet(){
    print("Введи катет прямоугольного треугольника : ")
    val n = readLine()!!.toInt()
    val g = sqrt(((n*n)+(n*n)).toDouble())
    val s = 0.5*n*n
    println ("Гепотенуза равна: $g")
    println ("Площадь треугольника: $s")
}
fun gepotenusa(){
    print("Введи гепотенузу прямоугольного треугольника : ")
    val m = readLine()!!.toDouble()
    val k = sin(45 * PI / 180)*m
    val s = 0.5*k*k
    println ("Гепотенуза равна: $k")
    println ("Площадь треугольника: $s")
}
fun ploshad(){
    print("Введи площадь прямоугольного треугольника : ")
    val s = readLine()!!.toInt()
    val k = sqrt( s/0.5)
    val g = sqrt(((k*k)+(k*k)).toDouble())
    println ("Катет равен: $k")
    println ("Гепотенуза равна: $g")
}