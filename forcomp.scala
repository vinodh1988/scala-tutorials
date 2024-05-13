import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object AsyncOperationsExample {
  def main(args: Array[String]): Unit = {
    def downloadUserData(id: Int): Future[String] = Future {
      // Simulate network delay
      Thread.sleep(1000)
      s"UserData for ID: $id"
    }

    def processData(data: String): Future[String] = Future {
      // Simulate data processing delay
      Thread.sleep(1000)
      s"Processed $data"
    }

    def uploadResults(data: String): Future[String] = Future {
      // Simulate upload delay
      Thread.sleep(1000)
      s"Results uploaded: $data"
    }

    // Composing the operations using for-comprehensions
    val userId = 101 // Sample user ID
    val operation = for {
      userData <- downloadUserData(userId)
      processedData <- processData(userData)
      uploadResult <- uploadResults(processedData)
    } yield uploadResult

    // Handling the final result
    operation.onComplete {
      case Success(result) => println(result)
      case Failure(e) => println(s"An error occurred: ${e.getMessage}")
    }

    // Keep the JVM from shutting down until our future completes
    Thread.sleep(4000)
  }
}
