
public class Minimumrotatedsortedorder {
    public static int findMin(int []arr) {
       int l=0,r=arr.length-1,m;
       int min=Integer.MAX_VALUE;
       while(l<=r){
           m=(l+r)/2;
           if(arr[m]<=arr[r]){
               if(arr[m]<min)
               min=arr[m];
               r=m-1;
           }
           else{
                if(arr[l]<min)
               min=arr[l];
               l=m+1;
           }
       }
       return min;
    }
}












