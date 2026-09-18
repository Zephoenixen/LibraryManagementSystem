import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public void addMember(Member member){
        members.add(member);
    }
    public void addLoan(Loan loan){
        loans.add(loan);
    }


    public Book getBook(int bookID) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getID() == bookID) {
                return books.get(i);
            }
        }
        return null;
    }

    public Member getMember(int memberID) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getID() == memberID) {
                return members.get(i);
            }
        }
        return null;
    }
    
    public boolean isAvailable(int bookID){
        for (int i = 0; i < loans.size(); i++) {
            if(loans.get(i).getBook().getID() == bookID){
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<Loan> findLoansByMemberID(int memberID){
        ArrayList<Loan> temp = new ArrayList<>();

        for (int i = 0; i < loans.size(); i++) {
            if (loans.get(i).getMember().getID() == memberID){
                temp.add(loans.get(i));
            }
        }
        return temp;
        
    }

    public boolean loanBook(int bookID, int memberID) {
        if (getMember(memberID) == null || getBook(bookID) == null) return false;
        if (isAvailable(bookID)) {
            Loan loan = new Loan(getBook(bookID), getMember(memberID));
            addLoan(loan);
            return true;
        }
        return false;
    }

    public boolean returnBook(int bookID) {
        for (int i = 0; i < loans.size(); i++) {
            if(loans.get(i).getBook().getID() == bookID){
                loans.remove(i);
                IO.println("Book has been successfully returned.");
                return true;
            }
        }
        IO.println("ERROR: Book has not been loaned");
        return false;
    }


    public void printBooks(){
        for (int i = 0; i < books.size(); i++) {
            IO.println(books.get(i));
        }
        IO.println();
    }
    public void printMembers(){
        for (int i = 0; i < members.size(); i++) {
            IO.println(members.get(i));
        }
        IO.println();

    }
    public void printLoans() {
        for (int i = 0; i < loans.size(); i++) {
            IO.println(loans.get(i));
        }
        IO.println();
    }
}
