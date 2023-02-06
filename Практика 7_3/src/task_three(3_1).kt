import kotlin.math.pow

fun main() {
    try {
        // 3 задание (1)
        print("Введите длину окружности: ")
        val length = readLine()!!.toDouble()
        val rad = length / (2 * Math.PI)
        if (rad > 0) println("Площадь круга равна: ${String.format("%.3f", Math.PI * rad.pow(2.0))}")
        else println("Ошибка, радиус не божет быть меньше 0.")
    }
    catch (e: Exception) {
        println(e)
    }
}