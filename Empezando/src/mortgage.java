import java.text.NumberFormat;
import java.util.Scanner;

public class mortgage {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese sus datos bancarios para dar a conocer su dividendo");
        System.out.println("ingrese el monto del prestamo");
        int prestamo=scan.nextInt();

        System.out.println("ingrese su tasa anual de interes");
        float tasaAnual= scan.nextFloat();
        float tasaMensual=tasaAnual/(12*100);

        System.out.println("Ingrese el numero de años del credito");
        int periodoDelPrestamo=scan.nextInt();

        double formulaInteres=Math.pow(1+tasaMensual,periodoDelPrestamo*12);
        double dividendo=prestamo*tasaMensual*formulaInteres/(formulaInteres-1);

        String dividendoFormatoPesos= NumberFormat.getCurrencyInstance().format(dividendo);


        System.out.println("Los dividendos de cada mes seran de: "+dividendoFormatoPesos);

    }
}
