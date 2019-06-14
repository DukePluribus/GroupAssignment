public class User {
    public String username;
    public String email;
    public String password;
    public boolean isTutor;

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getEmail(){return email;}
    public void setEmail(String email){ this.email=email;}
    public String getPassword(){ return password; }
    public void setPassword(String password){this.password=password; }
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
