public class Sorpresa {

    public static void main(String []args){
        int[] edades= new int[]{20,35,40,43,23};
        float total = 0;

        for (int posicion : edades) {
            total = total + posicion;

        }
        float promedio = total/edades.length;
        System.out.println("La suma de las edades es: " + total);
        System.out.println("El promedio de las edades es: " + promedio);
    }
}
