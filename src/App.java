public class App {

    public static void main(String args[]){
        Model model = new Model();
        Controller user1 = new Controller(model);
        Controller user2 = new Controller(model);        
        Controller user3 = new Controller(model);
    }
}