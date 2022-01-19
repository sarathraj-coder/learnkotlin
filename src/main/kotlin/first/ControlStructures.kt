package first

import first.NAME.*

enum class NAME{
    CAT,
    DOG,
    PIG,
    LION

}


fun main(){
    //if
    var k = if (1> 3)  "Nice" else "Not OK"
   // var m = (1>3) ? "Nice" : "Not OK" .. no ternary operator in kotlin

    //when as switch
    val animal = NAME.CAT
    //similar to switch in java no break needed
    val c = when(animal) {
        NAME.CAT -> "This is a cat "
        NAME.DOG -> "This is a dog"
        NAME.PIG -> "This is a pig"
        LION -> "This is a lion"
        else -> "invalid input"
    }

    println(c)

}
