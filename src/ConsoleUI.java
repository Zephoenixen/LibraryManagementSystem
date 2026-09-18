public class ConsoleUI {
    private final Library library;

    public ConsoleUI(Library lib){
        this.library = lib;
    }

    public void showMenu(){

        IO.println();
        IO.println("1. Lån");
        IO.println("2. Aflever");
        IO.println("3. Vis alle lån");
        IO.println("0. Afslut");
        IO.println();
    }

    public void run(){
        boolean running = true;
        while (running) {
            showMenu();
            int choice = Integer.parseInt(IO.readln("Input menu choice: "));
            switch (choice) {
                case 1 -> borrowBook();
                case 2 -> returnBook();
                case 3 -> IO.println("Show all loans");
                case 0 -> running = false;
                default -> IO.println("ERROR try again");
            }
        }
    }

    private void returnBook() {

        int memberID = Integer.parseInt(IO.readln("Input your member ID: "));
        var yourLoans = library.findLoansByMemberID(memberID);

        IO.println(yourLoans);

        int bookID = Integer.parseInt(IO.readln("Input the ID of your borrowed book: "));

        Book book = library.getBook(bookID);
        for (Loan yourLoan : yourLoans) {
            if (yourLoan.getBook().getID() == bookID) {
                library.returnBook(bookID);
                IO.println("Your book has been returned");
                return;
            }
        };
        IO.println("This is not your book to return");


    }

    private void borrowBook() {
        library.printBooks();

        int memberID = Integer.parseInt(IO.readln("Indtast dit medlemsnummer: "));
        int bookID = Integer.parseInt(IO.readln("Indtast dit ID af bogen du vil låne: "));

        if(library.loanBook(bookID, memberID)){
            IO.println("Du har lånt: " + library.getBook(bookID) + ".");
        }
        else IO.println("Der er sket en fejl.");

    }



}
