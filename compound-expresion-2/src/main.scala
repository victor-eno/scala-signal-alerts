@main
def main(): Unit = {
  val activity = "swimming"
  val hour = 10

  val isOpen = {
    if(activity == "swimming" || activity == "ice skating") {
      val opens = 9
      val closes = 20
      println("Operating hours: " + opens + " - " + closes)
      if(hour > opens && hour <= closes ) {
        true
      }
      else  {
        false
      }
    }
    else true
  }

  println(isOpen)
}