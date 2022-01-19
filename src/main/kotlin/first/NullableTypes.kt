package first



//run time error to compile time error
fun main(){

    val s3:String? = null
    val s1:String = "hi"
    val s2:String? =null
    // THis can be replaced if(s2!=null)
    val k =  s2?.length   //Safe call
    println(k)
    val p:Int? = s3?.length ?: 0   //provide a default value
    println(p)

    // ?: elvis operator

    val a:Int? =null
    val b:Int? =1
    val c:Int =2
    val d= (a ?: 0) + 2
    val d1 = (b ?: 0) + 2
    println("$d$d1")

    // Control flow analysis
    // NPE explicit
    // Not null assertion operator
    ///not god to put more than one Not null assertion in a like below
    //person.!!details.!!.address.!!area
    // use this operator with care
    val d2:Int? =null
    println(d2!!)

    //List<Int?> nullable element
    //List<Int>? nullable list
}