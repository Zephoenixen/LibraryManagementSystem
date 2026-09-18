import java.awt.*;

void main(String[] args) {

    Library library = new Library();
    ConsoleUI consoleUI = new ConsoleUI(library);

    consoleUI.run();


    {/*
        Book book1 = new Book("Allan Cooper", "MongoMethods", "805", 1);
        Book book2 = new Book("Sarah Nova", "Bear Hits You", "2016", 2);
        Book book3 = new Book("Ragebaiter", "Fuck all y'all", "52106", 3);
        Member memb1 = new Member("James", 87);
        Member memb2 = new Member("Luna", 01613);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addMember(memb1);
        library.addMember(memb2);
        IO.println(library.loanBook(1, 87));
        IO.println(library.loanBook(2, 01613));
        library.printLoans();
        library.returnBook(2);
        IO.println(library.loanBook(2, 87));

        IO.println(library.findLoansByMemberID(87));
    */}

}