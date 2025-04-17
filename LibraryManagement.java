import java.util.ArrayList;
import java.util.Scanner;

enum Genre {
    FICTION,
    NON_FICTION,
    SCIENCE,
    HISTORY,
    TECHNOLOGY,
    BIOGRAPHY;

    public static void displayGenres() {
        for (Genre g : Genre.values()) {
            System.out.println((g.ordinal() + 1) + ". " + g);
        }
    }

    public static Genre getGenreByIndex(int index) {
        if (index >= 1 && index <= Genre.values().length) {
            return Genre.values()[index - 1];
        }
        return null;
    }
}

class Book {
    int id;
    String title;
    String author;
    double price;
    Genre genre;

    public Book(int id, String title, String author, double price, Genre genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book ID: " + id +
               ", Title: " + title +
               ", Author: " + author +
               ", Price: $" + price +
               ", Genre: " + genre;
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addBook() {
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        System.out.println("Select Genre:");
        Genre.displayGenres();
        int genreChoice = scanner.nextInt();
        Genre genre = Genre.getGenreByIndex(genreChoice);

        if (genre == null) {
            System.out.println("❌ Invalid genre selected. Book not added.");
            return;
        }

        books.add(new Book(id, title, author, price, genre));
        System.out.println("✅ Book added successfully.");
    }

    public void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int id = scanner.nextInt();

        boolean removed = books.removeIf(book -> book.id == id);
        System.out.println(removed ? "🗑️ Book deleted." : "❌ Book not found.");
    }

    public void updateBook() {
        System.out.print("Enter Book ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Book book : books) {
            if (book.id == id) {
                System.out.print("Enter new Title: ");
                book.title = scanner.nextLine();

                System.out.print("Enter new Author: ");
                book.author = scanner.nextLine();

                System.out.print("Enter new Price: ");
                book.price = scanner.nextDouble();

                System.out.println("Select new Genre:");
                Genre.displayGenres();
                int genreChoice = scanner.nextInt();
                Genre genre = Genre.getGenreByIndex(genreChoice);

                if (genre != null) {
                    book.genre = genre;
                    System.out.println("✏️ Book updated successfully.");
                } else {
                    System.out.println("❌ Invalid genre. Update aborted.");
                }
                return;
            }
        }
        System.out.println("❌ Book not found.");
    }

    public void printBooks() {
        if (books.isEmpty()) {
            System.out.println("📭 No books in the library.");
        } else {
            System.out.println("\n📚 Book List:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Update Book");
            System.out.println("4. Print All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> library.addBook();
                case 2 -> library.deleteBook();
                case 3 -> library.updateBook();
                case 4 -> library.printBooks();
                case 5 -> System.out.println("👋 Exiting...");
                default -> System.out.println("❗ Invalid choice. Try again.");
            }
        } while (choice != 5);
    }
}
