class Solution {
    public long inversionCount(int[] arr) {
        return mergeSort(arr, new int[arr.length], 0, arr.length - 1);
    }

    private long mergeSort(int[] arr, int[] temp, int left, int right) {
        long cnt=0;
        int mid;
        if(left>=right) return cnt;
           mid=(left+right)/2;
           cnt += mergeSort(arr,temp,left,mid);
           cnt += mergeSort(arr,temp,mid+1,right);
           cnt += merge(arr,temp,left,mid,right);
        return cnt;
    }

    private long merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i=left;
        int j= mid+1;
        int k=left;
        long count=0;
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }
            else{
                count=count+(mid-i +1);
                temp[k]=arr[j];
                k++;
                j++;
            }
            
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=right){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(int m =left; m <=right; m++){
           arr[m]=temp[m];
        }
        return count;
    }
}

