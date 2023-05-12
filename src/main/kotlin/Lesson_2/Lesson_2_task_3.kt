package Lesson_2
fun main() {
    val hour = 9
    val min = 39
    val timeMin = 457

    val hourInMin = 9 * 60
    val summ = hourInMin + min

    val globalSumm = summ + timeMin

    val resultHour = globalSumm / 60
    val resultMin = globalSumm % 60

    print(resultHour)
    print(":")
    print(resultMin)
}