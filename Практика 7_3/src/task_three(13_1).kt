import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    try {
        // 13 задание (1)
        print("Введите x1: ")
        val x1 = readLine()!!.toDouble()
        print("Введите y1: ")
        val y1 = readLine()!!.toDouble()
        print("Введите x2: ")
        val x2 = readLine()!!.toDouble()
        print("Введите x2: ")
        val y2 = readLine()!!.toDouble()
        print("Введите x3: ")
        val x3 = readLine()!!.toDouble()
        print("Введите x3: ")
        val y3 = readLine()!!.toDouble()

        val ab = sqrt((x2 - x1).pow(2.0) + (y2 - y1).pow(2.0))
        val bc = sqrt((x3 - x2).pow(2.0) + (y3 - y2).pow(2.0))
        val ca = sqrt((x1 - x3).pow(2.0) + (y1 - y3).pow(2.0))

        if ((ab + bc > ca) && (ab + ca > bc) && (bc + ca > ab)){
            println("Периметр равен: ${String.format("%.1f", ab + bc + ca)}")
            val pP = (ab + bc + ca) / 2
            println("Площадь равна: ${String.format("%.1f", sqrt(pP * (pP - ab) * (pP - bc) * (pP - ca)))}")
        }
        else println("Ошибка ввода")
    }
    catch (e: Exception) {
        println(e)
    }
}