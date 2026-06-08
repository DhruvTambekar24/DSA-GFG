class Solution {
    public static int precedence(char ch) {
        if(ch == '^') return 3;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '+' || ch == '-') return 1;
        return -1;
    }
    public String infixToPrefix(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '(') sb.setCharAt(i, ')');
            else if(sb.charAt(i) == ')') sb.setCharAt(i, '(');
        }
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(char ch : sb.toString().toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                res.append(ch);
            }
            else if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    res.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() &&
                      (precedence(st.peek()) > precedence(ch) ||
                      (precedence(st.peek()) == precedence(ch) && ch == '^'))){
                    
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }
        
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        
        return res.reverse().toString();
        
    }
}