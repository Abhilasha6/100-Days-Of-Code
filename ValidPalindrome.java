//day 15

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // s=s.toLowerCase();
        // s=s.trim;
        // String rev="",str="";
        if(s==null) 
            return true;
		// 	for (Character ch : str.toCharArray())
		// 	{
		// 	// ch=s.charAt(i);
		// 	if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <=57))
		// 	str=str+(Character.toLowerCase(ch));
		// 	else
		// 	continue;
		// 	}
        // str=str.toString();
        // for(int i=str.length()-1;i>=0;i--){
        //     rev=rev+(str.charAt(i));
        // }
        // rev=rev.toString();
        // if(str.equalsIgnoreCase(rev))
        //     return true;
        // return false;

        String str = "";
        for(int i=0; i<s.length();i++) {
        	char ch = s.charAt(i);
        	if(Character.isAlphabetic(ch)|| Character.isDigit(ch)) {
        		if(Character.isUpperCase(ch))
        			ch = Character.toLowerCase(ch);
        		str+=ch;
        	}
        }
        
        int mid = str.length()/2;
        for(int i=0,j=str.length()-1; i<=mid && j>=mid ; i++, j--) {
        	if(str.charAt(i)!=str.charAt(j)) {
        		return false;
        	}
        }
        return true;
    }
}
