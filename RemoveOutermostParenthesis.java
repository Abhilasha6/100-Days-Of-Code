//day 58
// review again
public class RemoveOutermostParenthesis {
    public String removeOuterParentheses(String S) {
    char [] chars=S.toCharArray();
    	StringBuilder sb=new  StringBuilder();
    	Stack<Character> st= new Stack<>();
    	int startindex=0;
    	for ( int i=0;i<chars.length;i++ ) {
    		char c= chars[i];
    		if(c=='(') {
    			st.push('(');
    		}else if(c==')') {
    			st.pop();
    		}
    		if(st.isEmpty()) {
    			sb.append(S.substring((startindex+1),i));
    			startindex=i+1;
    		}
    		
    	}
    	
        return sb.toString();
    }
}
