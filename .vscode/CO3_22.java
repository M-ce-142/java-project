
class BookNotAvailableException extends Exception {

    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {

    int availableBooks;

    Library(int books) {
        this.availableBooks = books;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Books remaining: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class CO3_22 {

    public static void main(String[] args) {

        Library lib = new Library(3);

        try {
            System.out.println("Issuing 2 books...");
            lib.issueBook(2);

            System.out.println("\nIssuing 2 more books...");
            lib.issueBook(2);

        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nProgram finished.");
    }
}
