public class Pattern7 {
    public static void main(String[] args) {
        
        for(int i=0;i<3;i++)
        {
           for(int j=0;j<2-i;j++)
           {
             System.out.print("   ");
           }
           for(int k=0;k<2*i+1;k++)
           {
             System.out.print(" x ");
           }
           System.out.println();
        }
    }
}
