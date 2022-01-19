package first

//function at the package level , no need of class required
fun main(args: Array<String>) {  // args parameters if  required
    val name = "sarath"
    println("Hello $name")
    println("Hello, ${getName()}")
}


fun getName():String{
    return "sarath"
}