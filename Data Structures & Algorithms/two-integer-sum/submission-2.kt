class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val intSet = nums.toSet()
        var j = nums.size - 1
        val map = nums.withIndex().associate { it.value to it.index }

        nums.withIndex().forEach { 
            val diff = target - it.value
            if (diff in map && map[diff] != it.index) {
                return intArrayOf(it.index, map[diff]!!)   
            } 
        }

        return intArrayOf(-1, -1)
    }
}
