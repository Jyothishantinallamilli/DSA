//
ans[i>>1] drops the right most 
i & 1 ===> 1 if odd and 0 if even number


*** TIME COMPLEXITY=O(n)
    SPACE COMPLEXITY=O(n) ***
//



class Countingbits {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1); // Use dynamic programming to count bits
        }
        return ans;
    }
}
