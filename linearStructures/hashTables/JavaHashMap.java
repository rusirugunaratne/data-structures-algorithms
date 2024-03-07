package linearStructures.hashTables;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public void hashMap() {
        // Key: Employee Number (int)
        // Value: Name (String)
        // we have an interface called Map
        // HashMap is an implementation of this Map
        // HashMap cannot have duplicate keys
        // HashMap allows both null keys and null values
        // map.put(null, null) -> valid if any one or both are null
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rusiru");
        map.put(2, "Anjana");
        map.remove(2);
        map.get(1);
        map.containsKey(1); // O(1)
        map.containsValue("Rusiru"); // O(n) -> has to iterate over all the objects

        // looping in a hash map
        for (var item : map.keySet()) {
        } // iterate over keys
        for (var item : map.entrySet()) {
        } // iterate over key value pairs
    }

    public char findFirstNonRepeatingCharacter(String input) {
        // a green apple -> should return g
        Map<Character, Integer> map = new HashMap<>();
        for (char character : input.toCharArray()) {
            var count = map.containsKey(character) ? map.get(character) : 0;
            map.put(character, count + 1);
        }
        for (char character : input.toCharArray())
            if (map.get(character) == 1)
                return character;

        return Character.MIN_VALUE;
    }
}
