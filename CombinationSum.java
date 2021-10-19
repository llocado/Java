import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    
    public List<List<Integer>> combinationSum(int[] lista, int target){
        List<List<Integer>> resultado = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        back(target, lista, 0, curr, resultado);
        //System.out.println(resultado);
        return resultado;
    }


    public void back(int remainVal, int[] array, int start, List<Integer> subList, List<List<Integer>> resultado ){
        if (remainVal<0) return;
        else if (remainVal==0){ 
            resultado.add(new ArrayList<>(subList));
            //System.out.println(subList);
        }
        else{
            for(int i=start; i<array.length;i++){
                if(array[i]<=remainVal){
                    subList.add(array[i]);
                    //System.out.println(subList);
                    back(remainVal-array[i], array, i, subList, resultado);
                    subList.remove(subList.size()-1);
                }
            }
        }
    }
}