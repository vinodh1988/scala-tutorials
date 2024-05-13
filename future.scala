import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Success
import scala.util.Failure

@main def runMainNow():Unit = {

val futureResult: Future[Int] = Future {
  // Simulate a long-running computation
  Thread.sleep(1000)
  42 // the meaning of life
}

futureResult.onComplete {
case Success(value) => println(s"The result is $value")
case Failure(exception) => exception.printStackTrace()
}

Thread.sleep(15000)
}