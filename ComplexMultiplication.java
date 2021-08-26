public class ComplexMultiplication {

    public String[] lista = new String[2];
    public int a;
    public int b;
    public String[] complexInArray1;
    public String[] complexInArray2;

    public void multiplicarComplejos(String cNumber1,String cNumber2){
        ComplexMultiplication complex = new ComplexMultiplication();
        complexInArray1=complex.separarParteRealDeParteCompleja(cNumber1);
        complexInArray2=complex.separarParteRealDeParteCompleja(cNumber2);

        a=complex.parteReal(complexInArray1)*complex.parteReal(complexInArray2)-complex.parteCompleja(complexInArray1)*complex.parteCompleja(complexInArray2);
        b=complex.parteReal(complexInArray1)*complex.parteCompleja(complexInArray2)+complex.parteReal(complexInArray2)*complex.parteCompleja(complexInArray1);
        
        System.out.println("El resultado es: "+a+"+"+b+"i");
    }
    
    public String[] separarParteRealDeParteCompleja(String numeroComplejo){
        if(numeroComplejo.contains("+"))
            lista=numeroComplejo.split("\\+",2);
        else    
            if (numeroComplejo.contains("i")){
                lista[0]="0";
                lista[1]=numeroComplejo;
            }
            else{
                lista[0]=numeroComplejo;
                lista[1]="0";
            }    
        return lista;
    }

    public int parteReal(String[] numeroComplejo){
        return Integer.parseInt(numeroComplejo[0]);
    }

    public int parteCompleja(String[] numeroComplejo){
        return Integer.parseInt(numeroComplejo[1].substring(0, numeroComplejo[1].indexOf("i")));

    }
}
