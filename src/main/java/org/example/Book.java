package org.example;

class Book {
    int id;
    String isbn;
    String title;
    Boolean isCheckOut;
    String checkedOutTo;

    Book(int id, String isbn, String title, boolean isCheckOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckOut = isCheckOut;
        this.checkedOutTo = checkedOutTo;

    }

    public void chekout(String name, boolean isCheckedOut) {
        this.checkedOutTo = name;
        this.isCheckOut = isCheckedOut;
    }

    public void chekIn() {
        this.checkedOutTo = "";
        this.isCheckOut = false;
    }

    //GETTERS
    public int getId() {
        return this.id;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isCheckOut() {
        return this.isCheckOut;
    }

    public String checkedOutTo() {
        return this.checkedOutTo;
    }

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsCheckOut(boolean isCheckOut) {
        this.isCheckOut = isCheckOut;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public String toString() {
        return String.format(
                "ID: %d | ISBN: %s | Title: %s | Checked Out To: %s",
                this.id, this.isbn, this.title, this.checkedOutTo
        );
    }
}