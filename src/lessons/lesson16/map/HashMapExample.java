package lessons.lesson16.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {


    static Map<String,Integer> myMap = new HashMap<>();

    public static void main(String[] args) {
        putMethodExample(myMap);
        getMethodExample(myMap,"Alex");
        containsKeyMethodExample(myMap,"Alex");
        containsKeyMethodExample(myMap,"Fedr");
        containsValueMethodExample(myMap,34);
        containsValueMethodExample(myMap,100);
        sizeMethodExample(myMap);
        removeByMethodExample(myMap,"Alex");
    }

    static void putMethodExample(Map<String, Integer> someMap){
        someMap.put("Alex", 34);
        someMap.put("Maks", 24);
        someMap.put("Igor", 22);
        someMap.put("Sveta", 44);
        someMap.put("Kate", 55);
        System.out.println(someMap);
    }

    static void getMethodExample(Map<String, Integer> someMap, String mapKey){
        System.out.println(someMap.get(mapKey));
    }

    static void containsKeyMethodExample(Map<String, Integer> someMap, String mapKey){
        System.out.println("Map contains key " + mapKey+ " "+   someMap.containsKey(mapKey));
    }
    static void containsValueMethodExample(Map<String, Integer> someMap, Integer valueKey){
        System.out.println("Map contains value " + valueKey+ " "+   someMap.containsValue(valueKey));
    }

    static void sizeMethodExample(Map<String, Integer> someMap){
        System.out.println("Map size is "+someMap.size());
    }

    static void removeByMethodExample(Map<String, Integer> someMap, String removeKet){
        System.out.println("before removing");
        for(Map.Entry<String,Integer> mapIterable :someMap.entrySet()){
            System.out.println(mapIterable.getKey() + " age is " + mapIterable.getValue());
        }
        someMap.remove(removeKet);

        System.out.println("after removing");
        for(Map.Entry<String,Integer> mapIterable :someMap.entrySet()){
            System.out.println(mapIterable.getKey() + " age is " + mapIterable.getValue());
        }
    }
}
