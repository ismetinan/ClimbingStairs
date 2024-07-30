import java.util.HashMap;

public class Solution {
    HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
    public int climbStairs(int n) {
        if (cache.containsKey(n)) return cache.get(n);
        if (n <= 1) return 1;
        int result = climbStairs(n - 1) + climbStairs(n - 2);
        cache.put(n, result);
        return result;
    }
}