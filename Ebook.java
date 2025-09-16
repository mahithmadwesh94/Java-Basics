public class Ebook extends Book {
    public String format;

    Ebook(String name,String author,int pageCount,String format){
        super(name, author, pageCount);
        this.format = format;
    }
    
}
