//day 59 q2

public class DefangingAnIPaddress {
        public String defangIPaddr(String address) {
            String str="";
            for(int i=0;i<address.length();i++)
            {
                if(address.charAt(i)=='.')
                    str+="[.]";
                else
                    str+=Character.toString(address.charAt(i));
            }
            return str;
        }
}
