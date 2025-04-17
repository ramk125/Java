public class StringConstructor {
    public static void main(String[] args) {
        int[] codePoint={78,76,86,86,88,98,99};
        String str=new String(codePoint,0,6);
        System.out.println(str);
       // System.out.println(codePoint,0,codePoint.length);
    }
}
