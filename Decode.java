
public class Decode{

    public int numDecodings(String s) {
        if(s == null || s.length() == 0)
            return 0;
        if(s.charAt(0) == '0')
            return 0;
        //only one way to decode id len == 1
        if(s.length() == 1)
            return 1;
        
        int first = 1;
        int second = 1;
        int curr = 0;
        
        for(int i = 1; i < s.length(); i++){
            curr = 0;
            if(s.charAt(i) != '0')
                curr += first;
            int num = Integer.parseInt(s.substring(i-1,i+1));
            if(num >= 10 && num <= 26){
                curr += second;
            }
            second = first;
            first = curr;
        }
        
        return curr;
        }
        
    }

