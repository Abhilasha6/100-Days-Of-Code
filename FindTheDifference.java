//day 32

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        // if(s==null)
        // return t.charAt(0);
        for (int i = 0; i < t.length(); i++) {
            if (s.contains(Character.toString(t.charAt(i)))) {
                s = s.replaceFirst(Character.toString(t.charAt(i)), "");
                continue;
            } else {
                return t.charAt(i);
            }
        }
        return '0';
    }
}
