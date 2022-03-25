public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.trim;
        String rev="",str="";
        if(s==null) 
            return true;
			for (Character ch : str.toCharArray())
			{
			// ch=s.charAt(i);
			if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <=57))
			str=str+(Character.toLowerCase(ch));
			else
			continue;
			}
        str=str.toString();
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+(str.charAt(i));
        }
        rev=rev.toString();
        if(str.equalsIgnoreCase(rev))
            return true;
        return false;

    }
}
