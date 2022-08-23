internal class Solution {
    var ss: HashSet = HashSet()
    fun isHappy(n: Int): Boolean {
        var num = 0
        ss.add(n)
        while (n > 0) {
            num += n % 10 * (n % 10)
            n /= 10
        }
        return when{
            num == 1 -> true
            ss.contains(num) -> false
            else -> isHappy(num)
        }
    }
}