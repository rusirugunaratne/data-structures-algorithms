package linearStructures.hashTables;

import java.util.HashSet;
import java.util.Set;

public class JavaHashSet {
    // Map: maps a key to a value
    // Set: only have key (don't allow duplicates)
    public void removeDuplicates() {
        Set<Integer> set = new HashSet<>();
        int[] numbers = { 1, 2, 3, 4, 4, 5, 5, 6 };
        for (var number : numbers)
            set.add(number);
        System.out.println(set);
    }

    public char findFirstRepeatingCharacter(String input) {
        Set<Character> set = new HashSet<>();
        for (var character : input.toCharArray()) {
            if (set.contains(character))
                return character;
            set.add(character);
        }
        return Character.MIN_VALUE;
    }
}
