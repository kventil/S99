/*
  P01 (*) Find the last element of a list.
  Example:
  scala> last(List(1, 1, 2, 3, 5, 8))
  res0: Int = 8
*/


object S001{
def last(list: List[Int]): Int = {
    if(list.size <= 1)
    {
      throw new Exception("List to short!")
    }
    list(list.size - 1)
  }
  def main(args: Array[String]): Unit = {
    println(last(List(1, 1, 2, 3, 5, 8)))
  }
}
