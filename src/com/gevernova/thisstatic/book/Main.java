package com.gevernova.thisstatic.book;

public class Main {
    public static void main(String[] args) {
        LibraryManagement book1 = new LibraryManagement("Advanced Potion-Making", "Libatius Borage", 100001);
        LibraryManagement book2 = new LibraryManagement("Magical Drafts and Potions", "Arsenius Jigger", 100002);
        LibraryManagement book3 = new LibraryManagement("The Dark Forces: A Guide to Self-Protection", "Quentin Trimble", 100003);
        LibraryManagement book4 = new LibraryManagement("Fantastic Beasts and Where to Find Them", "Newt Scamander", 100004);
        LibraryManagement book5 = new LibraryManagement("Hogwarts: A History", "Bathilda Bagshot", 100005);
        LibraryManagement book6 = new LibraryManagement("The Tales of Beedle the Bard", "Beedle the Bard", 100006);
        LibraryManagement book7 = new LibraryManagement("The Standard LibraryManagement of Spells – Grade 1", "Miranda Goshawk", 100007);
        LibraryManagement book8 = new LibraryManagement("Quidditch Through the Ages", "Kennilworthy Whisp", 100008);
        LibraryManagement book9 = new LibraryManagement("Numerology and Grammatica", "Laurence Trelawney", 100009);
        LibraryManagement book10 = new LibraryManagement("Unfogging the Future", "Cassandra Vablatsky", 100010);
        book2.displayBookDetails(book2);
        book2.displayBookDetails(book6);
        LibraryManagement.displayLibraryName();
    }

}
