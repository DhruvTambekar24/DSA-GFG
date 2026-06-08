// User function Template for Java

import java.util.*;

class Solution {
    static String postToInfix(String exp) {
        Stack<String> st = new Stack<>();
        
        for(char ch : exp.toCharArray()){
            
            if(Character.isLetterOrDigit(ch)){
                st.push(ch + "");
            }
            else{
                String b = st.pop();
                String a = st.pop();
                
                String res = "(" + a + ch + b + ")";
                st.push(res);
            }
        }
        
        return st.peek();
    }
}