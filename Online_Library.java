// Java program to implement library using class library.

package Exercise;

import java.util.Scanner;

class Library
{
    String[] books;
    int no_of_books;
    Scanner sc = new Scanner(System.in);
    
    Library()
    {   
        this.books = new String[50];
        this.no_of_books = 0;
    }
    
    void addBook(String book)
    {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " book has been added.");
    }
    void issueBook(String book)
    {
        for(int i = 0;i<books.length;i++)
        {
            if(this.books[i].equals(book))
            {
                System.out.println(book + " book has been issued.");
                this.books[i] = null;
                return;
            }
            System.out.println("Sorry " + book + " is not available in library.");
        }
    }
    void returnBook(String book)
    {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " book has been returned.");
    }
    public void showAvailableBooks()
    {
        System.out.println("Books available in library are: ");
        for (String book: this.books)
        {
            if(book == null)
            {
                continue;
            }
            System.out.println(book);
        }
    }
}

public class Online_Library
{
    public static void main(String[] args)
    {
        int T = 1;
        Scanner sc = new Scanner(System.in);
        Library lb = new Library();
        
        System.out.println("Welcome to Online Library");
        while(T<5)
        {
            System.out.println("\n1. Add Book\n2. Issue Book\n3. Return Book\n4. Show Available Books\n5. Exit");
            System.out.print("Enter your choice: ");
            switch(sc.nextInt())
            {
                case 1:
                    System.out.print("Enter book name: ");
                    lb.addBook(sc.next());
                    break;
                case 2:
                    System.out.print("Enter book name you want to issue: ");
                    lb.issueBook(sc.next());
                    break;
                case 3:
                    System.out.print("Enter book name you want to return: ");
                    lb.returnBook(sc.next());
                    break;
                case 4:
                    lb.showAvailableBooks();
                    break;
                case 5:
                    System.out.println("Thank You. Visit Again !!!");
                    break;
                default:
                    System.out.println("Enter a valid choice ...");
            }
        }
    }
}