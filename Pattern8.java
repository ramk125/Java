public class Pattern8 {
    public static void main(String[] args) {
        
        
        for(int i=4;i>0;i--)
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<2*i-1;j++)
            {
              System.out.print("x");
            }
            System.out.println();
        }

        // int i,j,k;
        // int n=4;
        // int z=n*2-1;
        // for(i=n;i>=1;i--)
        // {
        //     for(j=n-1;j>=i;j--)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(k=1;k<=z;k++)
        //     {
        //         System.out.print("x");
        //     }
        //     z=z-2;
        //     System.out.println();
        // }
    }
}
