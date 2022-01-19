package second

import second.GENDER.MALE
import second.GENDER.FEMALE
//Lambda syntax
fun main()
{
   val  k = {x:Int,y:Int -> x+y}   // always in curly braces
   println( k(1,2) )


    var l1 = listOf<Int>(1,2,3,5,6,7,8,9,10,11,12,13,14)
    var l2 = l1.filter {
       it -> (it % 2 == 0)
    }


    val l4 = l1.any { it % 2 == 0 } //any or null // true or false
    println("l4 any: "+ l4)

    val l5 = l1.find { it % 2 == 0 } // first or FistOrNull
    println("l5 find: "+l5)


    val l6 = l1.count { it % 2 == 0 } // count
    println("l6 count: "+l6)

    val l7 = l1.partition { it % 2 == 0 } // split based on condition
    println("l7 partition: "+l7)
    println("l7 partition first: "+l7.first)
    println("l7 partition second: "+l7.second)

    //groupBy (name ,age)
    //associated By   name ->   (name ,age ) , duplicates removed
    //associate
    //zip
    var age = listOf<Int>(1,2,3)
    var name = listOf<String>("sarath","nikhil","jijo","sam")
    val l8 =  name.zip(age)
    println("l8 zip: "+l8)
    println("l8 zip: "+l8.get(0).first)

    //zip with next
    var l9 = listOf<Int>(1,2,3,5,6,7)
    println("l9 zipWithNext: "+l9.zipWithNext())




    //flatten
    val deepList = listOf(listOf(1), listOf(2, 3), listOf(4, 5, 6))
    println(" flatten: "+deepList.flatten()) // [1, 2, 3, 4, 5, 6]

    //"sarath".flatMap { transform -> println( transform.toChar()) }

      val list = listOf("123", "45")
    println("flatMap" + list.flatMap { it.toList() })

    //map , transform each element in collection
    val l3 =    l2.map{ i-> i * 10}
    println("l5 Map: "+l3)


 val heroes = listOf(
  Hero("The Captain", 60, GENDER.MALE),
  Hero("Frenchy", 42, GENDER.MALE),
  Hero("The Kid", 9, null),
  Hero("Lady Lauren", 29, GENDER.FEMALE),
  Hero("First Mate", 29, GENDER.MALE),
  Hero("Sir Stephen", 37, GENDER.MALE))

 println( heroes.firstOrNull { it.age == 30 }?.name)

 val heroes1 = listOf(
 Hero("Frenchy", 42, MALE),
 Hero("The Kid", 9, null),
 Hero("Lady Lauren", 29, FEMALE),
 Hero("First Mate", 29, MALE),
 Hero("Sir Stephen", 37, MALE))

 val mapByAge: Map<Int, List<Hero>> =  heroes1.groupBy { it.age }
 println(mapByAge)
 val (age1, group) = mapByAge.maxByOrNull { (_, group) -> group.size }!!
 println(age1)



}

data class Hero(val name:String,val age:Int,val enum:GENDER?)

enum class GENDER{
 MALE,
 FEMALE,
}

