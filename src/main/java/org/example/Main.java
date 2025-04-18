package org.example;

import java.util.Scanner;

class Book {
    int id;
    String isbn;
    String title;
    boolean isCheckOut;
    String checkedOutTo;

    Book(int id, String isbn, String title, boolean isCheckOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckOut = isCheckOut;
        this.checkedOutTo = checkedOutTo;

    }

    public void chekout() {}
    public void  chekIn() {}

    //GETTERS
    public int getId() {return this.id;}
    public String isbn() {return this.isbn;}
    public String title() {return this.title;}
    public boolean isCheckOut() {return this.isCheckOut;}
    public String checkedOutTo() {return this.checkedOutTo;}

    //SETTERS
    public void setId(int id) { this.id= id;}
    public void setIsbn( String isbn) { this.isbn= isbn;}
    public void setTitle( String title) { this.title= title;}
    public void setIsCheckOut( boolean isCheckOut) { this.isCheckOut= isCheckOut;}
    public void setCheckedOutTo( String checkedOutTo) { this.checkedOutTo= checkedOutTo;}
}

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner myScanner = new Scanner(System.in);
        Book[] books = {
                new Book(1, "ISBN978-0-01", "Love in Paris", true, "Gigi"),
                new Book(2, "ISBN978-0-02", "Hope Rising", false, "Alex"),
                new Book(3, "ISBN978-0-03", "The Last Star", true, "Jamie"),
                new Book(4, "ISBN978-0-04", "Moonlight Tales", true, "Zara"),
                new Book(5, "ISBN978-0-05", "Legends of Fire", false, "Leo"),
                new Book(6, "ISBN978-0-06", "Whispers of Time", true, "Nina"),
                new Book(7, "ISBN978-0-07", "Shadow City", true, "Chris"),
                new Book(8, "ISBN978-0-08", "Echoes Within", false, "Sam"),
                new Book(9, "ISBN978-0-09", "Dreambound", true, "Maya"),
                new Book(10, "ISBN978-0-10", "Fragments", true, "Ian"),
                new Book(11, "ISBN978-0-11", "Beneath the Stars", false, "Elle"),
                new Book(12, "ISBN978-0-12", "Fading Lights", true, "Ava"),
                new Book(13, "ISBN978-0-13", "The Forgotten Path", true, "Owen"),
                new Book(14, "ISBN978-0-14", "Golden Ashes", false, "Liam"),
                new Book(15, "ISBN978-0-15", "Veiled Truth", true, "Noah"),
                new Book(16, "ISBN978-0-16", "The Hollow Road", true, "Emma"),
                new Book(17, "ISBN978-0-17", "Rise of Dawn", false, "Eli"),
                new Book(18, "ISBN978-0-18", "Windswept", true, "Isla"),
                new Book(19, "ISBN978-0-19", "Chasing Horizons", true, "Aiden"),
                new Book(20, "ISBN978-0-20", "Breaking Silence", false, "Sophie")
        };
    }
}