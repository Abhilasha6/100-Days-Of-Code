//day 33

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        // String subs = "";
        int i = 0;
        // for(int i=0;i<s.length();i++)
        // {
        // if(t.contains(Character.toString(s.charAt(i))))
        // {
        // subs+=Character.toString(s.charAt(i));
        // t=t.replaceFirst(Character.toString(s.charAt(i)),"");
        // }
        // }
        // if(subs==s)
        // return true;
        // return false;

        for (int j = 0; j < t.length() && i < s.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }
        return i == s.length();
    }
}
