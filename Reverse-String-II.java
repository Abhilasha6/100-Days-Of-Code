// day 42

public class Reverse-String-II {
        public String reverseStr(String s, int k) {
    //         String rev="";
    //         for(int i=0;i<k;i++)
    //         {
    //             rev+=Character.toString(s.charAt(i));
    //         }
            
    //         String res=rev+s.substring(k,s.length());
    //         return res;
            char[] a = s.toCharArray();
            for (int start = 0; start < a.length; start += 2 * k) {
                int i = start, j = Math.min(start + k - 1, a.length - 1);
                while (i < j) {
                    char tmp = a[i];
                    a[i++] = a[j];
                    a[j--] = tmp;
                }
            }
            return new String(a);
        }
}
