//
we convert integer to binary string and see if the the character at i is 1 then count gets incremented
and finally return the count

*** TIME COMPLEXITY=O(log n)
    SPACE COMPLEXITY=O(logn) ***
//


class Numberofones {
    public int hammingWeight(int n) {
        int count=0;
        String bin=Integer.toBinaryString(n);
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1')
            count++;
        }
        return count;
    }
}