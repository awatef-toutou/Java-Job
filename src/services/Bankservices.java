package services;

import helper.InteractionShell;
import helper.Shellhelper;
import model.User;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Bankservices {
    private static final Logger LOGGER = Logger.getLogger(Bankservices.class.getName());
    private static Map<String, User> users = new HashMap<>(); //celui qui chercher la clé à qui appartient à cet user
    private User loggerUser= null; //l utilisateur qui vient de se connecter

    public static void initializeUsers()
    {
        users.put("admin@ex.com", new User("admin","admin","password","admin@ex.com"));
        users.put("test@ex.com", new User("test","test","password", "test@ex.com"));
    }

    public void createAccount() {
        System.out.println("Pease enter your first name: ");
        String firstname = Shellhelper.readEntry();
        System.out.println("Pease enter your last name: ");
        String lastname = Shellhelper.readEntry();
        String email = getEntryEmail();
        System.out.println("Please enter your password: ");
        String password = Shellhelper.readEntry();

        User user = new User(firstname,lastname,email,password);
        registerUser(user);

    }
    public void connectToAccount() {
        System.out.println("Please enter your email address: ");
        String email = Shellhelper.readEntry();
        System.out.println("Please enter your password: ");
        String password= Shellhelper.readEntry();

        loggerUser = loginUser(email, password);

        if(loggerUser!= null)
        {
            LOGGER.info("user connected successfully.");
            System.out.println("welcome back "+loggerUser.getFirstname()+" "+loggerUser.getLastname());
            System.out.println("------------------------------------------");
            InteractionShell.loadAccountInterface();

        }

    }

    private String getEntryEmail() {
        String email;
        while (true)
        {
            System.out.println("please enter your email adress : ");
            email = Shellhelper.readEntry();
            if(isEmailValid(email))
            {
                email = formedEmail(email);
                break;
            }
            System.out.println("Invalid email address.\n Email must contain '@' and '.' . EX: exemple@exemple.com");
        }
        return email;
    }


    private boolean isEmailValid(String email) {

        return email.contains("@")&&email.contains(".");

    }

    private String formedEmail(String email) {
        return  email.trim().toLowerCase(); //trim est chaine de caractere sans l espace//et que l email est en miniscule
    }


    private void registerUser(User user) {
        if (isUserRegistered(user.getEmail()))
        {
            LOGGER.warning("this email address "+user.getEmail()+"is already in use");
        }
        users.put(user.getEmail(), user);
        LOGGER.info("User with email"+user.getEmail()+"has been registered successfully");
    }

    private boolean isUserRegistered(String email) {
        return  users.containsKey(email);
    }



    private User loginUser(String email, String password) {
        if (!isUserRegistered(email))
        {
            LOGGER.warning("this address "+email+"is not registered");
            return null;
        }
        User user = findUserByEmail(email);
        if ((!user.getPassword().equals(password))){
            LOGGER.warning("Invalid or not existent email or password");
            return null;
        }
        return user;
    }

    private User findUserByEmail(String email) {

        return users.get(email); //find the user in the Map users by the email
    }

    public void showBalance() {
        BigDecimal balance = loggerUser.getAccount().getBalance();
        System.out.printf("Your actual balance is: [%.2f]", balance);
    }

    public void creditAcount() {
        System.out.println("Please enter the amount you would like to deposit");
         double amount = Shellhelper.readDoubleEntry();
         loggerUser.getAccount().deposit(amount);
         System.out.println("deposited "+ amount + "to the amount successfully");
         System.out.println();
         showBalance();
    }

    public void sendMoney() {
        String userEmail = loggerUser.getEmail();
        System.out.println("Please enter the email address  you would like to transfer: ");
        String receiverEmail = Shellhelper.readEntry();
        System.out.println("Please enter the amount  you would like to transfer: ");
        double amount = Shellhelper.readDoubleEntry();
        boolean success = transferMoney(userEmail, receiverEmail, amount);
        if (success)
        {
            System.out.println("Your transaction has been transferred successfully.");
        }
    }

    private boolean transferMoney(String fromEmail, String toEmail, double amount) {
        if (!isUserRegistered(toEmail))
        {
            LOGGER.warning("User with email " +toEmail+ " doess not exist.");
            return  false;
        }
        User fromUser = findUserByEmail(fromEmail);
        User toUser = findUserByEmail(toEmail);
        if (fromUser.getAccount().withdrew(amount))
           {
            toUser.getAccount().deposit(amount);
            return true;
           }
           LOGGER.warning("You don't have enough money to transfer");
           return false;
    }

    public void logout() {
        loggerUser = null; //se deconnecter d user en cour
    }

    public void withdrowAcount() {
        System.out.println("Please enter the amount  you would like to withdrew: ");
        double amount = Shellhelper.readDoubleEntry();

    }

    public void withdrewAcount() {
        System.out.println("Please enter the amount  you would like to withdrew: ");
        double amount = Shellhelper.readDoubleEntry();
        loggerUser.getAccount().withdrew(amount);
        showBalance();
        System.out.println();


    }
}
