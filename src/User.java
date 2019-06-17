public class User {
    private String username;
    private String email;
    private String password;
    private boolean isTutor;

    //username methods
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    //email methods
    public String getEmail(){return email;}
    public void setEmail(String email){ this.email=email;}
    //password methods
    public String getPassword(){ return password; }
    public void setPassword(String password){this.password=password; }
    //tutor methods
    public boolean getTutor(){
        return isTutor;
    }
    public void setTutor(boolean isTutor){
        this.isTutor=isTutor;
    }
    /*@Override
    public String toString(){
        return String.format()
    }*/
}
