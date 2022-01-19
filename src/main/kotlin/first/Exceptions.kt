package first

fun main()
{
//    val x = if (1/100 ==100) 100
//            else throw IllegalArgumentException("not a valid input")


   val data = try{
        Integer.parseInt("sa")
    }catch (ex:NumberFormatException){
        null
    }
    println(data)
}