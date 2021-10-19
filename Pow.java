

public class Pow {
    public void pow(double base, int exponencial){
        double res = 1;
        if (exponencial==0) System.out.println(res);
        else if (exponencial > 0){
            for (int i =0; i<exponencial; i++)
                res=res*base;
            System.out.println(res);
        }
        else{
            for (int i = 0;i>exponencial;i--)
                res=res/base;
            System.out.println(res);    
        }
    }
}
