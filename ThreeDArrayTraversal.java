public class ThreeDArrayTraversal {
    public static void main(String[] args) {
        int[][][] arr = {
            { {1, 2}, {3, 4} },   // Layer 0
            { {5, 6}, {7, 8} }    // Layer 1
        };

        for (int i = 0; i < arr.length; i++) {  // Traversing layers
            for (int j = 0; j < arr[i].length; j++) {  // Traversing rows
                for (int k = 0; k < arr[i][j].length; k++) {  // Traversing columns
                    System.out.println("Element at arr[" + i + "][" + j + "][" + k + "]: " + arr[i][j][k]);
                }
            }
        }
    }
}
