public class Palindrome {
    public Integer numero;
    public Integer numeroInv;
    public boolean isPalindrome;
    
    public Palindrome(Integer numero){
        this.numero = numero;
        String numeroString=String.valueOf(numero);
        String numeroStringInv = "";
        for (int i = numeroString.length()-1; i>=0; i--){
            numeroStringInv = numeroStringInv+numeroString.charAt(i);
        this.numeroInv = Integer.valueOf(numeroStringInv);  
        if (this.numeroInv==numero)
            this.isPalindrome = true;
        else
            this.isPalindrome = false;    
        }
    }
}
