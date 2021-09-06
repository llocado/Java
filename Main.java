import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){

        ArrayList<ArrayList<String>> lista2=new ArrayList<ArrayList<String>>();

        ArrayList<String> subLista =new ArrayList<String>();
        System.out.println(subLista.isEmpty());
        subLista.add("HOLA");
        subLista.add("COMO");
        subLista.add("ESTAS");

        lista2.add(subLista);

        System.out.println(lista2);

        lista2.add(subLista);

        System.out.println(lista2);

        System.out.println(lista2.get(0).add("de nuevo"));

        System.out.println(lista2);

    }
}    