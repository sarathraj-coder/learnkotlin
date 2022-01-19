package first

import first.*

// Kotin extension functions are reqular static fucntions defined in a seperate auxilary class
//you cant call private members from extensions
fun String.lastChar() = this.get(this.length-1)

fun String.getDetails():String =  "This is an address"


fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
     for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}

fun main(){

     val c = "sarath".lastChar()
    println(c)

    println("sarath".getDetails())

    //get from javs

}

