class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val c1 = s.groupingBy{ it }.eachCount()
        val c2 = t.groupingBy{ it }.eachCount()
        return c1 == c2
    }
}
