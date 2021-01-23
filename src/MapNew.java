import java.util.HashMap;
import java.util.Map;

public class MapNew {
    public static void main(String[] args) {
        Map<String , Integer> newMap = new HashMap<>();
        newMap.put("Name1", 2000);
        newMap.put("Name2", 2005);

        System.out.println(newMap);

        newMap.clear();
        System.out.println(newMap);
    }
}
