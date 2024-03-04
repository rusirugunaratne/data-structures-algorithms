package linearStructures.bigO;

public class BigONotationTimeComplexity {
    // O(1)
    public void log(int[] numbers) {
        System.out.println(numbers[0]);
    }

    // O(n)
    public void logAll(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // O(n ^ 2)
    public void logCombinations(int[] numbers) {
        for (int first : numbers)
            for (int second : numbers)
                System.out.println(first + " " + second);
    }

    // O(log n)
    // binary search
    // we reduce our work by half in every step
    // more scalable than O(n)

    // O(2 ^ n)
    // exponential growth (opposite of logarithmic growth)

}
