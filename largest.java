class largest {
    public int largest(int arr[], int n)
    {
        Arrays.sort(arr);
       return arr[arr.length-1];
    }
}
