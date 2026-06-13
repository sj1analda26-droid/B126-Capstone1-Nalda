package day17;

import java.util.Scanner;

public class Capstone_Nalda {

	 static Scanner input = new Scanner(System.in);

	    public static void main(String[] args) {

	        showHeader();

	        System.out.print("Enter USSD Code: ");
	        String ussd = input.nextLine();

	        if (ussd.equals("*123#")) {
	            showMainMenu();
	        } else {
	            System.out.println("Invalid USSD Code!");
	        }
	    }

	    public static void showHeader() {

	        System.out.println("================================");
	        System.out.println("      SMART LOAD REGISTRATION");
	        System.out.println("================================");
	        System.out.println("Dial *123# to access SMART Loads");
	    }

	    public static void showMainMenu() {

	        System.out.println("\nLoad Registration");
	        System.out.println("[1] Magic");
	        System.out.println("[2] Power All");
	        System.out.println("[3] All Data");
	        System.out.println("[4] Giga Promo");
	        System.out.println("[5] All Net");

	        System.out.print("Enter a choice: ");
	        int choice = input.nextInt();

	        switch (choice) {

	            case 1:
	                magicMenu();
	                break;

	            case 2:
	                powerAllMenu();
	                break;

	            case 3:
	                allDataMenu();
	                break;

	            case 4:
	                gigaPromoMenu();
	                break;

	            case 5:
	                allNetMenu();
	                break;

	            default:
	                System.out.println("Invalid Choice!");
	        }
	    }

	    public static void magicMenu() {

	        System.out.println("\n[1] Magic 59");
	        System.out.println("[2] Magic 99");
	        System.out.println("[3] Magic 159");

	        System.out.print("Enter a choice: ");
	        int choice = input.nextInt();

	        switch (choice) {

	            case 1:
	                subscribe("Magic 59");
	                break;

	            case 2:
	                subscribe("Magic 99");
	                break;

	            case 3:
	                subscribe("Magic 159");
	                break;
	        }
	    }

	    public static void powerAllMenu() {

	        System.out.println("\n[1] Power All 99");
	        System.out.println("[2] Power All 149");
	        System.out.println("[3] Power All 299");

	        System.out.print("Enter a choice: ");
	        int choice = input.nextInt();

	        switch (choice) {

	            case 1:
	                subscribe("Power All 99");
	                break;

	            case 2:
	                subscribe("Power All 149");
	                break;

	            case 3:
	                subscribe("Power All 299");
	                break;
	        }
	    }

	    public static void allDataMenu() {

	        System.out.println("\n[1] All Data 50");
	        System.out.println("[2] All Data 99");
	        System.out.println("[3] All Data 299");

	        System.out.print("Enter a choice: ");
	        int choice = input.nextInt();

	        switch (choice) {

	            case 1:
	                subscribe("All Data 50");
	                break;

	            case 2:
	                subscribe("All Data 99");
	                break;

	            case 3:
	                subscribe("All Data 299");
	                break;
	        }
	    }

	    public static void gigaPromoMenu() {

	        System.out.println("\n[1] Giga Video 99");
	        System.out.println("[2] Giga Stories 99");
	        System.out.println("[3] Giga Games 99");

	        System.out.print("Enter a choice: ");
	        int choice = input.nextInt();

	        switch (choice) {

	            case 1:
	                subscribe("Giga Video 99");
	                break;

	            case 2:
	                subscribe("Giga Stories 99");
	                break;

	            case 3:
	                subscribe("Giga Games 99");
	                break;
	        }
	    }

	    public static void allNetMenu() {

	        System.out.println("\n[1] All Net 99");
	        System.out.println("[2] All Net 199");
	        System.out.println("[3] All Net 299");

	        System.out.print("Enter a choice: ");
	        int choice = input.nextInt();

	        switch (choice) {

	            case 1:
	                subscribe("All Net 99");
	                break;

	            case 2:
	                subscribe("All Net 199");
	                break;

	            case 3:
	                subscribe("All Net 299");
	                break;
	        }
	    }

	    public static void subscribe(String promo) {

	        System.out.println("\nYou selected: " + promo);

	        System.out.println("[1] Subscribe");
	        System.out.println("[2] Exit");

	        System.out.print("Enter a choice: ");
	        int choice = input.nextInt();

	        switch (choice) {

	            case 1:
	                System.out.println("Successfully subscribed to " + promo);
	                break;

	            case 2:
	                System.out.println("Thank you for using SMART!");
	                break;

	            default:
	                System.out.println("Invalid Choice!");
	        }
	    }
}
