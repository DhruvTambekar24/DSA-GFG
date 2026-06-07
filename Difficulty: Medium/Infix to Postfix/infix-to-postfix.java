class Solution {
    public static int precedence(char ch) {
        if(ch == '^') return 3;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '+' || ch == '-') return 1;
        return -1;
    }
    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(Character.isLetterOrDigit(ch)){
                res.append(ch);
            }
            else if(ch == '(') {
                st.push(ch);
            }
            else if(ch == ')') {
                while(!st.isEmpty() && st.peek() != '('){
                    res.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() &&(precedence(st.peek()) > precedence(ch) || (precedence(st.peek()) == precedence(ch) && ch != '^'))){
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        
        return res.toString(); 
    }
}