public class AudioBook extends Book{
    public int runTime;

    AudioBook(String name,String author,int runTime){
        super(name,author,0);
        this.runTime = runTime;
    }
}
