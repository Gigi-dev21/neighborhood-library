package org.example;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        //intailzie a scanner so that we can use it later//
        Scanner scanner = new Scanner(System.in);
        //Array of books
        Book[] books = {
                new Book(1, "ISBN978-0-01", "Love in Paris", true, "Gigi"),
                new Book(2, "ISBN978-0-02", "Hope Rising", false, ""),
                new Book(3, "ISBN978-0-03", "The Last Star", true, "Jamie"),
                new Book(4, "ISBN978-0-04", "Moonlight Tales", true, "Zara"),
                new Book(5, "ISBN978-0-05", "Legends of Fire", false, ""),
                new Book(6, "ISBN978-0-06", "Whispers of Time", true, "Nina"),
                new Book(7, "ISBN978-0-07", "Shadow City", true, "Chris"),
                new Book(8, "ISBN978-0-08", "Echoes Within", false, ""),
                new Book(9, "ISBN978-0-09", "Dreambound", true, "Maya"),
                new Book(10, "ISBN978-0-10", "Fragments", true, "Ian"),
                new Book(11, "ISBN978-0-11", "Beneath the Stars", false, ""),
                new Book(12, "ISBN978-0-12", "Fading Lights", true, "Ava"),
                new Book(13, "ISBN978-0-13", "The Forgotten Path", true, "Owen"),
                new Book(14, "ISBN978-0-14", "Golden Ashes", false, ""),
                new Book(15, "ISBN978-0-15", "Veiled Truth", true, "Noah"),
                new Book(16, "ISBN978-0-16", "The Hollow Road", true, "Emma"),
                new Book(17, "ISBN978-0-17", "Rise of Dawn", false, ""),
                new Book(18, "ISBN978-0-18", "Windswept", true, "Isla"),
                new Book(19, "ISBN978-0-19", "Chasing Horizons", true, "Aiden"),
                new Book(20, "ISBN978-0-20", "Breaking Silence", false, "")
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
                        System.out.println("ID: " + books[i].getId()
                                + " | ISBN: " + books[i].getIsbn()
                                + " | Title: " + books[i].getTitle());

                    }
                }
                //After display the available books, we ask user what they want to do after//
                System.out.println("Please enter a number you want to proceed with : \n1. Check out a book\n2. Go back to the home screen\n");
                int userSecondchoice = scanner.nextInt();

                if (userSecondchoice == 1) {
                    System.out.println("To checkout a book, please enter your name:");
                    scanner.nextLine();
                    String enteredName = scanner.nextLine();
                    System.out.println(enteredName);

                    System.out.println("To checkout a book, please enter your Book ID:");
                    int bookIdInsertedByUser = scanner.nextInt();
                    System.out.println(bookIdInsertedByUser);

                    if (!enteredName.isEmpty() && bookIdInsertedByUser != 0) {
                        for (int i = 0; i < books.length; i++) {
                            if (bookIdInsertedByUser == books[i].getId()) {
                                books[i].setIsCheckOut(true);
                                books[i].setCheckedOutTo(enteredName);
                                System.out.println("Thank you! You have checked out the book with ID: " + books[i].getId() + " Isbn: " + books[i].getIsbn() + " titled: " + books[i].getTitle());
                            }
                        }

                    }

                }

                ///if inserted number is 2(show checked out books)///
            } else if (numberInserted == 2) {
                System.out.println("Checked out Books:");
                for (int i = 0; i < books.length; i++) {
                    //Inorder to display only the Available books(meaning isCheckOut() == false)  we should use if statement to differentiate with the checkout book//
                    if (books[i].isCheckOut() == true) {
                        System.out.println(books[i]);
                    }

                }
                //After display the checkedout books, we ask user what they want to do after//
                System.out.println("Please enter a a letter you want to proceed with : \nC. Check In a book\nX. Go back to the home screen");
                scanner.nextLine();
                String userSecondchoiceCheckedOut = scanner.nextLine();

                if (userSecondchoiceCheckedOut.equalsIgnoreCase("C")) {
                    System.out.println("Please enter the ID of the book");
                    int idInsertedByUser= scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < books.length; i++) {
                        if (idInsertedByUser == books[i].getId()) {
                            books[i].setIsCheckOut(false);
                            books[i].setCheckedOutTo("");
                            System.out.println("Thank you! You have checked in the book with ID: " + books[i].getId() + " Isbn: " + books[i].getIsbn() + " titled: " + books[i].getTitle());
                        }
                    }
                }

                ///if the number inserted is not 1,2 or 3 it will print this/
            } else System.out.println("NO SUCH COMMAND AS: " + numberInserted);


            System.out.println("Please enter a number you want: \n1. Show Available Books\n2. Show Checked Out Books\n3. Check In a book\n4. Exit");
            numberInserted = scanner.nextInt(); // Update the user's choice
        }
        //If user input is 3, it will print this
        System.out.println("Thank you have a great day!");

    }
}