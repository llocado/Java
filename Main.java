public class Main{
    
    public static void main(String[] args){
        System.out.println("hola");
        MedianOfTwoSortedArrays x = new MedianOfTwoSortedArrays();
        float[] lista1={1,2,3};
        float[] lista2={4,6,7};
        float y = x.mergeAndSortArrays(lista1, lista2);
        System.out.println(y);
    }
}    