open class CaesarCrypt {
    /**
     * Алгоритм шифрования Цезаря
     */
    fun encrypt(str: String, key: Int): String {
        val result = with(StringBuffer()) {
            for (c in str.toCharArray()) {
                var result = c.toInt()
                result += key
                this.append(result.toChar())
            }
            this.toString()
        }
        return result
    }

    /**
     * Алгоритм расшифровки Цезаря
     */
    fun decrypt(str: String, key: Int): String {
        val result = with(StringBuffer()) {
            for (c in str.toCharArray()) {
                var result = c.toInt()
                result -= key
                this.append(result.toChar())
            }
            this.toString()
        }
        return result
    }
}


fun main(args: Array<String>) {
  //  val text = "АБВГДЕЖЗИКЛМНОПРСТУФХЦЧШЩЬЫЪЭЮЯ"
    val str = "СОВРЕМЕННЫЕМЕТОДЫМОДЕЛИРОВАНИЯ"
    val key = 9

    val encryptResult = CaesarCrypt().encrypt(str, key)
    println("Результат алгоритма шифрования: $encryptResult")
    val decryptResult = CaesarCrypt().decrypt(encryptResult, key)
    println("Результат алгоритма дешифрования: $decryptResult")

 //   val textEncryptResult = CaesarCrypt().encrypt(text, key)
    // Подсчитываем количество появлений каждого символа в зашифрованном тексте
   // val map = hashMapOf<Char, Int>()




}