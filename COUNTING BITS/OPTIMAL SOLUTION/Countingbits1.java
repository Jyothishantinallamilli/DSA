//
we take a ans array to store the final result
we take i loop which takes 0 to n values and count becomes 0 everytime when i gets incremented because for every value in i the 
count should started from 0 we take num variable which has a copy of i which helps in unchanging of i and remaining is same as 
counting number of ones of better solution and we store count values in ans[i]
finally return ans 

*** TIME COMPLEXITY=O(nlogn)
    SPACE COMPLEXITY=O(n) ***
//



class Countingbits {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            String bin=Integer.toBinaryString(i);
            int count=0;
            for(int j=0;j<bin.length();j++){
                if(bin.charAt(j)=='1')
                count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}