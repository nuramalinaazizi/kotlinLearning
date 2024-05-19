/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    
var myAge = 30
if(myAge > 18){
println("You can watch the movie")
}
else {
println("You are underage")
}
    
var size = 1
var price = when (size) {
		1-> 5
    2-> 6 
    else -> 7
}
println(price)
 
var childAge = 17
var parent = false
    
when {
	childAge < 13 -> println("You cannot watch movie")
	childAge < 18 && parent == false -> println("You cannot watch     the movie")
	childAge < 18 && parent == true -> println("You can watch the     movie")
	else -> println("You can watch the movie")
}
 
 for (i in 0..7){
	println("i=$i")
	}
 
  for (x in 5 downTo 0){
	println("x=$x")
	}
   
  val numberList = arrayOf(1, 2, 3, 4, 5, 6)
  for (i in 0..numberList.size - 1) {
    println("${numberList[i]}")
  }

  var x1 = 5
  while(x1<=5){
	println("$x1")
	x1++
  }
    
  var x2 = 1
    do {
        println("x2 = $x2")
        x2++
    }
    
    while(x2<=5)

    var x3 = 1
    do {
        println("x=$x3")
        x3++
        if(x3==3)break
    }
    
   while(x3<=5)
   
   var x4 = 0
    do {
        x4++
        if(x4==3){continue}
        println("x4=$x4")
    }
    while(x4 <= 5)
    
    sayHello()
    sayGoodbye("Amalina")
}

fun sayHello(){
    println("Hello World")
}

fun sayGoodbye(name:String){
    println("Goodbye $name")
}
