public class Pattern10Anuraj {
    public static void main(String[] args) {
        int n=5;
        int num=1;
        int k=5;
        for(int i=1;i<=n;i++)
        {
            int temp=num;
            for(int j=0;j<i;j++)
            {
                System.out.print(temp+" ");
                temp=temp-k-j;
            }
            --k;
            num=num+n-i+1;
            System.out.println();
        }
    }
}
