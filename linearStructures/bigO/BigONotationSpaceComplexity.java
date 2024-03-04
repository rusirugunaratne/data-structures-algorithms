package linearStructures.bigO;

public class BigONotationSpaceComplexity {
    // in space complexity we only think about the size of the additional variables
    // that we have to use in solving the problem
    // we do not consider the size of the input as getting space
    // only the additional ones

    // O(1)
    public void greet(String[] names) {
        // here we only have to add a variable inside the loop
        // to keep track of the iterations
        // this is independent of the size of the array -> O(1)
        for (int i = 0; i < names.length; i++)
            System.out.println("Hi " + names[i]);
    }

    // O(n)
    public void copy(String[] names) {
        // the more the items the array has, the more the space acquired by the copy
        // array
        String copy[] = new String[names.length];
    }

}
