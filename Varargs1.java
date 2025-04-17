class Varargs1 {
    static void displayDetails(String name, int... scores) {
        System.out.print(name + "'s Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        displayDetails("Alice", 85, 90, 78); // Alice's Scores: 85 90 78
        displayDetails("Bob", 92, 88);       // Bob's Scores: 92 88
        displayDetails("Charlie");           // Charlie's Scores:
    }
}
