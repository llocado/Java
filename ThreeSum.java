import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum{
    
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();    // crea la lista que contendra las listas que cumplan con las condiciones de que la suma de la sublista sea 0 y que los numeros no se repitan.
        for (int i = 0; i < nums.length-2; ++i) {
            if (i > 0 && nums[i] == nums[i-1]) continue; //como i empieza en 0, el condicional se hace falso con el primer statement (i>0), por tanto, no llega a ver la siguiente que daria error si es que se analizara para i=0 (nums[i] == nums[i-1])
            int target = -nums[i]; //guarda el valor de nums[i] con su signo contrario
            int l = i+1, r = nums.length-1;//la varia pivote es i, luego del resto del array se encuentra en el extremo izquierdo l y en el lado derecho r
            while (l < r) {
                if (nums[l]+nums[r] > target) r--; //como el array esta ordenado, si la suma es mayor, eso quiere decir que el valor de la suma debe bajar, disiminuyendo la posicion de r
                else if (nums[l] + nums[r] < target) l++; // mismo caso pero esta vez se debe aumentar el valor de suma, aumentando por tanto el valor de l
                else {
                    ret.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
                    while (l < r && nums[l] == nums[l-1]) l++; //esto evita que los valores se repiten
                    while (l < r && nums[r] == nums[r+1]) r--;
                }
            }
        }
        return ret;
    }
}
