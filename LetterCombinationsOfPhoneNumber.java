
import java.util.List;
import java.util.ArrayList;



public class LetterCombinationsOfPhoneNumber{
    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) return new ArrayList<String>();
        List<String> res=new ArrayList<>();
        String[] map={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder sb= new StringBuilder();
        recursion(digits,res,sb,map,0);
        return res;
    }
    void recursion(String digits,List<String> res,StringBuilder sb,String[] map,int idx){
        if(idx>=digits.length()){
            res.add(sb.toString());
            return;
        }
        else{
            int digit = digits.charAt(idx) - '0';
            String str=map[digit-2];
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                sb.append(c);
                recursion(digits,res,sb,map,idx+1);
                sb.setLength(sb.length()-1);
            }
        }
    }
}