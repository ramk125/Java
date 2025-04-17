public class Pattern6 {
    public static void main(String[] args) {
        for(int i=0;i<3;i++)
        {
            for(int k=0;k<i;k++)
            {
                System.out.print("   ");
            }
            for(int j=0;j < 5- 2 * i;j++)
            {
               // int j = 0; j < 5 - 2 * i; j++
                System.out.print(" * ");
            }
            System.out.println();
            
        }
        for(int i=1;i<3;i++)
        {
            for(int k=0;k<2-i;k++)
            {
                System.out.print("   ");
            }
            for(int j=0;j<1+2*i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
