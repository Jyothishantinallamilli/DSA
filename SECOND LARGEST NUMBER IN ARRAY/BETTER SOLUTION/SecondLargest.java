class SecondLargest {
    int print2largest(int arr[], int n) {
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest)
            largest=arr[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i]>slargest && arr[i]!=largest)
                slargest=arr[i];
        }
        return slargest;
    }
}