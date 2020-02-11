object task_14 extends App{

  // Write a function to find the longest common prefix string amongst an array of strings.
  // If there is no common prefix, return an empty string "".
  // All given inputs are in lowercase letters a-z.

  def longestCommonPrefix(strs: Array[String]): String = {
    if (strs.map((c:String) => c.length).sum == 0 || strs.filter((c: String) => c == "").size > 0) ""
    else {
      val min: Int = strs.map((c:String) => c.length).min
      var prefix: Array[Char] = Array.empty[Char]
      if (strs.map((c: String) => c(0)).distinct.length == 1) {
        for (i <- 0 until min) {
          val n: Int = strs.map((c: String) => c(i)).distinct.length
          if (n == 1) {
            prefix = prefix :+ strs(0)(i)
          }
        }
        if (prefix.length > 0) {
          prefix.mkString
        } else ""
      } else ""
    }
  }
}
