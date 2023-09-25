fun main() {
    val string = "!!!!2222211(kfjfj)!!!!"
    val s = string.split(")")
    val s1: String = s[0]
    val s2 = s1.split("(")
    val s3: String = s2[0] + s[1]
    println("Изначальная строка : $string")
//    println(s)
//    println(s1)
//    println(s2)
    println("решение : $s3")
}