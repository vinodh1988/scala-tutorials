import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
@main def runWell() = {
// Simulating asynchronous computations
val future1 = Future { Thread.sleep(200); 10 }
val future2 = Future { Thread.sleep(100); 20 }
val future3 = Future { Thread.sleep(300); 30 }

// Using zip to wait for two futures
val futurePair = future1 zip future2

futurePair.onComplete {
  case Success((a, b)) => println(s"Results from future1 and future2 are: $a and $b")
  case Failure(e) => println(s"Error processing future1 or future2: $e")
}

// Using foldLeft to aggregate results from multiple futures
val listOfFutures = List(future1, future2, future3)
val futureSum = Future.foldLeft(listOfFutures)(0)(_ + _)

futureSum.onComplete {
  case Success(sum) => println(s"The sum of all future results is: $sum")
  case Failure(e) => println(s"Error calculating sum: $e")
}
Thread.sleep(10000)
}