public class ConsoleUI {
    private Library library;

    public ConsoleUI(Library lib){
        this.library = lib;
    }

    public void run(){
        boolean running = true;
        while (running) {
            showMenu();
            int choice = Integer.parseInt(IO.readln("Indtast valg: "));
            switch (choice) {
                case 1 -> borrowBook();
                case 2 -> returnBook();
                case 3 -> IO.println("Vis alle lån");
                case 0 -> running = false;
                default -> IO.println("Ugyldigt valg. Prøv igen");
            }
        }
    }

    private void returnBook() {

    }

    private void borrowBook() {

    }

    public void showMenu(){
        IO.println();
        IO.println("1. Lån");
        IO.println("2. Aflever");
        IO.println("3. Vis alle lån");
        IO.println("0. Afslut");
        IO.println();
    }

}
