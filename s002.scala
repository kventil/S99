/*
P02 (*) Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
*/

def penultimate(list: List[Int]): Int = {
  //todo only one element
  if(list.size <= 1)
  {
    throw new Exception("List too short!")
  }
  list(list.size -2)
  // more than two elements
}


println(penultimate(List(1,2,3,4,5,6)))
// println(penultimate(List(6)))
