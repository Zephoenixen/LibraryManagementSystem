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
        for (Book book : books) {
            if (book.getID() == bookID) {
                return book;
            }
        }
        return null;
    }

    public Member getMember(int memberID) {
        for (Member member : members) {
            if (member.getID() == memberID) {
                return member;
            }
        }
        return null;
    }
    
    public boolean isAvailable(int bookID){
        for (Loan loan : loans) {
            if (loan.getBook().getID() == bookID) {
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<Loan> findLoansByMemberID(int memberID){
        ArrayList<Loan> temp = new ArrayList<>();

        for (Loan loan : loans) {
            if (loan.getMember().getID() == memberID) {
                temp.add(loan);
            }
        }
        if(temp.isEmpty()) return null;
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
        for (Book book : books) {
            IO.println(book);
        }
        IO.println();
    }
    public void printMembers(){
        for (Member member : members) {
            IO.println(member);
        }
        IO.println();

    }
    public void printLoans() {
        for (Loan loan : loans) {
            IO.println(loan);
        }
        IO.println();
    }
}
