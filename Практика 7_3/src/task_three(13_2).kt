import java.lang.Math.sqrt

fun main() {
    try {
        // 13 задание (2)
        print("k: ")
        val k = readLine()!!.toDouble()
        print("b: ")
        val b = readLine()!!.toDouble()
        print("a: ")
        val a = readLine()!!.toDouble()
        val discr = b * b - 4 * k * (-a)
        if (discr < 0) {
            println("Нет точек пересечения.")
        } else if (discr == 0.0) {
            val x = -b / (2 * k)
            val y = k * x + b
            println("Одна точка пересечения: (%.2f, %.2f)".format(x, y))
        } else {
            val x1 = (-b + sqrt(discr)) / (2 * k)
            val x2 = (-b - sqrt(discr)) / (2 * k)
            val y1 = k * x1 + b
            val y2 = k * x2 + b
            println("Точки пересечения: (%.2f, %.2f), (%.2f, %.2f)".format(x1, y1, x2, y2))
        }
    }
    catch (e: Exception) {
        println(e)
    }
}