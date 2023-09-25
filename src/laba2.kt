fun main() {
    val mass = mutableListOf<Int>()
    val mass2 = mutableListOf<Int>()
            fun summ() {

                print("Введи количество элементов в массиве : ")
                val n = readLine()!!.toInt()
                println("Заполните элементы массива с условием a1>0 и а2 или а3 - отрицательное число ")
                for (j in 1..n) {
                print("Введите значение a$j :")
                val m = readLine()!!.toInt()
                mass.add(m)
                }   }
    summ()
    println (mass)
    if ( mass[0] <= 0) {
        println ("Условия задачи не соблюдены !!! a1>0 попробуй еще")
        return summ()
    }
    if (mass[1]>0 && mass[2] >0)
    {
        println("Условия задачи не соблюдены !!! а2 или а3 - отрицательное число попробуй еще")
        return summ()
    }
    for (i in 0 .. mass.size -2) {
        mass2.add(mass[i]+mass[i+1])
    }
    println (mass2)
    print("Наименьший элемент в списке :")
    print (mass2.minOrNull())
}