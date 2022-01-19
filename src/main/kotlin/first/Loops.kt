package first

import java.util.*

fun main() {

    var i = 1
    do {
        i += 1
        println(i)
    } while (i < 10)

    for (i in 100 .. 110) {  // include upper bound
        println(i)
    }

    for (i in 100 until 110) {  // exclude upper bound
        println(i)
    }

    for (ch in 100 downTo  50 step 5) {
        println(ch)
    }

    for (i in "sarath") {
        println(i)
    }

        val l = listOf(1,2,3)
    for (i in l) {
        println(i)
    }

    for ((i,e) in l.withIndex()) {
        println("position $i --> $e")

    }

    val m = mapOf(1 to "one", 2 to "two")
    for ((k, v) in m) {
        println("$k --> $v")
    }

    for (ch in "abc") {
        print(ch + 1)
    }
    ranges()
}


fun ranges(){
    for (i in 1 .. 10){
        println(i)
    }
     val c =9 // belonging
    val k=  c in 1..10
    println(k)


    val iR:IntRange = 1..10
    val st:ClosedRange<String> = "ab".. "az"
    for(s in st.start)  println(s)
    val startDate  =  Date()
    val endDate = Date()
    val dt:ClosedRange<Date> = startDate .. endDate
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}