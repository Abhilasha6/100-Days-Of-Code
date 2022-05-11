//day 60

public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
    int rCount = 0, lCount = 0;
int maxBalanceCount = 0;
char[] arr = s.toCharArray();
for(int i = 0; i < arr.length; ++i) {
if(arr[i] == 'R')
rCount++;
else if(arr[i] == 'L')
lCount++;
if(rCount == lCount)
maxBalanceCount++;
}
return maxBalanceCount;
}
}
