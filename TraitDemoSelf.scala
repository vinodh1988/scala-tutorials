trait Perform{
    def doit(activity:String): Unit ={ println(s"Performing $activity with basic procedure")}
}

trait SmartWork extends Perform{
    override def doit(activity: String): Unit = {
        println(s"Peforming Smart Work for the activity: $activity")
    }
}

class Activity extends Perform  {
    def finishOff(activity:String): Unit = {
        println(s"started Doing the $activity")
        doit(activity)
    }
}

object Runner {
    def main(args:  Array[String]):Unit={
           val act = new Activity()
           act.finishOff("Testing")

           val act2 = new Activity() with SmartWork
           act2.finishOff("Coding")
    }
}