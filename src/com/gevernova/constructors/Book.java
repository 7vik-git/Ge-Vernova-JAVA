package com.gevernova.constructors;

public class Book {
    private String title;
    private String author;
    private int price;
    private boolean isAvailable;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void isBookAvailable(){
        if(this.isAvailable){
            System.out.println("Book is available");
        }else{
            System.out.println("Book is not available");
        }
    }

    public void borrowBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
            System.out.println("Here is your book, pls pay a security deposit of " + this.price + "$");
        } else {
            System.out.println("Sorry the Book is out of Stock");
        }
    }

    public void returnBook() {
        this.isAvailable = true;
        System.out.println("Thank you for returning the Book in great condition");
    }
}
    class Main{
        public static void main(String[] args) {
            Book book1 = new Book("The Game of Thrones", "George RR Martin", 15);
            Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 12);
            Book book3 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 10);
            Book book4 = new Book("1984", "George Orwell", 8);
            Book book5 = new Book("To Kill a Mockingbird", "Harper Lee", 9);
            Book book6 = new Book("The Catcher in the Rye", "J.D. Salinger", 11);
            Book book7 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 20);
            Book book8 = new Book("The Alchemist", "Paulo Coelho", 7);
            Book book9 = new Book("Sapiens", "Yuval Noah Harari", 18);
            Book book10 = new Book("Atomic Habits", "James Clear", 14);

            book1.borrowBook();
            book1.isBookAvailable();
            book1.returnBook();
            book5.borrowBook();
            book9.isBookAvailable();
        }
    }

