package helper;

import services.Bankservices;

import java.util.logging.Logger;

public class InteractionShell {
    private static final Logger LOGGER = Logger.getLogger(InteractionShell.class.getName());
    private static final String APP_NAME = "Bank Application v_1.0.";
    private static final Bankservices service = new Bankservices();


    public static void loadAuthInterface(){
        LOGGER.info("loading auth interface");
        boolean exit = false;
        while (!exit)
        {
            loadAuthMenu();
            int option = Shellhelper.readOption();
            switch (option)
            {
                case 1 :
                    service.createAccount();
                    break;
                case 2:
                    service.connectToAccount();
                    break;
                case 3:
                    LOGGER.info("Exiting Application");
                    System.out.println("thank your for trusting us!!!");
                    exit = true;
                    break;
                default:
                    LOGGER.warning("Invalid: "+option);
            }
        }
    }

    private static void loadAuthMenu() {
        System.out.println("-------------------------------------------");
        LOGGER.info("loading auth interface");
        System.out.print("->");
        System.out.println("1.Create Account");
        System.out.print("->");
        System.out.println("2.Connect to Account ");
        System.out.print("->");
        System.out.println("3.Exit");

    }
    private static void loadAccounthMenu() {
        System.out.println("-------------------------------------------");
        LOGGER.info("loading Account interface");
        System.out.print("->");
        System.out.println("1.Account balance");
        System.out.print("->");
        System.out.println("2.Credit Account");
        System.out.print("->");
        System.out.println("3.withdraw Account");
        System.out.print("->");
        System.out.println("4.send Money");
        System.out.print("->");
        System.out.println("5.disconnected Money");


    }

    public static void loadAccountInterface() {
        LOGGER.info("loading Account interface");
        boolean exit = false;
        while (!exit)
        {
            loadAccounthMenu();;
            int option = Shellhelper.readOption();
            switch (option)
            {
                case 1 :
                    service.showBalance();
                    break;
                case 2:
                    service.creditAcount();
                    break;
                case 3:
                   service.withdrewAcount();
                    break;
                case 4:
                     service.sendMoney();
                    break;
                case 5:
                    service.logout();
                    LOGGER.info("exiting from account");
                    System.out.println("session closed successfully!!!!");
                    exit =true;
                    break;

                default:
                    LOGGER.warning("Invalid: "+option);


            }
        }
    }
    }
