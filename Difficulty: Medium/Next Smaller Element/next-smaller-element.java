class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        Stack<Integer> stk=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()>=arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                res.add(-1);
            }else{
                res.add(stk.peek());
            }
            stk.push(arr[i]);
        }
        Collections.reverse(res);
        return res;
        
    }
}