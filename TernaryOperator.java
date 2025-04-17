public class TernaryOperator {
    public static void main(String[] args) {
        int a=3,b=5,c=6;
        int d = (a < b) ? (a < c ?  a:c ) :(b<c? b: c) ;
        int e = (a > b) ? (a > c ?  a:c ) :(b>c? b: c) ;
        System.out.println("Grater: "+e+" Smaller: "+d);

    }
    
}
