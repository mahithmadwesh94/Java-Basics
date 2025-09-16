import java.time.LocalDate;

public class OOPS {

    public static void main(String[] args) {
        User youngUser = new User("Mahith Vasisht","1994-09-12");
   
        //ABSTRACTION
        // System.out.printf("%s is born on %s \n", youngUser.getName(),youngUser.); //Cannot be Access as Birthday is private
        System.out.printf("%s is of your %d years old \n",youngUser.getName(),youngUser.currentAge());
        

        Book newBook  = new Book("Carmilla","Janardhan reddy",280);
        youngUser.borrow(newBook);

        Book newBook1  = new Book("Carmilla 2","Janardhan Shetty",300);
        youngUser.borrow(newBook1);

        AudioBook dracula = new AudioBook("Dracula", "Dan Brown", 30000);
        youngUser.borrow(dracula);

        Ebook batman = new Ebook("Batman", "Sydney Sheldon", 350,"PDF");
        youngUser.borrow(batman);

        System.out.printf("%s has borrowed books: %s",youngUser.getName(),User.borrowedBooks.toString());
    }
    
}
