import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    
    public List<List<Integer>> fourSum (Integer[] list){
        Arrays.sort(list);
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i=0;i<list.length-3;i++){
            for(int j=i+1;j<list.length-2;j++){
                int left = j+1,right=list.length-1;
                while(left<right){
                    if(list[i]+list[j]+list[left]+list[right]>0) right--;
                    else if (list[i]+list[j]+list[left]+list[right]<0) left++;
                    else{
                        result.add(Arrays.asList(list[i],list[j],list[left++],list[right--]));
                        while(left<right && list[left]==list[left-1]) left++;
                        while(left<right && list[right]==list[right+1]) right--;
                }
            }

            }
        }
        return result;
    }
}
