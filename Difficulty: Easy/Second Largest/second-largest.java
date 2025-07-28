class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }

        return (slargest == Integer.MIN_VALUE) ? -1 : slargest;
    }
}