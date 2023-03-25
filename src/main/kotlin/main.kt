import java.time.temporal.TemporalAmount

fun main() {
    println("Введите число секунд")
    val time = readLine()!!.toInt()
    var minute = 0
    var hour = 0
    when (time) {

        in 0..60 -> println("был(а) только что")
        in 61..3600 -> minute = time / 60
        in 3601..86_400 -> hour = time / 3600
        in 86_401..172_800 -> println("был(а) вчера")
        in 172_801..345_600 -> println("был(а) позавчера")
        else -> println("был(а) давно")
    }
    if (minute == 11) println("был(а) $minute минут назад")
    else if (minute == 0) println()
    else if (minute == 1 || minute % 10 == 1) println("был(а) $minute минуту назад")
    else if (minute == 2 || minute == 3 || minute == 4 || minute % 10 == 2 || minute % 10 == 3 || minute % 10 == 4) println(
        "был(а) $minute минуты назад"
    )
    else println("был(а) $minute минут назад")

    if (hour == 1 || hour == 21) println("был(а) $hour час назад")
    else if (hour == 0) println()
    else if (hour == 2 || hour == 3 || hour == 4 || hour % 10 == 2 || hour % 10 == 3 || hour % 10 == 4) println("был(а) $hour часа назад")
    else println("был(а) $hour часов назад")
}








