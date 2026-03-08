import java.util.*;

public class ArrayOperations {

    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {4, 5, 6, 7, 8};

        // UNION
        Set<Integer> union = new HashSet<>();

        for (int i : firstArray) {
            union.add(i);
        }

        for (int j : secondArray) {
            union.add(j);
        }

        System.out.println("Union of arrays: " + union);

        // INTERSECTION
        Set<Integer> intersection = new HashSet<>();

        for (int i : firstArray) {
            for (int j : secondArray) {
                if (i == j) {
                    intersection.add(i);
                }
            }
        }

        System.out.println("Intersection of arrays: " + intersection);
    }
}