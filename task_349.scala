object Solution extends App {

  // Given two arrays, write a function to compute their intersection.
  // Note:
  //
  // Each element in the result must be unique.
  // The result can be in any order.

  def intersection(nums1: Array[Int], nums2: Array[Int]): Int = {
    val length1: Int = nums1.length
    val length2: Int = nums2.length
    var arr: Array[Int] = Array.empty[Int]
    if (length1 >= length2) {
      for (i <- 0 until length2) {
        if (nums1 contains nums2(i)) {
          arr = arr :+ nums2(i)
        }
      }
    }
    else {
      for (i <- 0 until length1) {
        if (nums2 contains nums1(i)) {
          arr = arr :+ nums1(i)
        }
      }
    }
    arr.distinct.length
  }

  val a1 = Array(1, 2, 3, 4, 5, 2)
  val a2 = Array(1, 2, 3, 2, 7)
  val n: Int = intersection(a1, a2)
  println(s"The number of unique elements of intersection: $n")
}
