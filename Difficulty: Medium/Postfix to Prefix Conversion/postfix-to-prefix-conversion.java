class Solution {
    static String postToPre(String s) {
       Stack<String> st = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                st.push(ch + "");
            }
            else{
                String b = st.pop();
                String a = st.pop();
                
                String res = ch + a + b;
                st.push(res);
            }
        }
        return st.peek();
        
    }
}
