

public class RangeAddition2{

    public int numFilas;
    public int numColumnas;
    public int[][] matriz;


    public RangeAddition2(int numFilas, int numColumnas){
        this.matriz = new int[numFilas][numColumnas];
    }

    public void addValueOps(int a, int b){
        for (int posicionFila=0; posicionFila<a; posicionFila++){
            for (int posicionColumna=0; posicionColumna<b; posicionColumna++){
                this.matriz[posicionFila][posicionColumna]++;
            }
        }
    }

    public void printMatrix(){
        for (int i =0; i<this.matriz.length;i++){
            for (int j=0; j<matriz[0].length;j++){
                System.out.print(this.matriz[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }

    public void findMaxValue(){
        int maxValue=0;
        int countMaxValue=0;
        for (int i =0; i<this.matriz.length;i++){
            for (int j=0; j<matriz[0].length;j++){
                if (this.matriz[i][j]>maxValue){
                    maxValue=this.matriz[i][j];
                    countMaxValue=1;
                }
                else if (this.matriz[i][j]==maxValue){
                    countMaxValue++;
                }
                else
                    continue;
            }
        }
        System.out.println("El valor mas alto de la matriz es "+maxValue+" y este valor se repite "+ countMaxValue+" veces");
    }   
}
