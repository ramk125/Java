
class StaticNastedHealperClass {
    static class Calculator {
        static int square(int num) {
            return num * num;
        }
    }

    public static void main(String[] args) {
        int result = StaticNastedHealperClass.Calculator.square(5);
        System.out.println("Square: " + result);
    }
}
