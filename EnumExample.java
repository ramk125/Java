enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumExample {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("Value of ap: " + ap);

        ap = Apple.GoldenDel;
        System.out.println("ap contains GoldenDel.\n");

        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is red.");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is red.");
                break;
            case RedDel:
                System.out.println("Red Delicious is red.");
                break;
            case Winesap:
                System.out.println("Winesap is red.");
                break;
            case Cortland:
                System.out.println("Cortland is red.");
                break;

            default:
                break;
        }
    }

}
