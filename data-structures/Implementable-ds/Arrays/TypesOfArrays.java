public class TypesOfArrays {
    public static void main(String[] args) {
        // 1. Fixed-length (single-dimensional) array
        String[] names = {"Adam", "Kevin", "Nuwan"};

        // 2. Multi-dimensional array (2D array)
        int[][] numbers = {
            {10, 20, 30, 40, 50},
            {5, 10, 15, 20, 25},
            {2, 4, 6, 8, 10}
        };

        // 3. Jagged array (array of arrays with different lengths)
        int[][] jagged = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        // 4. Dynamic array using ArrayList (resizable)
        java.util.ArrayList<String> dynamicNames = new java.util.ArrayList<>();
        dynamicNames.add("Alice");
        dynamicNames.add("Bob");
        dynamicNames.add("Charlie");

        // Print examples
        System.out.println("Fixed array: " + java.util.Arrays.toString(names));
        System.out.println("2D array element [1][2]: " + numbers[1][2]); // 15
        System.out.println("Jagged array element [2][3]: " + jagged[2][3]); // 9
        System.out.println("Dynamic array: " + dynamicNames);
    }
}