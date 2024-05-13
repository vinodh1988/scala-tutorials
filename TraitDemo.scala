
trait Logger {
  def log(message: String): Unit = println(s"Log: $message")
}

trait TimestampLogger extends Logger {
  override def log(message: String): Unit = {
    val timestamp = System.currentTimeMillis()
    super.log(s"[$timestamp] $message")
  }
}

class DataService extends Logger {
  def processData(data: String): Unit = {
    log(s"Processing data: $data")
    // Additional data processing logic
  }
}

object Main extends App {
  val dataService1 = new DataService() with TimestampLogger
  dataService1.processData("some data")

  val dataService2 = new DataService()
  dataService2.processData("some other data")
}

