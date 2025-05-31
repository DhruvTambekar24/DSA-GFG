class Solution {
    int maxLen(int arr[]) {
        int n = arr.length;
        Map<Integer, Integer> hm = new HashMap<>();
        int sum=0;
        int slen=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum==0){
                slen=i+1;
            }
            else if(hm.containsKey(sum)){
              slen = Math.max(slen,i-hm.get(sum));
            }
            else{
                hm.put(sum,i);
            }
        }
        return slen;
    }
}