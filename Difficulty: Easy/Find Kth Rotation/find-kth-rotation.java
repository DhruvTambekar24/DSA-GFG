class Solution {
    public int findKRotation(int arr[]) {
        int n = arr.length;
        int low=0;
        int high=n-1;
        int min = Integer.MAX_VALUE;
        int idx=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                if(arr[low]<=min){
                    min=arr[low];
                    idx=low;
                }
                low=mid+1;
            }
            else{
                if(arr[mid]<=min){
                    min=arr[mid];
                    idx=mid;
                }
                high=mid-1;
            }
        }
        return idx;
    }
}