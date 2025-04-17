public class InitializerBlock {
    String name;
    int age;

    // Instance Initializer Block
    {
        System.out.println("Initializing Student Object...");
    }

    // Constructor 1
    public InitializerBlock(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    // Constructor 2
    public InitializerBlock(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        new InitializerBlock("Alice");
        new InitializerBlock("Bob", 22);
    }
}
