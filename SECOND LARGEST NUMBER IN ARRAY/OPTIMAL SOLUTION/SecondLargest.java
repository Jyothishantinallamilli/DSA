public class SecondLargest {
    public static int[] getSecondOrderElements(int n, int []a) {
        int largest=a[0];
        int slargest=-1;
         int smallest=a[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]>largest && a[i]!=largest){
                slargest=largest;
                largest=a[i];
            }
            else if(a[i]>slargest){
                slargest=a[i];
            }
        }
         for(int i=1;i<n;i++){
            if(a[i]<smallest && a[i]!=smallest){
                ssmallest=smallest;
               smallest=a[i];
            }
            else if(a[i]<ssmallest){
                ssmallest=a[i];
            }
        }
        return new int[] {slargest,ssmallest};
    }
}