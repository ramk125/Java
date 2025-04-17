class FinalVariable {
    final int MAX_VALUE = 100;  // Final variable

    void show() {
        // MAX_VALUE = 200; // Compilation error: cannot reassign a final variable
        System.out.println("MAX_VALUE: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        obj.show();
    }
}
