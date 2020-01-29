package grayson.projects;

public class Bookshelf {

    private String favoriteBook;
    private int numberOfBooks;

    public Bookshelf(String favoriteBook, int numberOfBooks) {
        this.favoriteBook = favoriteBook;
        this.numberOfBooks = numberOfBooks;
    }

    public String getFavoriteBook() {
        return favoriteBook;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void removeBook(String favoriteBook) {
        favoriteBook = getFavoriteBook();
        System.out.println("I'd like to read " + favoriteBook);
    }
}
