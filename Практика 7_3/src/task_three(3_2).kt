import java.lang.Double.max
import java.lang.Double.min

fun main() {
    try {
        // 3 задание (2)
        print("Введите x: ")
        val x = readLine()!!.toDouble()
        print("Введите y: ")
        val y = readLine()!!.toDouble()
        print("Введите z: ")
        val z = readLine()!!.toDouble()
        if (x < z) println(max(x, y))
        else println(min(x, y))
    }
    catch (e: Exception) {
        println(e)
    }
}