import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthDay;
    public static ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    User(String name,String birthDay){
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public String getName(){
        return this.name;
    }


    public int currentAge(){
        return Period.between(this.birthDay, LocalDate.now()).getYears();
    }

    public void borrow(Book newBook){
        borrowedBooks.add(newBook);
    }
}
