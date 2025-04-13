package com.gevernova.thisstatic.book;

public class LibraryManagement {
//    Instance & Class Variables
    static final String LIBRARY_NAME = " The Hogwarts Library";
    String title;
    final int ISBN;
    String author;

    public static void displayLibraryName(){
        System.out.println(LIBRARY_NAME);
    }
    public LibraryManagement(String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public void displayBookDetails(Object obj){
        if(obj instanceof LibraryManagement){
            System.out.println("******** " + LIBRARY_NAME + " ********");
            System.out.println("Book Name : " + title);
            System.out.println("ISBN : " + ISBN);
            System.out.println("Author : " + author);

        }
    }
}
