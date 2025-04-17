enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
public class EnumValuesAndValuesOf {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Here are all apple Constants:");

        Apple allapples[]=Apple.values();

        for(Apple a: allapples)
        {
            System.out.println(a);
        }

        System.out.println();

        ap=Apple.valueOf("Winesap");
        System.out.println("ap contains "+ap);
    }
}
