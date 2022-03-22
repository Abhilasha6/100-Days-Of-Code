public class PlusOne {
    public int[] plusOne(int[] digits) {
    // int n=digits.length+1;
    //     int num[]=new int[n];
        // for(i=0;i<digits.length;i++)
        // {
        //     num=num*10+digits[i];
        // }
        // num=num+1;
        // String num1=Integer.toString(num);
        // int[] p1=new int[digits.length+1];
        // // for(i=0;i<num.length();i++)
        // //     p1[i]=num[i];
        // // return p1;
        // for(i=0;i<num1.length();i++)
        //     p1[i]=num1.charAt(i);
        // return p1;
    for(int i = digits.length - 1; i >= 0; i --){
        if(digits[i] < 9){
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }
    int[] result = new int[digits.length + 1];
    result[0] = 1;
    return result;
}
}