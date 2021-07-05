import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su operacion:");

        System.out.println("1 para adicion");
        System.out.println("2 para sustraccion");
        System.out.println("3 para multiplicacion");
        System.out.println("4 para division");

        int choose=scan.nextInt();

        System.out.println("Ingrese dos números:");

        int x=scan.nextInt();
        int y=scan.nextInt();

        if (choose==1){
            System.out.println("El resultado es: " +add(x,y));
        }
        else if (choose==2){
            System.out.println("El resultado es: " +sub(x,y));
        }
        else if (choose==3){
            System.out.println("El resultado es: " +mul(x,y));
        }
        else if (choose==4){
            System.out.println("El resultado es: " +div(x,y));
        }
        else{
            System.out.println("Estas fuera de rango");
        }




    }
    public static int add(int x, int y){
        int n;
        n=x+y;
        return n;

    }
    public static int sub(int x, int y){
        int n;
        n=x-y;
        return n;
    }
    public static int mul(int x, int y){
        int n;
        n=x*y;
        return n;
    }
    public static int div(int x, int y){
        int n;
        n=x/y;
        return n;
    }

}
