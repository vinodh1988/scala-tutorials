trait JsonSerializable {
  def toJson: String
}

case class Person(name: String, age: Int) extends JsonSerializable {
  def toJson: String = s"""{"name": "$name", "age": $age}"""
}

object SuperMain extends App {
  val person = Person("Alice", 30)
  println(person.toJson)
}

