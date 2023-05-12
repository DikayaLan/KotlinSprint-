package Lesson_1

fun main(){
    val year : Int = 1961
    var hourMinute : String = "09:07"
    //println(hourMinute)
    val multiString = """
        1961
        09:07
    """.trimIndent()
    println(multiString)
    hourMinute = "10:55"
    println(hourMinute)
}