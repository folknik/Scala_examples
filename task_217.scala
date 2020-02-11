object Solution extends App {

  // Given an array of integers, find if the array contains any duplicates.
  //
  // Your function should return true if any value appears at least twice in the array,
  // and it should return false if every element is distinct.

  def containsDuplicate(nums: Array[Int]): Boolean = {
    val count: Int = nums.length - nums.toSet.size
    if (count != 0) true
    else false
  }
  val a = Array(1, 2, 3, 1)
  println(containsDuplicate(a))
}
