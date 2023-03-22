package pro.sky.java.course1.lesson1;

public class Book {
    private String nameOfBook;
    private Author author = new Author();
    private int publishingYear;
    public Book(String nameOfBook, Author author, int publishingYear) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getNameOfBook() {
        return nameOfBook;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
