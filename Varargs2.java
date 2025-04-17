class VarargsExample {
    static void Varargs2(int... nums) {
        System.out.println("Array length: " + nums.length);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Varargs2(10, 20, 30); // Internally, nums is treated as int[]
    }
}
