@main
def main(): Unit = {
//  sum functions that takes a list of integers as inputs and return an integers sum
  def sum(ints: List[Int]): Int = {
//  sum variable is used to keep track the sum the integers in the input list
    var sum = 0
    for (i <- ints) {
      sum += i
    }
    sum
  }
}