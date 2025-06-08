package oving3;

import java.util.ArrayList;

public class BookShelf {
    ArrayList<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public int getBookCount(){
        return books.size();
    }
    public Book getBook(int index){
        if (index < 0) {
            throw new IllegalArgumentException("");
        }
        return books.get(index);
    }
    @Override
    public String toString() {
        return books;
    }
    
}
