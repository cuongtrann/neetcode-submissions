class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(isCloseBracket(c)){
                if(stack.isEmpty()){
                    return false;
                }
                char open = stack.pop();
                if(!isValid(open, c)){
                    return false;
                }
            } else {
                stack.push(c);
            }
            
        }
        return stack.isEmpty();
    }
    
    public boolean isCloseBracket(char c){
        return c == ')' || c == '}' || c == ']';
    }

    public boolean isValid(char open, char close){
        if(close == ')'){
            return open == '(';
        } else if (close == '}'){
            return open == '{';
        } else{
            return open == '[';
        }
    }
}
