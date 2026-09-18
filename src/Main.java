import java.awt.*;

void main(String[] args) {

    Library library = new Library();
    ConsoleUI consoleUI = new ConsoleUI(library);

    Book book1 = new Book("Allan Cooper", "The easiest way to bad code", "805", 1);
    Book book2 = new Book("Sarah Nova", "Bear Hits You", "2016", 2);
    Book book3 = new Book("Rajeh Aiter", "Your Friends hate me", "52106", 3);

    Member memb1 = new Member("James", 201);
    Member memb2 = new Member("Luna", 202);
    Member memb3 = new Member("Ashley", 203);

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    library.addMember(memb1);
    library.addMember(memb2);
    library.addMember(memb3);

    consoleUI.run();


    /*
        IO.println(library.loanBook(1, 87));
        IO.println(library.loanBook(2, 01613));
        library.printLoans();
        library.returnBook(2);
    */

}