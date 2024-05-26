class SecondLargest {
    int print2largest(int arr[], int n) {
        Arrays.sort(arr);
        int slargest=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
               slargest=arr[i];
               break;
            }
        }
        return slargest;
    }
}