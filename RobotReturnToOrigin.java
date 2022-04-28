//day 47

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int u=0,d=0,l=0,r=0;
        char arr[]=moves.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
                u++;
            else if(moves.charAt(i)=='D')
                d++;
            else if(moves.charAt(i)=='L')
                l++;
            else
                r++;
            
        }
        if(u==d && l==r)
            return true;
        return false;
    }
}
