public class RepeatedSubstring {
        public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for(int i=l/2;i>=1;i--) {
            if(l%i==0) {
                int m = l/i;
                String subS = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<m;j++) {
                    sb.append(subS);
                }
                if(sb.toString().equals(s)) 
                    return true;
            }
        }
        return false;
            
             for(int i=str.length()/2;i>=1;i--){
                if(str.length()%i==0){
                    int j=i;
                    String sub=str.substring(0,j);
                    while(str.indexOf(sub,j)==j)j+=i;
                    if(j==str.length())return true;
                }
            }
            return false;
        }
}
