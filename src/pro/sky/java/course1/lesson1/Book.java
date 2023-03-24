package pro.sky.java.course1.lesson1;

public class Book {
    private String nameOfBook;
    private Author author;
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

    public String toString() {
        return "Name of book is " + this.nameOfBook + author + " in " + this.publishingYear;
    }

    public boolean equals(Book other) {
        if (this.nameOfBook.equals(other.nameOfBook) && this.author.equals(other.author) && this.publishingYear == other.publishingYear) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return java.util.Objects.hash(nameOfBook, author, publishingYear);
    }
}

