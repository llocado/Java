

public class Main{
    
    public static void main(String[] args){
        RangeAddition2 x = new RangeAddition2(5, 5);
        System.out.println(x.matriz[1][1]);
        x.addValueOps(3,4);
        x.addValueOps(2,5);
        x.addValueOps(3,3);
        x.addValueOps(2,2);
        x.addValueOps(5,3);
        x.printMatrix();
        
        x.findMaxValue();
    }
}    