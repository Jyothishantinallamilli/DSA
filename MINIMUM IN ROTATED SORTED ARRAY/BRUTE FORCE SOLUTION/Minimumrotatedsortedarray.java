//
initialize min to MAX_VALUE and campare every array element with min and update the min and return it.

*** TIME COMPLEXITY=O(n)
SPACE COMPLEXITY=O(1) ***

//




public class Minimumrotatedsortedarray {
    public static int findMin(int []arr) {
        int n = arr.length; 
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
        }
        return mini;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findMin(arr);
        System.out.println("The minimum element is: " + ans );
    }
}
