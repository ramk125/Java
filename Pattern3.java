public class Pattern3 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==j)
                {
                    System.out.print(" X");
                }
                else if(i+j==4)
                {
                    System.out.print(" O");
                }
                else
                {
                    System.out.print(" -");
                }
            }
            System.out.println();
        }
    }
}
