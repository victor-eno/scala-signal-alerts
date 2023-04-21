object Main {
  def main(args: Array[String]): Unit = {
//    a basic compound expression
    val hour = 6

    val isOpen = {
        val opens =9
        val closes =20
        println("Operating hours: " + opens + " - " + closes )
      if (hour > opens && hour <= closes){
        true
      }
      else {
        false
      }
    }
    println(isOpen)
  }

}