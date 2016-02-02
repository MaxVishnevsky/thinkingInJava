package thinkingInJava;

/**
 * using finalize() for detecting object
 */
public class Book {

    public boolean checkedOut = false;

    public Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    public void checkIn() {
        checkedOut = false;
    }

    public void finalize() {
        if (checkedOut)
            System.out.println("Error: checkedOut");
//            super.finalize(); // usually it`s do like this
    }
}
