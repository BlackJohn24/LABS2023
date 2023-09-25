import kotlin.random.*

fun main() {
    val matrixA = Matrix(5) { size, _, _ ->
        Random.nextInt(1, size)
    }
    println("Size of matrices is '${matrixA.size}'")
    matrixA.print()
    val matrixB = matrixA.convertMirror()
    val matrixC = matrixA.convertToNegativeTop()
    println("-----".repeat(matrixA.size-2))
    matrixB.print()
    println("-----".repeat(matrixA.size-2))
    matrixC.print()
}
class Matrix<T>(
    val size: Int,
    init: (size: Int, i: Int, j: Int) -> T
) {
    private val buffer: List<T>

    init {
        buffer = List(size*size) { index ->
            val (i, j) = idx2Pos(index)
            val a = init(size, i, j)
            a
        }
    }
    fun get(i: Int, j: Int) = buffer[pos2Idx(i to j)]

    private fun idx2Pos(index: Int): Pair<Int, Int> {
        val i = index / size + 1
        val j = index % size + 1
        return i to j
    }
    private fun pos2Idx(position: Pair<Int, Int>): Int {
        val (i, j) = position
        return size * (i-1) + (j-1)
    }
    fun print() {
        buffer.forEachIndexed { index, value ->
            val (_, j) = idx2Pos(index)
            val splitter = if (index == 0) "" else if (j == 1) "\n" else  " | "
            print("$splitter${value}")
        }
        println()
    }
    fun <R> convert(transform: (Int, Int, T) -> R) = Matrix(size) { _, i, j ->
        transform(i, j, buffer[pos2Idx(i to j)])
    }
}
fun <T> Matrix<T>.convertMirror(): Matrix<T> = this.convert { i, j, _ ->
    if (j >= i) {
        this.get(i, j)
    } else {
        this.get(j, i)
    }
}
fun Matrix<Int>.convertToNegativeTop(): Matrix<Int> = this.convert { i, j, _ ->
    if (j < i) {
        this.get(i, j)
    } else {
        this.get(i, j) * -1
    }
}

