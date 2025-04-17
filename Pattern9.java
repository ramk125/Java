public class Pattern9 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                if (i == j) {
                    System.out.print(i + " ");
                } else if (i - 1 == j) {
                    System.out.print((i + 4) + " ");
                } else if (i - 2 == j) {
                    System.out.print((i + 7) + " ");
                } else if (i - 3 == j) {
                    System.out.print((i + 9) + " ");
                } else if (i - 4 == j) {
                    System.out.print((i + 10) + " ");
                }
            }
            System.out.println();
        }
    }
}
