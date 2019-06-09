import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library;

    public Library(){
        this.library = new ArrayList<Book>();
    }

    public void addBook(Book newBook){
        library.add(newBook);
    }

    public void printBooks(){
        for(Book add : library){
            System.out.println(add);
        }
    }

    public ArrayList<Book> searchByTitle (String title){
        ArrayList<Book> sbt = new ArrayList<Book>();
        for(Book book : library){
            if(StringUtils.included(book.title(),title)){
                sbt.add(book);
            }
        }
        return sbt;
    }

    public ArrayList<Book> searchByPublisher (String publisher){

        ArrayList<Book> sbp = new ArrayList<Book>();

        for(Book book : library){
            if(StringUtils.included(book.publisher(),publisher)){
                sbp.add(book);
            }
        }
        return sbp;
    }

    public ArrayList<Book> searchByYear(int year){

        ArrayList<Book> sby = new ArrayList<Book>();

        for(Book book : library){
            if(book.year()==year){
                sby.add(book);
            }
        }
        return sby;
    }
}
