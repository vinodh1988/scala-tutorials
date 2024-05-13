trait FirstTrain {
    def sayHello: (String)=>String
}
object Main extends FirstTrain{
    override def sayHello: String=>String = (x:String) => "Hello"+x
    def main(arg: Array[String]):Unit= {
        print("Hello! Second Scala Program")
        println("Say Hello to"+ sayHello("NagriNath"))
    }
}