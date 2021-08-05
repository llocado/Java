public class Triangulo {

    public double base;
    public double altura;
    
    public Triangulo (int base, int altura){
        this.base=base;
        this.altura=altura;
    }    
    
    public void area(){
        double area = base*altura/2;
        System.out.println(area);
    }   
}
