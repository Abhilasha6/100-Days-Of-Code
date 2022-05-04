//day 53

public class RotateString {
//     public boolean rotateString(String s, String goal) {
//         String temp="";
//         if(s.length()!=goal.length())
//             return false;
//         if(s.length()==0)
//             return false;
//         for(int i=0;i<s.length();i++)
//         {
//             // temp.append(Character.toString(s.charAt(i)));
//             // if(temp==goal)
//             //     return true;
//             // else if(temp==s)
//             //     return false;
//             // else{
//                 // temp=s.substring(i+1);
//                 // temp+=(Character.toString(s.charAt(i)));
//             for (int j = 0; j < s.length(); ++i) {
//                     if (s.charAt((i+j) % s.length()) != goal.charAt(j))
//                         continue ;
//                 }
//                 return true;
//             }
//         return true;
//          // if(temp==goal)
//          //        return true;
//         }
       
//         // return false;
//     }
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length())
            return false;
        if (A.length() == 0)
            return true;

        search:
            for (int s = 0; s < A.length(); ++s) {
                for (int i = 0; i < A.length(); ++i) {
                    if (A.charAt((s+i) % A.length()) != B.charAt(i))
                        continue search;
                }
                return true;
            }
        return false;
    }
}
