class Solution {
    public int kthSmallest(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        return arr[k-1];
    }
}
