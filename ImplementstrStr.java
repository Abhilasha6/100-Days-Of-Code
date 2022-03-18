public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        // if(needle==""||haystack=="")
        //     return 0;
        // else 
        //     return haystack.indexOf(needle);
        int res=(needle==""||haystack=="")?0:haystack.indexOf(needle);
        return res;
    }
}
