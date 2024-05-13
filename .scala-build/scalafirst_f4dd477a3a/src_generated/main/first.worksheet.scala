

final class first$u002Eworksheet$_ {
def args = first$u002Eworksheet_sc.args$
def scriptPath = """first.worksheet.sc"""
/*<script>*/



// $dep.`.` // Adds the current directory to the classpath


println("Hi") 
val sample: String="Row"
println(s"How are you $sample")

val immutableString: String = "I cannot change"
var mutableString: String = "I can change"

mutableString = "See, I just did!"
println(s"$mutableString, I am mutable")

for (i <- 1 to 5) {
  println(i)
}

val a:Option[Int]=Some(30)
println(s"A is $a")


//Basic If Else
val number = 10
if (number % 2 == 0) {
  println("The number is even.")
} else {
  println("The number is odd.")
}
//If Else as an expression
val result = if (number % 2 == 0) "even" else "odd"
println(s"The number is $result.")


//while loop

var counter = 5
while (counter > 0) {
  println(s"Counter is at: $counter")
  counter -= 1 // Decrease counter
}

//for loop

for (i <- 1 to 5) {
  println(s"Number: $i")
}

for (i <- 1 to 10 if i % 2 == 0) {
  println(s"Even number: $i")
}

val names = List("Alice", "Bob", "Charlie")
for (name <- names) {
  println(s"Name: $name")
}

//For Comprehensions
val squares = for (i <- 1 to 5) yield i * i
println(s"Squares: $squares")


//functions

def add(x: Int, y: Int): Int = {
  x + y
}

println(add(5, 3))  // Output: 8

//lambda
val multiply = (x: Int, y: Int) => x * y
println(multiply(4, 5))  // Output: 20

val numbers = List(1, 2, 3, 4)
val squaredNumbers = numbers.map(x => x * x)
println(squaredNumbers)  // Output: List(1, 4, 9, 16)

//collections

val list = List(1, 2, 3, 4)
val set = Set(1, 2, 3, 4)
val map = Map(1 -> "one", 2 -> "two")


//Hoc

// Defining a high-order function that takes a function as a parameter
def applyOperation(x: Int, y: Int, operation: (Int, Int) => Int): Int = {
  operation(x, y)
}


// Addition
val sum = applyOperation(10, 5, (a, b) => a + b)
println(s"Sum: $sum")  // Output: Sum: 15

// Multiplication
val product = applyOperation(10, 5, (a, b) => a * b)
println(s"Product: $product")  // Output: Product: 50

// Maximum of two numbers
val max = applyOperation(10, 5, (a, b) => a max b)
println(s"Max: $max")  // Output: Max: 10

//Unit

def printMessage(message: String): Unit = {
  println(message)
}

printMessage("Oh my God")

def myOne(a: String, callback: (a: String)=> Unit): Unit = {
   println("Hello The function is started")
   callback(a)
}

myOne("Arjun", (a: String)=>{
  println("Callback Has sterted")
  println(s"$a  is received")
})


//Object

object Person {
    val name: String = "John"
    def greet(): Unit = {
        println(s"Hello, my name is $name")
    }
}

// Accessing fields and methods
println(Person.name)  // Output: John
Person.greet()        // Output: Hello, my name is John

//Pattern Matching

def process(x: Any): Unit = x match {
  case i: Int => println("Integer: " + i)
  case s: String => println("String: " + s)
  case _ => println("Other")
}

process(20)
process(34.5)
process("India")


val maybeValue: Option[Int] = Some(42)
val answer = maybeValue match {
  case Some(value) => s"Value is $value"
  case None => "No value"
}
println(answer)


//Regular Expressions

val str = "ration"
val reg = str match {
 
  case s if s.matches("^[rbc][a-z]+n$") => "Second Pattern Matched"
  case s if s.matches("[A-Za-z]+") => "Contains only letters"
  case _ => "Contains other characters"
}
println(reg)

//Generics

class Box[T](value: T) {
  def getValue: T = value
}

val intBox = new Box(20) 
val strBox = new Box[String]("hello")

/*</script>*/ /*<generated>*//*</generated>*/
}

object first$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new first$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export first$u002Eworksheet_sc.script as `first.worksheet`

