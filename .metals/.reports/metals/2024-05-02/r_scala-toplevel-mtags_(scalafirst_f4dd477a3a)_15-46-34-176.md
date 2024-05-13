error id: file:///E:/Scala/scalafirst/third.scala:[190..197) in Input.VirtualFile("file:///E:/Scala/scalafirst/third.scala", "trait JsonSerializable {
  def toJson: String
}

case class Person(name: String, age: Int) extends JsonSerializable {
  def toJson: String = s"""{"name": "$name", "age": $age}"""
}

object  extends App {
  val person = Person("Alice", 30)
  println(person.toJson)
}

")
file:///E:/Scala/scalafirst/third.scala
file:///E:/Scala/scalafirst/third.scala:9: error: expected identifier; obtained extends
object  extends App {
        ^
#### Short summary: 

expected identifier; obtained extends