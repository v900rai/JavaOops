package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class SetValue {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //Adding key-value pairs to HashMap

        map.put(1, "AAA");

        map.put(2, "BBB");

        map.put(3, "CCC");

        map.put(4, "DDD");

        map.put(5, "EEE");

        //Retrieving the Key Set

        Set<Integer> keySet = map.keySet();

        for ( Integer key : keySet)
        {
            System.out.println(key);
        }
    }
}
