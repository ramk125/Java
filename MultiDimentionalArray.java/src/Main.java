import java.util.Scanner;

class M {
    public static void main(String[] args) {

        int num[][] = new int[3][4];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                Scanner sc= new Scanner(System.in);
                num[i][j]=sc.nextInt();
            }
        }
        System.out.println("The value of the array");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {

                System.out.print(num[i][j]+ " ");
            }
            System.out.println("\n");
        }
    }
}