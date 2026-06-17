package App;

import java.util.Scanner;

	public class LoadRegistrationApp {

	    static Scanner scanner = new Scanner(System.in);
	    static double loadBalance = 100.0; // initial balance

	    public static void main(String[] args) {
	        clearScreen();
	        validateUssdCode();

	        while (true) {
	            try {
	                clearScreen();
	                mainMenu();
	            } catch (Exception e) {
	                System.out.println("Invalid Input! Please enter a number.");
	                scanner.nextLine(); // clear buffer
	            }
	        }
	    }

	    public static void validateUssdCode() {
	        System.out.println("Dial *123# to access SMART Services");
	        System.out.print("Enter USSD Code: ");
	        String ussdCode = scanner.nextLine().trim();

	        if (ussdCode.isEmpty() || !ussdCode.equals("*123#")) {
	            System.out.println("Invalid USSD Code. Exiting...");
	            System.exit(0);
	        }
	    }

	    public static void mainMenu() {
	        System.out.println("BAL: P" + loadBalance);
	        System.out.println("1) SAYA ALL 99");
	        System.out.println("2) GIGA/ARAW-ARAW DATA");
	        System.out.println("3) ALLNET");
	        System.out.println("4) MAGIC");
	        System.out.println("5) UNLI TEXT");
	        System.out.println("6) Check Balance");
	        System.out.println("7) Exit");
	        System.out.print("Enter choice: ");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                sayaAllMenu();
	                break;
	            case 2:
	                gigaMenu();
	                break;
	            case 3:
	                allnetMenu();
	                break;
	            case 4:
	                magicMenu();
	                break;
	            case 5:
	                unliTextMenu();
	                break;
	            case 6:
	                checkBalance();
	                break;
	            case 7:
	                exitConfirmation();
	                break;
	            default:
	                System.out.println("Invalid Choice!");
	        }
	    }

	    public static void sayaAllMenu() {
	        clearScreen();
	        System.out.println("*** SAYA ALL ***");
	        System.out.println("Unli Call & Text + Data");
	        System.out.println("1) SAYA ALL 99  - 6GB  3 Days");
	        System.out.println("2) SAYA ALL 149 - 8GB  5 Days");
	        System.out.println("3) SAYA ALL 299 - 12GB 7 Days");
	        System.out.println("0) Back");
	        System.out.print("Enter choice: ");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                subscriptionConfirmation("SAYA ALL 99",  3, 99,  "6GB Data + Unli Call & Text");
	                break;
	            case 2:
	                subscriptionConfirmation("SAYA ALL 149", 5, 149, "8GB Data + Unli Call & Text");
	                break;
	            case 3:
	                subscriptionConfirmation("SAYA ALL 299", 7, 299, "12GB Data + Unli Call & Text");
	                break;
	            case 0:
	                return; // back
	            default:
	                System.out.println("Invalid Choice!");
	        }
	    }

	    public static void gigaMenu() {
	        clearScreen();
	        System.out.println("*** GIGA / ARAW-ARAW DATA ***");
	        System.out.println("1) GIGA15  - 1GB  1 Day");
	        System.out.println("2) GIGA50  - 3GB  3 Days");
	        System.out.println("3) GIGA99  - 6GB  7 Days");
	        System.out.println("4) GIGA299 - 15GB 30 Days");
	        System.out.println("0) Back");
	        System.out.print("Enter choice: ");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                subscriptionConfirmation("GIGA15",  1,  15,  "1GB Data");
	                break;
	            case 2:
	                subscriptionConfirmation("GIGA50",  3,  50,  "3GB Data");
	                break;
	            case 3:
	                subscriptionConfirmation("GIGA99",  7,  99,  "6GB Data");
	                break;
	            case 4:
	                subscriptionConfirmation("GIGA299", 30, 299, "15GB Data");
	                break;
	            case 0:
	                return; // back
	            default:
	                System.out.println("Invalid Choice!");
	        }
	    }

	    public static void allnetMenu() {
	        clearScreen();
	        System.out.println("*** ALLNET ***");
	        System.out.println("Unli Call & Text to All Networks");
	        System.out.println("1) ALLNET55  - 3 Days");
	        System.out.println("2) ALLNET100 - 7 Days");
	        System.out.println("3) ALLNET200 - 15 Days");
	        System.out.println("0) Back");
	        System.out.print("Enter choice: ");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                subscriptionConfirmation("ALLNET55",  3,  55,  "Unli Call & Text to All Networks");
	                break;
	            case 2:
	                subscriptionConfirmation("ALLNET100", 7,  100, "Unli Call & Text to All Networks");
	                break;
	            case 3:
	                subscriptionConfirmation("ALLNET200", 15, 200, "Unli Call & Text to All Networks");
	                break;
	            case 0:
	                return; // back
	            default:
	                System.out.println("Invalid Choice!");
	        }
	    }

	    public static void magicMenu() {
	        clearScreen();
	        System.out.println("*** MAGIC ***");
	        System.out.println("Unli Call to SMART/TNT + Data");
	        System.out.println("1) MAGIC29  - 300MB  1 Day");
	        System.out.println("2) MAGIC69  - 1.5GB  3 Days");
	        System.out.println("3) MAGIC129 - 3GB    7 Days");
	        System.out.println("0) Back");
	        System.out.print("Enter choice: ");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                subscriptionConfirmation("MAGIC29",  1, 29,  "300MB Data + Unli Call to SMART/TNT");
	                break;
	            case 2:
	                subscriptionConfirmation("MAGIC69",  3, 69,  "1.5GB Data + Unli Call to SMART/TNT");
	                break;
	            case 3:
	                subscriptionConfirmation("MAGIC129", 7, 129, "3GB Data + Unli Call to SMART/TNT");
	                break;
	            case 0:
	                return; // back
	            default:
	                System.out.println("Invalid Choice!");
	        }
	    }

	    public static void unliTextMenu() {
	        clearScreen();
	        System.out.println("*** UNLI TEXT ***");
	        System.out.println("Unli Text to All Networks");
	        System.out.println("1) GTEXT10 - 1 Day");
	        System.out.println("2) GTEXT25 - 3 Days");
	        System.out.println("3) GTEXT50 - 7 Days");
	        System.out.println("0) Back");
	        System.out.print("Enter choice: ");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                subscriptionConfirmation("GTEXT10", 1, 10, "Unli Text to All Networks");
	                break;
	            case 2:
	                subscriptionConfirmation("GTEXT25", 3, 25, "Unli Text to All Networks");
	                break;
	            case 3:
	                subscriptionConfirmation("GTEXT50", 7, 50, "Unli Text to All Networks");
	                break;
	            case 0:
	                return; // back
	            default:
	                System.out.println("Invalid Choice!");
	        }
	    }

	    public static void subscriptionConfirmation(String promo, int days, int price, String description) {
	        clearScreen();
	        System.out.println(description);
	        System.out.println("'pag nag " + promo + " ka today!");
	        System.out.println("Valid for " + days + " Day/s - P" + price);
	        System.out.println("1) Subscribe");
	        System.out.println("0) Back");
	        System.out.print("Enter choice: ");
	        int choice = scanner.nextInt();

	        if (choice == 1) {
	            if (loadBalance >= price) {
	                loadBalance -= price;
	                System.out.println("\nThank you! A text confirmation will be sent shortly.");
	                System.out.println("Discover MORE promos in the Smart App and get MORE");
	                System.out.println("points to redeem FREE promos.");
	                System.out.println("1) Get the Smart App NOW!");
	            } else {
	                System.out.println("\nInsufficient Balance! Please reload your SMART account.");
	            }
	            scanner.nextLine(); // clear buffer
	            System.out.print("\nPress Enter to continue...");
	            scanner.nextLine();
	        } else {
	            return; // back
	        }
	    }

	    public static void checkBalance() {
	        System.out.println("\nBAL: P" + loadBalance);
	        scanner.nextLine(); // clear buffer
	        System.out.print("Press Enter to continue...");
	        scanner.nextLine();
	    }

	    public static void exitConfirmation() {
	        scanner.nextLine(); // clear buffer
	        System.out.print("\nAre you sure you really want to exit? Type Y to proceed: ");
	        char choice = scanner.nextLine().trim().charAt(0);

	        if (choice == 'Y' || choice == 'y') {
	            System.out.println("Thank you for using SMART Services!");
	            System.exit(0);
	        }
	    }

	    public static void clearScreen() {
	        System.out.print("\033[H\033[2J");
	        System.out.flush();
	    }

	}

