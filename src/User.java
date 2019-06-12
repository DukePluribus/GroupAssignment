public class User {
    public String username;
    public String email;
    public String password;
    public boolean isTutor;
    public User(String username, String email, String password){
        this.username=username;
        this.email=email;
        this.password=password;
        this.isTutor=false;
    }
}
