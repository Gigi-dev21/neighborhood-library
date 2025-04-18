package org.example;

import java.util.Scanner;

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
                "Book ID: %d, ISBN: %s, Title: %s",
                this.id, this.isbn, this.title
        );
    }
}

public class Main {
    public static void main(String[] args) {
        //intailzie a scanner so that we can use it later//
        Scanner scanner = new Scanner(System.in);
        //Array of books
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


        //Ask the use want they want to do//
        System.out.println("Please enter a number you want: \n1. Show Available Books\n2. Show Checked Out Books\n3. Exit");

        //Take the user input and store it in numberInserted
        int numberInserted = scanner.nextInt();

        //Based on the user input  create a while loop, that will iterate until numberInserted by user is 3
        while (numberInserted != 3) {
            //Based on the users input, create a switch statement or if statement and display the needed
            ///If inserted by user is 1 (show available books)///
            if (numberInserted == 1) {
                System.out.println("Available Books:");
                //Printing all the Available books, we use a loop because it's an array//
                for (int i = 0; i < books.length; i++) {
                    //Inorder to display only the Available books(meaning isCheckOut() == false)  we should use if statement to differentiate with the checkout book//
                    if (books[i].isCheckOut() == false) {
                        System.out.println(books[i]);
                    }
                }
                //After display the available books, we ask user what they want to do after//
                System.out.println("Please enter a number you want to proceed with : \n1. Check out a book\n2. Go back to the home screen\n3. exit");
                int userSecondchoice = scanner.nextInt();

              if(userSecondchoice ==1 ){
                  System.out.println("To checkout a book, please enter your name:");
                  scanner.nextLine();
                  String enteredName=scanner.nextLine();
                  System.out.println(enteredName);

                  System.out.println("To checkout a book, please enter your Book ID:");
                  int bookIdInsertedByUser = scanner.nextInt();
                  System.out.println(bookIdInsertedByUser);

                  if(!enteredName.isEmpty() && bookIdInsertedByUser != 0){
                      for (int i = 0; i < books.length; i++) {
                          if(bookIdInsertedByUser == books[i].getId()){
                              books[i].setIsCheckOut(true);
                              books[i].setCheckedOutTo(enteredName);
                              System.out.println("Thank you! You have checked out the book with ID: " + books[i].getId() +" Isbn: " + books[i].getIsbn()+ " titled: " + books[i].getTitle());
                          }

                      }

                  }

              }



                ///if inserted number is 2(show checked out books)///
            } else if (numberInserted == 2) {
                System.out.println("Checked out Books:");

                ///if the number inserted is not 1,2 or 3 it will print this/
            }else System.out.println("NO SUCH COMMAND AS: " + numberInserted);
//            switch (numberInserted) {
//                case 1:
//                    System.out.println("Available Books...");
//                    for (int i = 0; i < books.length; i++) {
//                        if (books[i].isCheckOut() == false) {
//                            System.out.println(books[i]);
//                        }
//                    }
//
//                    //Second choice
//
//                    int proceedChoice = 0;
//                    String nameprovided = "";
//
//                    while (proceedChoice != 2) {
//                        proceedChoice = scanner.nextInt();
//
//                        switch (proceedChoice) {
//                            case 1:
//                                System.out.println("To checkout a book, please enter your name:");
////                                nameprovided = scanner.nextLine();
////                                System.out.println("Name entered: " + nameprovided);
//                                break;
//                            case 2:
//                                System.out.println("Returning to home screen...");
//                                break;
//                            case 3:
//                                System.out.println("Thank you! Have a great day!");
//                                System.exit(0);
//                                break;
//                            default:
//                                System.out.println("Invalid input, please try again.");
//                        }
//
//
//                    }
//
//                    break;
//                case 2:
//                    System.out.println("Checked Out Books...");
//                    for (int i = 0; i < books.length; i++) {
//                        if (books[i].isCheckOut() == false) {
//                            System.out.println(books[i]);
//                        }
//                    }
//                    break;
//                default:
//                    System.out.println("NO SUCH COMMAND AS: " + numberInserted);
//                    break;
//            }

            System.out.println("Please enter a number you want: \n1. Show Available Books\n2. Show Checked Out Books\n3. Exit");
            numberInserted = scanner.nextInt(); // Update the user's choice
        }
        //If user input is 3, it will print this
        System.out.println("Thank you have a great day!");


//        System.out.println(books[0]);
//        for (int i = 0; i < books.length; i++) {
//            System.out.println(books[i]);
//        }
    }
}