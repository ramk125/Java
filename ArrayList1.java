import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

public class ArrayList1 {
    public static void main(String[] args) {
        // ✅ 1. Create an ArrayList of Books
        ArrayList<Book> books = new ArrayList<>();

        // ✅ 2. Add elements
        books.add(new Book("The Alchemist", "Paulo Coelho"));
        books.add(new Book("Atomic Habits", "James Clear"));
        books.add(new Book("Harry Potter", "J.K. Rowling"));

        System.out.println("Books collection: " + books);

        // ✅ 3. Access elements
        System.out.println("First book: " + books.get(0));

        // ✅ 4. Modify an element
        books.set(1, new Book("Clean Code", "Robert C. Martin"));
        System.out.println("After modification: " + books);

        // ✅ 5. Remove an element
        books.remove(2);
        System.out.println("After removal: " + books);

        // ✅ 6. Search for a book
        Book searchBook = new Book("The Alchemist", "Paulo Coelho");
        boolean exists = books.contains(searchBook); // Won't work due to different memory reference
        System.out.println("Is 'The Alchemist' in the collection? " + exists);

        // ✅ 7. Size of the list
        System.out.println("Number of books: " + books.size());

        // ✅ 8. Iterate through the list
        System.out.println("\nAll books:");
        books.forEach(System.out::println);

        // ✅ 9. Clear the list
        books.clear();
        System.out.println("\nBooks after clearing: " + books);

        // ✅ 10. Check if list is empty
        System.out.println("Is the list empty? " + books.isEmpty());
    }
}
