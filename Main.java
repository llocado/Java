import java.util.ArrayList;

public class Main{
    
    public static void main(String[] args){
        Integer[] alturas={10,4,3,7,4,9,10};
        ArrayList<Integer> lista= new ArrayList<>();
        for(int i=0;i<alturas.length;i++){
            lista.add(i,alturas[i]);
        }
        ContainerWithMostWater x = new ContainerWithMostWater();
            x.containerWithMostWater(lista);
    }
}    