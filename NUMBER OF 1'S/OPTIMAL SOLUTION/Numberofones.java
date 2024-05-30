//
here count gets incremented if the LSB of n is 1
and n is right shift and continues checking the LSB and returns the count

*** TIME COMPLEXITY=O(log n)
    SPACE COMPLEXITY=O(1) ***
//


class Numberofones {
    public int hammingWeight(int n) {
        int count=0;
       while(n!=0){
        count+=n & 1;
        n>>>=1;
       }
        return count;
    }
}