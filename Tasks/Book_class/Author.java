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

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(o == null ||!(o instanceof Author)){
            return false;
        }

        Author that = (Author)o;
        return name.equals(that.name) && email.equals(that.email) && (gender == that.gender);
    }

    @Override
    public int hashCode(){
        int res = 17;
        res = 31 * res + name.hashCode();
        res = 31 * res + email.hashCode();
        res = 31 * res + (int)gender;

        return res;
    }
}
