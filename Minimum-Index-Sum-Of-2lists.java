//day 45

public class Minimum-Index-Sum-Of-2l ists
{

    public String[] findRestaurant(String[] list1, String[] list2) {
            // char arr1[]=list1.toCharArray();
            // char arr2[]=list2.toCharArray();
            // int sum=list1.length();
            int k=0;
            String ans[]=new String[list1.length];
            for(int i=0;i<list1.length+list2.length-1;i++)
            {
                for(int j=0;j<=i;j++)
                {
                   
                    // if(arr1[i]==arr2[j])
                    // {
                    //     if(sum>i+j)
                    //     {
                    //         sum=i+j;
                    //         ans[k++]=arr1[i];
                    //     }
                    // }
                    
                    if (j < list1.length && i-j < list2.length && list1[j].equals(list2[i-j]))
                        ans[k++]=list1[j];
                }
                if (k > 0)
                    break;
            }
            String res[]=new String[k];
            for(int i=0;i<k;i++)
                res[i]=ans[i];
            return res;
            
        }
}
