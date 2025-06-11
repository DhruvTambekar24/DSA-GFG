class Solution {
    int lowerBound(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        return binarySearch(arr,target,low,high);
    }
    public int binarySearch(int[] nums , int target , int low , int high){
        if(low > high) return low;
        int mid = (low+high)/2;
        if(target > nums[mid]){
            return binarySearch(nums,target,mid+1,high);
        } 
        else{
           return binarySearch(nums,target,low,mid-1);
        }
    }
}
