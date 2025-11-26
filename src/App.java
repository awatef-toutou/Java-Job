import helper.InteractionShell;
import services.Bankservices;

public class App {
    public static void main(String[] args) {
        Bankservices.initializeUsers();
        InteractionShell.loadAuthInterface();

    }
}
