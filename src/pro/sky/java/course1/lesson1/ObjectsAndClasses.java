package pro.sky.java.course1.lesson1;
public class ObjectsAndClasses {
    public static void main(String[] args) {
        Author rowling = new Author("Joanne", "Rowling");
        System.out.println(rowling.getFirstName() + " " + rowling.getSecondName());
        Book harryPotter = new Book("Harry Potter", rowling, 2001);
        System.out.println(harryPotter.getNameOfBook() + " by " + rowling.getFirstName() + " " + rowling.getSecondName() + " " + harryPotter.getPublishingYear());
        harryPotter.setPublishingYear(2005);
        System.out.println("New publishing year is " + harryPotter.getPublishingYear());

        Author talkien = new Author("John", "Tolkien");
        System.out.println(talkien.getFirstName() + " " + talkien.getSecondName());
        Book lordOfTheRings = new Book("The Lord of the Rings", talkien, 1954);
        System.out.println(lordOfTheRings.getNameOfBook() + " by " + talkien.getFirstName() + " " + talkien.getSecondName() + " " + lordOfTheRings.getPublishingYear());
        lordOfTheRings.setPublishingYear(2001);
        System.out.println("New publishing year is " + lordOfTheRings.getPublishingYear());
    }
}

