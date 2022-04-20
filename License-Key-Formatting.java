//day 39
// fails the second test case, needs review
public class License-Key-Formatting
{
    public String licenseKeyFormatting(String s, int k) {
            s=s.toUpperCase();
            String str="";
            String ans="";
            int c=0;
    
            for(int i=0;i<s.length();i++){
                if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))
                str+=Character.toString(s.charAt(i));
        
            }
               
           if(str.length()%k==0){
                    for(int i=0;i<str.length();i++)
                {
                    if(c==k){
                        ans+="-"+Character.toString(str.charAt(i));
                        c=0;
                    }
                    else{
                        ans+=Character.toString(str.charAt(i));
                        c++;
                    }
                }
                return ans;      
                }
            
        else if(str.length()%k!=0){
                    if(str.length()%k>k)
                    ans+=str.substring(0, str.length()-str.length()%k)+"-";
                    
                    for(int i=ans.length() ;i<str.length();i++)
                {
                    if(c==k){
                        ans+="-"+Character.toString(str.charAt(i));
                        c=0;
                    }
                    else{
                        ans+=Character.toString(str.charAt(i));
                        c++;
                    }
                }    
            }
       return ans;    
            
    }
}
