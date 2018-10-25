package Book_class;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", email=" + email + ", gender="+ gender + "] ";
    }

}
