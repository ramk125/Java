public class PerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;

        // Using String (Slow due to immutability)
        startTime = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < 10000; i++) {
            str += " World";
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by String: " + (endTime - startTime) + "ms");

        // Using StringBuilder (Fast due to mutability)
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            sb.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + "ms");
    }
}
