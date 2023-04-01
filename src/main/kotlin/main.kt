import java.time.temporal.TemporalAmount

fun main() {
    println("Введите число секунд")
    val time = readLine()!!.toInt()
    agoToText(time)
}

fun agoToText (time: Int){
    return when (time) {
        in 0..60 -> println("был(а) только что")
        in 61..3600 -> minut(time)
        in 3601..86_400 -> hours(time)
        in 86_401..172_800 -> println("был(а) вчера")
        in 172_801..345_600 -> println("был(а) позавчера")
        else -> println("был(а) давно")
    }
}

fun minut(time : Int) {
    var minute = time / 60
    if (minute == 11) println("был(а) $minute минут назад")
    else if (minute % 10 == 1) println("был(а) $minute минуту назад")
    else if (minute % 10 == 2 || minute % 10 == 3 || minute % 10 == 4) println("был(а) $minute минуты назад")
    else println("был(а) $minute минут назад")
}

fun hours(time : Int) {
    var hour = time / 3600
    if (hour == 1 || hour == 21) println("был(а) $hour час назад")
    else if (hour % 10 == 2 || hour % 10 == 3 || hour % 10 == 4) println("был(а) $hour часа назад")
    else println("был(а) $hour часов назад")
}


