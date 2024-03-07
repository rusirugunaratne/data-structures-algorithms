package linearStructures.hashTables;

public class HashFunction {
    public int numberToHash(int key) {
        // maps a number between 0 - 99
        return key % 100;
    }

    public int stringToHash(String key) {
        int hash = 0;
        for (var character : key.toCharArray())
            hash += character;
        return hash % 100;
    }

}
