
public class Book {
    public String name;
    public String author;
    public int pageCount;

    Book(String name,String author,int pageCount){
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
    }


    public String toString(){
        return String.format("%s by %s",this.name,this.author);
    }
}
