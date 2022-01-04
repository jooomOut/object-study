package jooom.chapter11;

import java.util.Hashtable;

/**
 * 불필요한 인터페이스의 상속으로 생기는 문제
 *
 * Properties는 String 타입만 허용하는데 HashSet의 인터페이스는
 * 그렇지 않아 문제가 생길 수 있음. 이를 상속에서 합성으로 변경해 해결한다.
 * */
public class Properties {
    private Hashtable<String, String> properties = new Hashtable<>();

    public String setProperties(String key, String value){
        return properties.put(key, value);
    }
    public String getProperties(String key){
        return properties.get(key);
    }
}
