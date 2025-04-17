public class JaggedArrayExample {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        
        jaggedArray[0] = new int[2];  // Row 0 has 2 elements
        jaggedArray[1] = new int[4];  // Row 1 has 4 elements
        jaggedArray[2] = new int[3];  // Row 2 has 3 elements

        int value = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = value++;
            }
        }

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
