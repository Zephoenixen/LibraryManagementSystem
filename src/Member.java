public class Member {
    final String name;
    final int memberID;

    Member(String n, int ID){
        name = n;
        memberID = ID;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return memberID;
    }

    public String toString(){
        return String.format("%s (Lånernummer: %d)",name, memberID);
    }
}
