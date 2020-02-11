object Solution extends App {

  // Given a non-empty array of integers, every element appears twice except for one. Find that single one.
  //
  // Note:
  //
  // Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

  def singleNumber(nums: Array[Int]): Int = {
    val N: Int = nums.find((n: Int) => nums.count(_ == n) == 1).getOrElse(0)
    N
  }
}
