import java.math.*
import java.time.Duration

fun main() {
    var x:Double = 1.0
    var y:Double = 1.0
    var a:Double = 0.0
    var b:Double = 0.0
    val mas1 = mutableListOf<Double>()
    val mas2 = mutableListOf<Double>()
    for(i in 2 ..18){
    a = x+y/(i*i)
    b = y+(x/i)
    mas1.add(a)
    mas2.add (b)
    x = a
    y = b
    }
    print ("X8 = ")
    println (mas1[6])
    print ("Y18 = ")
    print (mas2[16])
    }