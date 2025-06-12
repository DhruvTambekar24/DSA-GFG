class Solution {
    int upperBound(int[] arr, int target) {
        int n = arr.length;
        int low =0;
        int high = n-1;
        return binarySearch(arr,target,low,high);
    }
    int binarySearch(int[] arr , int target , int low, int high){
        if(low>high) return low;
        int mid = (low+high)/2;
        if(target>=arr[mid]){
             return binarySearch(arr,target,mid+1,high);
        }
        else{
            return binarySearch(arr,target,low,mid-1);
        }
    }
}
