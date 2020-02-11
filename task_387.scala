object task_387 extends App {

  // Given a string, find the first non-repeating character in it and return it's index.
  // If it doesn't exist, return -1.
  // Note: You may assume the string contain only lowercase letters.

  def firstUniqChar(s: String): Int = {
    val charsCount = s.find((c: Char) => s.count(_ == c) == 1)
    var n: Int = 0
    if (charsCount == None) {
      n = -1
    } else {
      n = s.indexOf(charsCount.get)
    }
    n
  }
}
