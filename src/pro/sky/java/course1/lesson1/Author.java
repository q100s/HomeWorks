package pro.sky.java.course1.lesson1;

public class Author {
    private String firstName;
    private String secondName;
    public Author(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public Author() {
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
}
