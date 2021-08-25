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
        for (String i : complexInArray1)
            for (String j : complexInArray2)
                if (i.contains("i")&&j.contains("i"))
                    a=a-Integer.parseInt(i.substring(0, 1))*Integer.parseInt(j.substring(0, 1));
                else if (i.contains("i") && !j.contains("i"))
                    b=b+Integer.parseInt(i.substring(0,1))*Integer.parseInt(j);
                else if (!i.contains("i") && j.contains("i"))
                    b=b+Integer.parseInt(j.substring(0,1))*Integer.parseInt(i);
                else
                    a=a+Integer.parseInt(i)*Integer.parseInt(j);          
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
}
