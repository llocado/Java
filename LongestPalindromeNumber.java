public class LongestPalindromeNumber {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return ""; //En caso de que se ingrese un string muy vacio o de longitud 1
        int start = 0, end = 0; //inicio y termino del numero palindromo
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); //evalua la posible expansion del numero palindromo en caso de que el numero de cifras sea impar
            int len2 = expandAroundCenter(s, i, i + 1); //mismo caso pero en caso de que sea par
            int len = Math.max(len1, len2); //evalua cual es el mas largo
            if (len > end - start) {
                start = i - (len - 1) / 2; //asigna el valor inicial que se encuentra en el centro menos la mitad del largo del numero palindromo
                end = i + len / 2; //mismo caso, pero el numero final se encuentra la parte derecha del numero palindromo
            }
        }
        return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++; // se evalua hasta que parte del string es posible obtener un numero palindromo
        }
        return R - L - 1; //retorna el largo del numero palindromo
    }
}
