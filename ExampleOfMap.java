import java.util.HashMap;
import java.util.Map;

public class ExampleOfMap {
    public static void main(String[] args){
        Map<String,Integer> hs = new HashMap<>();
        hs.put("Akanksha",56);
        hs.put("Sahil",89);
        hs.put("anshul",90);
        hs.put("shamira",67);
        hs.put("Akanksha",89);
        System.out.println(hs.keySet());
        for(String s:hs.keySet()){
            System.out.println(s + ":" + hs.get(s));
        }

    }
}
