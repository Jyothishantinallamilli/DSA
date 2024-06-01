//
here we initialize reversed to 0
as given 32 bit integer we iterate from 0 to 31
we left shift the reversed at start it becomes 0 and then it may change
we take n & 1 to LSB add or it with reversed to get the reversed reverseBits ad to drop the LSB of n, we rightshift 
by 1 so n>>=1
finally return reversed; 


*** TIME COMPLEXITY=O(1)
    SPACE COMPLEXITY=O(1) ***
//


public class Reversebits {
    public int reverseBits(int n) {
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed <<= 1;
            reversed |= (n & 1); 
            n >>= 1; 
        }
        return reversed;
    }
}
