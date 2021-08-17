public class LongestCommonPrefix {
    public String longestString(String[] lista){
        if (lista.length==0)
            return "";
        String prefix = lista[0];
        for (int i=1; i<lista.length; i++){
            while (lista[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                    return "";
            }
        }
    return prefix;    
    }
    

    
}
