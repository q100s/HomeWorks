package pro.sky.java.course1.lesson1;

public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
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

    public String toString() {
        return " by " + this.firstName + " " + this.secondName;
    }

    public boolean equals(Author other) {
        if (this.firstName.equals(other.firstName) && this.secondName.equals(other.secondName)) {
            return true;
        }
        return false;
    }
    public int hashCode() {
        return java.util.Objects.hash(firstName, secondName);
    }
}
