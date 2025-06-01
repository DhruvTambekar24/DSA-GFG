class Solution {
    public long subarrayXor(int arr[], int k) {
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count=0;
        int xr=0;
        for(int i=0;i<n;i++){
            xr=xr^arr[i];
            if(xr==k){
                count++;
            }
            int x = xr^k;
            if(hm.containsKey(x)){
                count=count+hm.get(x);
            }
            hm.put(xr,hm.getOrDefault(xr,0)+1);
        }
        return count;
    }
}