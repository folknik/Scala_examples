object Solution extends App {

  // Given an array, rotate the array to the right by k steps, where k is non-negative.
  //
  // Note:
  //
  // Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
  // Could you do it in-place with O(1) extra space?

  def rotate(nums: Array[Int], k: Int): Array[Int] = {
    val N: Int = nums.length
    var last: Int = 0
    for (j <- 0 to k-1) {
      last = nums(N - 1)
      for (i <- N - 1 until 0 by -1) {
        nums(i) = nums(i - 1)
      }
      nums(0) = last
    }
    nums
  }
  rotate(Array(1, 2, 3, 4, 5, 6, 7), 3).map(print)

}
