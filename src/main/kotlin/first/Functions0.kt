package first


fun main(){
    println("maximum of 2 numbers ${max(1111212,1212312)}")
    println("maximum of 2 numbers ${max1(1,2)}")
    println("maximum of 2 numbers ${dispmax(1,2)}")
    dispmax(1,2)
    println("Function inside another function ${m()}")
    naming()
    defaultArg()
    defaultArg(200)


}

fun max(a:Int,b:Int):Int{
   return if(a>b) return a else b
}

fun max1(a:Int,b:Int) =  if(a>b)  a else b


fun dispmax(a:Int,b:Int):Unit{
     if(a>b) println(a)
     else println(b)
}

fun m(){
    fun localFun() = 1

    fun action() :Int
    {
       return localFun() + 10
    }
}

fun naming()
{
    println(listOf('a', 'b', 'c').joinToString(
        separator = "", prefix = "(", postfix = ")"))
}

fun defaultArg(i:Int=100)
{
  println(i)
}

