package com.herit.compteBancaire;

import java.util.*;

public class Create {

    static List<User> users = new ArrayList<>();


    public static void initUserList() {
        User admin = new User("awatef", "dridi", "awatef@hotmail.fr", "AD123");
        users.add(admin);
    }

    public static void enter() {

        System.out.println("-------- BIENVENUE DANS VOTRE BANQUE --------");

        Scanner c = new Scanner(System.in);

        System.out.println("what do you want to do ");
        System.out.println("1.new user");
        System.out.println("2.login");
        System.out.println("3.Quitter");


        int choix = c.nextInt();
        switch (choix) {
            case 1:
                System.out.println("create your account");
                System.out.println("enter your name ");
                String name = c.nextLine();
                System.out.print("enter your lastname ");
                String lastname = c.nextLine();
                System.out.print("enter your email ");
                String email = c.nextLine();
                System.out.print("enter your password ");
                String pwd = c.nextLine();

                User u = new User(name, lastname, email, pwd);
                users.add(u);
                System.out.println("account created");
                break;

            //System.out.println("Users: " + users);

            case 2:

                System.out.print("déjà client!");
                System.out.println("ID: ");
                String ID = c.nextLine();
                System.out.print("password:");
                String pss = c.nextLine();
                break;
//                if (Objects.equals(ID, admin.email)) {
//                    if (Objects.equals(pss, admin.pwd)) {
//
//                        System.out.println("----MY account ----");
//                        System.out.println("1.consult account");
//                        System.out.println("2.deposit");
//                        System.out.println("3.remove");
//                        System.out.println("4.Tranfer");
//                        int choice = c.nextInt();
//                        switch (choice) {
//                            case 1:
//                                System.out.println(admin.myaccount.solde);
//                                break;
//                            case 2:
//                                Dépot D = new Dépot(admin.myaccount);
//                                break;
//                            case 3:
//                                Retrait R = new Retrait(admin.myaccount);
//                                break;
//                            case 4:
//                                System.out.println("en cours...");
//                                break;
//                            case 5:
//                                System.out.println("good bye");
//                                break;
//                        }
//                    }
//                    break;
//                }
            case 3:
                System.out.println("good bye");
                break;

        }

    }
}
