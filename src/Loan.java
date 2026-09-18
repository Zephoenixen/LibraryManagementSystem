import java.time.LocalDate;

public class Loan {
    final Book book;
    final Member member;
    final LocalDate borrowedDate;


    Loan(Book b, Member m, LocalDate d){
        this.book = b;
        this.member = m;
        this.borrowedDate = d;
    }
    Loan(Book b, Member m){
        this.book = b;
        this.member = m;
        this.borrowedDate = LocalDate.now();
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public boolean isAvailable(){
        return borrowedDate == null;
    }

    public LocalDate getDueDate() {
        if(borrowedDate != null) {
            return borrowedDate.plusDays(14);
        }
        return null;
    }

    public boolean isOverdue(){
        return LocalDate.now().isAfter(borrowedDate.plusDays(14));
    }

    public String toString() {
        return String.format(
        """
        --- Book ---
        %s
        borrowed by:
        %s
        Due by: %s
        Is overdue? %s
        """, book,member,getDueDate(),isOverdue());
    }

}
