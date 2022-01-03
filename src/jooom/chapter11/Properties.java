package jooom.chapter11;

import java.util.Hashtable;

public class Properties {
    private Hashtable<String, String> properties = new Hashtable<>();

    public String setProperties(String key, String value){
        return properties.put(key, value);
    }
    public String getProperties(String key){
        return properties.get(key);
    }
}
