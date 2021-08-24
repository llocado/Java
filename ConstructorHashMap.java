import java.util.HashMap;

public class ConstructorHashMap extends HashMap<String,String> {
    String[] stringKey;
    String[] stringValue;

    public ConstructorHashMap(String[] stringKey, String[] stringValue){
        for (int i=0; i<stringKey.length;i++){
            this.put(stringKey[i], stringValue[i]);
        }
    }
}
