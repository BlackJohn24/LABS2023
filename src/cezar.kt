

fun main() {

    val text = "СОВРЕМЕННЫЕМЕТОДЫМОДЕЛИРОВАНИЯ"
    println("Original text: $text")

    val cipher = cipher( text, 5 )
    println("Cipher text: $cipher")

    val decipher = decipher( cipher, 5 )
    println("Decipher text: $decipher")
}

fun cipher(text: String, shift: Int): String {

    var result = ""

    val firstCharCode = 'А'.code
    val offset = ('Я' - 'А') + 1

    for (i in 0 until text.length) {

        val oldCharCode = text[i].code
        val oldIdxInAlphabet = oldCharCode - firstCharCode
        val newIdxInAlphabet = (oldIdxInAlphabet + shift) % offset

        val newChar = (firstCharCode + newIdxInAlphabet).toChar()
        result += newChar
    }

    return result
}

fun decipher( text: String, shift: Int ): String {

    return cipher( text, shift * -1 )
}