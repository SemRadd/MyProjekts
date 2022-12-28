// 1. Написать программу, выводящую информацию о вас (имя, фамилия, профессия).
// 2.Объявить переменные всех вам известных типов и вывести все их значения на экран.
// 3.Запросить на ввод строку, ввести произвольное значение с клавиатуры и вывести на экран результат работы всех
//рассмотреных методов работы со строками.
fun main() {
    val a: Byte = -10
    val b: Short = 45
    val c: Int = -250
    val d: Long = 30000
    val e: Double = 3.14
    val f: Boolean = true
    val g: Boolean = false
    val h: Char = 'A'
    val i: String = "Time"

    println("Ruslan")
    println("Semenov")
    println("Student")
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(i)

    print("Введите город: ")
    val city = readLine()
    println("Ваше имя: $city")
}
