package lesson7;

import java.util.*;

public class lab_7 {

    public static void main(String [] args){
        List<Book> bookList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers of books : ");
        int bookNum = scan.nextInt();
        for(int i = 0; i < bookNum; i++) {
            System.out.println("Enter ISBN");
            String ISBN = scan.next();
            System.out.println("Enter title");
            String title = scan.next();
            System.out.println("Enter authorName");
            String authorName = scan.next();
            System.out.println("Enter year");
            String year = scan.next();

            Book book = new Book(ISBN, title, authorName, year);
            bookList.add(book);
        }

        System.out.println("Enter desired ISBN ");
        String findISBN = scan.next();

        List<String> ISBNLst = new ArrayList<>();
        for(int i = 0; i<bookList.size(); i++)
        {
            ISBNLst.add(bookList.get(i).getISBN());
            for(int j =0; j<ISBNLst.size(); j++)
            {
                if(findISBN.equals(ISBNLst.get(j)))
                {
                    System.out.println("Your book title is ");
                    System.out.println(bookList.get(i).getTitle());
                }
                else
                {
                    System.out.println("Book is not found");
                }
            }
        }


    }

}