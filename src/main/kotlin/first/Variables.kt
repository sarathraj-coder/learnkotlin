package first

// val and var
// val is readonly
// var is mutable


fun main(){
    val a:Int = 1
    val b = 1
    val c = a +b
    var name = "Sarath"
    println(c)
    println(name)

    // can modify contents stored in mutable objects
    var k = "kotlin"
    val m = mutableListOf(k)
    m.add("java")
    k="sample"
    println(m.toString())

    // readonly list
    val ml = listOf("java")
     //  ml.add("kotlin") . this is a ready only list ,






}

