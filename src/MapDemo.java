import java.io.CharArrayReader;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Car> hashMap=new HashMap<>();
        hashMap.put("test", new Car("Toyota", 1976));
        hashMap.put("key", new Car("BMW", 2005));
        hashMap.put("niva", new Car("Niva", 2001));
        hashMap.put("car", new Car("Lexus", 1999));

        iterateMap(hashMap);

        TreeMap<String, Car> treeMap = new TreeMap<>();
        treeMap.put("test", new Car("Toyota", 1976));
        treeMap.put("key", new Car("BMW", 2005));
        treeMap.put("niva", new Car("Niva", 2001));
        treeMap.put("car", new Car("Lexus", 1999));
        treeMap.put("key", new Car("Nissan", 2007)); //дублированный ключ - происходит замена

        iterateMap(treeMap);

        LinkedHashMap<String, Car> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("test", new Car("Toyota", 1976));
        linkedHashMap.put("key", new Car("BMW", 2005));
        linkedHashMap.put("niva", new Car("Niva", 2001));
        linkedHashMap.put("car", new Car("Lexus", 1999));

        iterateMap(linkedHashMap); //сохраняет порядок вставки

        System.out.println("treeMap = " + treeMap.higherKey("niva"));
        System.out.println("treeMap = " + treeMap.lowerKey("niva"));
    }

    private static void iterateMap(Map map){
        System.out.println();

        for (Map.Entry<String, Car> carEntry : (Iterable<Map.Entry<String, Car>>) map.entrySet()) {
            System.out.println(carEntry.getKey() + " - " + carEntry.getValue());
        }
    }
}
