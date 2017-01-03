package com.rahackya.ccassign;

import com.rahackya.ccassign.soapapp.User;
import com.rahackya.ccassign.soapapp.UserService;
import com.rahackya.ccassign.soapapp.UserServiceService;

import java.util.List;
import java.util.Scanner;

/**
 * Author: Rajmani Arya
 * Date: 03 Jan 2017
 */
public class App 
{
    final static String help = "\n ------------ Menu ----------------\n" +
            "\t1. Show All User\n"+
            "\t2. Get A User\n"+
            "\t3. Add User\n"+
            "\t4. Update User\n"+
            "\t5. Remove User\n"+
            "\t6. Exit\n";

    static void showAll(List<User> users) {
        System.out.println("\n-------- ALL USERS ---------");
        System.out.println("  Id\t\tFull Name");
        System.out.println("\n----------------------------");
        for (User user : users) {
            System.out.println(user.getId()+ "\t" + user.getName());
        }
    }

    static void show(User user) {
        System.out.println("\n-------- User Details ---------");
        System.out.println("User Id: " + user.getId());
        System.out.println("Roll No.: " + user.getRollno());
        System.out.println("Full Name: " + user.getName());
        System.out.println("Email Id: " + user.getEmail());
        System.out.println("Phone : " + user.getPhone());
        System.out.println("Company : " + user.getCompany());
    }

    public static void main( String[] args ) {
        UserServiceService userServiceService = new UserServiceService();
        UserService userService = userServiceService.getUserServicePort();
        User user = null;
        System.out.println(help);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Choose Option: ");
            int x = Integer.parseInt(sc.nextLine());
            switch (x) {
                case 1:
                    showAll(userService.showAll());
                    break;
                case 2:
                    System.out.print("\nEnter User Id: ");
                    show(userService.show(Integer.parseInt(sc.nextLine())));
                    break;
                case 3:
                    user = new User();
                    System.out.print("Enter Roll No.: "); user.setRollno(Integer.parseInt(sc.nextLine()));
                    System.out.print("User Name: "); user.setName(sc.nextLine());
                    System.out.print("Email Id: "); user.setEmail(sc.nextLine());
                    System.out.print("Phone : "); user.setPhone(sc.nextLine());
                    System.out.print("Company : "); user.setCompany(sc.nextLine());
                    if (userService.addUser(user)) {
                    	System.out.println("User added!");
                    } else {
                    	System.out.println("Some Error Occured!");
                    }
                    break;
                case 4:
                    System.out.print("\nEnter User Id to update: "); Integer id = Integer.parseInt(sc.nextLine());
                    user = new User();
                    System.out.print("Enter Roll No.: "); user.setRollno(Integer.parseInt(sc.nextLine()));
                    System.out.print("User Name: "); user.setName(sc.nextLine());
                    System.out.print("Email Id: "); user.setEmail(sc.nextLine());
                    System.out.print("Phone : "); user.setPhone(sc.nextLine());
                    System.out.print("Company : "); user.setCompany(sc.nextLine());
                    if (userService.editUser(id, user)) {
                    	System.out.println("User updated!");
                    } else {
                    	System.out.println("Some Error Occured!");
                    }
                    break;
                case 5:
                    System.out.print("\nEnter User Id to delete: ");
                    if (userService.destroyUser(Integer.parseInt(sc.nextLine()))) {
                    	System.out.println("User deleted!");
                    } else {
                    	System.out.println("Some Error Occured!");
                    }
                    break;
                case 6:
                    System.out.print("\nThanks for using this application!\n Regards-\n\tRajmani Arya \n");
                    System.exit(1);
                    break;
                default:
                    System.out.print(help);
            }
        }
    }
}
