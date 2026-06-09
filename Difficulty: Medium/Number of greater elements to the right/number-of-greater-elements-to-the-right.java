
class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {
       int n=arr.length;
       int q=indices.length;
       int[] res=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(arr[j] > arr[i]) count++;
            }
            res[i]=count;
        }
        int[] ans=new int[q];
        for(int i=0;i<q;i++){
            ans[i]=res[indices[i]];
        }
        return ans;
        
    }
}
