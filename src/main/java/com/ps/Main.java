package com.ps;


import java.util.Collection;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void printMainMenu(Book[] collection) {


        userDisplay();
        while(true) {
            System.out.println("choose one of the following options:");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    userDisplay();
                    break;
                    case 2:
                        printAvailableBooks(collection);
                        break;
                        case 3:
                            printCheckedOutBooks(collection);
                            break;
                            case 4:
                                System.out.println("Exiting the application");
                                return;

            }

        }

    }

    public static void userDisplay(){

        System.out.println("Press 1 To go to home page");
        System.out.println("Press 2 To Show Available Books");
        System.out.println("Press 3 To Show Checked out Books");
        System.out.println("Press 4 To Exit Out Of The Application");



    };
    public static void printAvailableBooks(Book[] collection ) {
        for (int i = 0; i < collection.length; i++) {
            if (collection[i].isCheckedOut()==false) {
                System.out.println("The Following Book is available ID:  " +collection[i].getId()+ " |ISBN: "+collection[i].getIsbn()+ " |Title : " +collection[i].getTitle());
            }

        }

    }


    public static void checkoutBook(Book[] collection ){
        System.out.println("Enter the ID of the book to check out");
        int bookIDToCheckout = scanner.nextInt();
        System.out.println("Please enter your name: ");
        String userName = scanner.nextLine();
        if (collection[bookIDToCheckout].isCheckedOut()==false) {
            collection[bookIDToCheckout].setCheckedOut(true);
            collection[bookIDToCheckout].setIsbn(userName);
        }

    }
    public static void printCheckedOutBooks(Book[] collection){
        for (int i = 0; i < collection.length; i++) {
            if (collection[i].isCheckedOut()==true) {
                System.out.println("The Following Book is Checked Out ID " + collection[i].getId()+ " |ISBN: "+collection[i].getIsbn()+ " |Title : " +collection[i].getTitle());
            }



        }

    }
public static void checkInBook(Book[] collection){
    System.out.println("Enter The Id of the Book you want to check in: ");
        int checkInId= scanner.nextInt();
        if (collection[checkInId]. isCheckedOut()==true) {
            collection[checkInId].setCheckedOut(false);
            collection[checkInId].setCheckedOutTo("");
        }

}


    public static void main(String[] args) {
//       Book book1 = new Book(45454);
//        System.out.println(book1.getid());
//        book1.setID(123234);
//        System.out.println(book1.getid());
        Book[] collection = new Book[20];


                collection[0] = new Book(1, "978-0143128540", "The Martian", false, "");
                collection[1] = new Book(2, "978-0062316110", "The Alchemist", true, "Alice");
                collection[2] = new Book(3, "978-0307474278", "The Road", false, "");
                collection[3] = new Book(4, "978-1451673319", "Fahrenheit 451", true, "Bob");
                collection[4] = new Book(5, "978-0439139595", "Harry Potter and the Goblet of Fire", false, "");
                collection[5] = new Book(6, "978-0061120084", "To Kill a Mockingbird", false, "");
                collection[6] = new Book(7, "978-0385472579", "The Things They Carried", true, "Charlie");
                collection[7] = new Book(8, "978-0345803481", "Fifty Shades of Grey", false, "");
                collection[8] = new Book(9, "978-1501128035", "It Ends With Us", true, "Diana");
                collection[9] = new Book(10, "978-0385545969", "The Last Thing He Told Me", false, "");
                collection[10] = new Book(11, "978-1524763169", "Becoming", false, "");
                collection[11] = new Book(12, "978-0316015844", "Twilight", true, "Eve");
                collection[12] = new Book(13, "978-0140177398", "Of Mice and Men", false, "");
                collection[13] = new Book(14, "978-0060850524", "Brave New World", true, "Frank");
                collection[14] = new Book(15, "978-0141439518", "Pride and Prejudice", false, "");
                collection[15] = new Book(16, "978-0618640157", "The Hobbit", true, "Grace");
                collection[16] = new Book(17, "978-0451524935", "1984", false, "");
                collection[17] = new Book(18, "978-0307346605", "Eat, Pray, Love", true, "Hank");
                collection[18] = new Book(19, "978-0812981605", "The Power of Habit", false, "");
                collection[19] = new Book(20, "978-1594633669", "The Girl on the Train", true, "Isabel");


        printMainMenu(collection);


    }


        }




