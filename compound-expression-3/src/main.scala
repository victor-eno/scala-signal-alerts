@main
def main(): Unit = {
//  A compound expression doesn't necessarily produce result just as println
  val e = { val x = 0 }
  println( e )
}