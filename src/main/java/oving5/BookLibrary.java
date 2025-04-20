package oving5;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookLibrary {

    private List<Book> books;

    

    public BookLibrary(List<Book> books) {
        this.books = books;
    }

    public boolean hasBook(Predicate<Book> predicate){
        return books.stream().anyMatch(predicate);

    }

    public int getBookCount(Predicate<Book> predicate){
        return (int) books.stream().filter(predicate).count();
    }

    public List<Book> getBooks(Predicate<Book> predicate){
        return books.stream()
                            .filter(predicate)
                            .collect(Collectors.toList());
    }
    
    
}
