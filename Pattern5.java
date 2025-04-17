public class Pattern5 {
    public static void main(String[] args) {
        
        int z=1;
        for(int i=0;i<4;i++)
        {
            for(int j=4-1;j>i;j--)
            {
              System.out.print(" ");
            }
            for(int k=0;k<z;k++)
            {
                System.out.print("*");
            }
            z=z+2;
            System.out.println();
        }
    }
}
