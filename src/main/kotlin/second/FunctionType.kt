package second

fun main(){

    println("function types ")

    val sum:(Int,Int) -> Int = {x,y -> x+y}
    println(sum(1,2))

    val sum1 = {x:Int,y:Int -> x+y}
    println(sum1(1,2))

    //Passing variable to a function type
    val isEven = {x:Int -> x%2 ==0}
    val items = listOf<Int>(1,2,3,4,5)
    val result=  items.any(isEven)
    println(result)

    //calling lamda directly
    val k = { println("hello") }()
    val p =  k
    //Bettter way use run
    run{ println("hello") }

    //Function types and nullability

    data class Person (val name:String,val age:Int)
    val people = listOf<Person>(Person("sam",23),Person("Sarath",37))
    println(people.maxOf { it.age }) // 37
    println(people.maxOf (Person::age)) //class , member

  //we can store lamda in a variable but not function
    //val kp = iseven
  // use function reference insted
    val kp1 = ::iseven
    println( kp1(10))

    val sum2:(Int,Int) -> Int = {x,y-> x + y}

    //member reference
    val action1 = {x:Int,y:Int -> sum2(x,y)}
    val action  = sum
    action(1,10)

    //

}

fun iseven(i:Int) = i%2==0
fun sum(i:Int,j:Int) = i+j

 class Human(val name:String,val age:Int){
     fun drink(i:Int){
         println("drinking $i liter(s) of water")
     }
 }

