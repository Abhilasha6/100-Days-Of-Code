public class AddBinary {
        public String addBinary(String a, String b) {
            int carry=0,sum=0;
            int lda,ldb;
            // String s="";
            int i=a.length()-1, j=b.length()-1;
            StringBuilder s=new StringBuilder();
           for(;i>=0||j>=0;i--,j--)
           {
               // lda=(int)a.charAt(i);
               // ldb=(int)b.charAt(j);
               // if(lda==0 && ldb==0){
               //     sum=sum+carry+"0";
               //     s.append(sum);
               // }
               // else if((lda==0 && ldb==1)||(lda==1 && ldb==0)){
               //     sum=sum+carry+"1";
               //     s.append(sum);
               // }
               // else
               // {
               //     sum=sum+carry+"0";
               //     carry="1";
               //     s.append(sum);
               // }
               sum=carry;
               if(i >= 0) sum += a.charAt(i) - '0';
               if(j >= 0) sum += b.charAt(j) - '0';
               if(sum>1)
                   carry=1;
               else 
                   carry=0;
               s.append(sum%2);
           }
            if(carry != 0) 
                s.append(carry);
            return s.reverse().toString();
        }
    }