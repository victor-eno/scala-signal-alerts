@main
def main(): Unit = {
  def sum( xs: List[Int]): Int = xs match
    case Nil => 0
    case x :: tail => x + sum(tail)

}