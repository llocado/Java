import java.util.ArrayList;
import java.lang.Math;
public class ContainerWithMostWater{

    public int containerWithMostWater(ArrayList<Integer> alturasTanques){
        int size=alturasTanques.size();
        int areaMaxima=0;
        int left=0;
        int right=size-1;
        if (size==0 || size==1)
            return 0;
        else if (size==2){
            areaMaxima=Math.min(alturasTanques.get(0), alturasTanques.get(1));
            return areaMaxima;}
        while (left!=right){
            if (alturasTanques.get(left)>alturasTanques.get(right)){
                areaMaxima=Math.max(areaMaxima, alturasTanques.get(right)*(right-left));
                right--;
            }
            else{
                areaMaxima=Math.max(areaMaxima, alturasTanques.get(left)*(right-left));
                left++;
            }
            
        }
        System.out.println(areaMaxima);
        return areaMaxima;
    }
}