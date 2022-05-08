//day 57

public class RemoveAllAdjacentDuplicates {
        // public String removeDuplicates(String s) {
        //     char arr[]=new char[s.length()];
        //     // Arrays.sort(arr);
        //     String str=Character.toString(s.charAt(0));
        //     for(int i=0;i<arr.length;i++)
        //     {
        //         if(i<arr.length-1 && arr[i]==arr[i+1])
        //         {
        //             arr[i+1]=3'0';
        //         }
        //         else
        //             str+=arr[i];
        //     }
        //     return str;
        public String removeDuplicates(String S) {
            StringBuilder sb = new StringBuilder();
            for (char c : S.toCharArray()) {
                int size = sb.length();
                if (size > 0 && sb.charAt(size - 1) == c) { 
                    sb.deleteCharAt(size - 1); 
                }
                else { 
                    sb.append(c); 
                }
            }
            return sb.toString();
        }
    }
