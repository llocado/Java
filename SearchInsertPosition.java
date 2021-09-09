public class SearchInsertPosition {
    /*Given a sorted array of distinct integers and a target value, return the index if the target is found. 
    If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.*/



    public String searchInsertPosition (int[] lista,int target){//Usare un algoritmo del tipo binary search para este codigo
        int left=0;
        int right=lista.length-1;
        int middle=0;
        while(left<right){
            middle=(right+left)/2;
            if (right-left==1) break;
            if (target==lista[middle])
                return Integer.toString(middle); 
            else if (target<lista[middle])
                right=middle;
            else if (target>lista[middle])
                left=middle;
        }
        return ("El valor ingresado no se encuenrtra en el array, pero de estarlo, se encontraria en el index "+(middle+1));
    }
}
