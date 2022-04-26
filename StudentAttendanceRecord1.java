//day 43

public class StudentAttendanceRecord1 {
    public boolean checkRecord(String s) {
        if(s.length() < 3 && s.equals("AA")){
            return false;
        }
        if(s.contains("LLL")){
            return false;
        }
        int  count = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                count++;
                if(count >=2){
                    return false;
                }
            }
            
        }
           return true;
    }
}
