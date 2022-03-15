    class Solution{
    public boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for (Character ch : arr) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            }else{
              if(stack.isEmpty()){
                  return false;
              }else{
                  Character top = stack.peek();
                  if((top == '{' && ch == '}')|| (top == '(' && ch == ')') || (top == '[' && ch == ']')){
                      stack.pop();
                  }else {
                      return false;
                  }
              }
            }
        }
        return stack.isEmpty();
    }
    }