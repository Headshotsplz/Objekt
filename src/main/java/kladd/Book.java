package kladd;

import java.util.ArrayList;

public class Book extends Ebok{
    private String title;
    private int pages;
    private int currentPage;
    private ArrayList<Author> authors;

    public Book(String title, int pages){
        this.pages = pages;
        this.title = title;
        this.currentPage = 0;
        this.authors = new ArrayList<>();
    }

    private void readPages(int pages){
        if (pages < 1) {
            throw new IllegalArgumentException("Cannot read less than 1 page");
        }
        
        if (currentPage + pages > this.pages) {
            throw new IllegalArgumentException("page cannot be bgger than currentPage");
        }
        currentPage += pages;
    }

    public void printInfo(){
        System.out.println(title + " " + pages + "Author: " + String.join(title, elements));
    }

    public double getProgress(){
        return ((double) currentPage/pages) * 100;
    }

    public void addAuthor(Author author){
        
        

    }

    public static void main(String[] args) {
        Author a1 = new Author("Stephen King");
        Author a2 = new Author("Peter Straub");

        Book b = new Book("Shawshank Redemption", 100);
        b.addAuthor(a1);
        b.addAuthor(a2);

        b.printInfo();

    }
}
