public class Pattern1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              
               if(i==2 || j==2)
              {
                System.out.print(" X");
              }
              else
              {
                System.out.print(" O");
              }
              
            }
            System.out.println();
        }
    }
}
