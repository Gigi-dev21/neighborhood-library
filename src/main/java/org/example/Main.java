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

    void chekout() {

    }

    void chekIn() {

    }
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
    }
}