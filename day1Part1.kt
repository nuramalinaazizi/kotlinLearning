/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    println("Hello World")
    val x = 1
    val y = 2
    println(x)
    
    val z = x + y
    println(z)
    
    var myName = ""
    myName = "Amalina Azizi"
    println(myName)
    
    
    val address:String = "Kuala Lumpur"
    println(address)
    
    val message = "My name is "+myName
    println (message)
    
    val anotherMessage = "My name is $myName and live in $address"
    println (anotherMessage)
    
    var num1 = 5
    var num2 = 13

    var sum = num1+ num2
    println(sum) 
    
    println(num2-num1)
    println(num2/num1)
    println(num2*num1)
    println(num2%num1)
    
    
    val eaten = false
    val tired = true
    
    println (eaten && tired)
    println(!eaten)
    
    val profession = null
    println(profession)
    
    val scores = listOf(70,90,100,80)
    val scores2 = arrayOf(70,90,100,80)
    
    println(scores.count())

}
