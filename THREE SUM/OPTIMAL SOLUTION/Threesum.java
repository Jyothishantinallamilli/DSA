//
as we have to return nested list we create a nested list of ans array to store 
and we first sort the array and then we take i at first position and j=i+1 and k is at last position
where i iterates from 0 to n-1 for first element we dont need to compare with previous element
except the first the remaining i elmets are compared if yes we continue because we should not take duplicate array
intialize j and k and the comparision takes place until j<k 
as we create the sum as arr[i]+arr[j]+arr[k]
if sum<0 we should increase the j value since the array is sorted if we want to increase the sum then we have to move towards 
right
else if sum>0 we should decrease the k value since the array is sorted if we want to decrease the sum then we have to move towards 
left
else which means sum==0 the we create temp to store the list of three elements and we add these temp to ans array
j gets incremented and k gets decremented to proceed further we have to check whether the arr[j] ==arr[j-1] then skip that element
so j++
and check arr[k]==arr[k+1] then skip that element so k--
this goes to infinite loop so add a condition j<k to stop going to infinite loop

*** TIME COMPLEXITY=O(NlogN)+O(N^2)
    SPACE COMPLEXITY=O(1) as we are not using ay extra space except the answer array that is only to store the result ***
//

import java.util.*;

public class Threesum {
    public static List<List<Integer>> triplet(int n, int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
           if(i!=0 && arr[i]==arr[i-1] )
           continue;
           int j=i+1;
           int k=n-1;
           while(j<k){
           int sum=arr[i]+arr[j]+arr[k];
           if(sum<0)
           j++;
           else if(sum>0)
           k--;
           else{
               List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k]);
               ans.add(temp);
               j++;
               k--;
               while(j<k && arr[j]==arr[j-1])
               j++;
               while(j<k &&arr[k]==arr[k+1])
               k--;
           }
           }
        }
        return ans;
    }
}
