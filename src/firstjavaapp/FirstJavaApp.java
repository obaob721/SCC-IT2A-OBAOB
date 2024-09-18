package firstjavaapp;

import java.util.Scanner;

public class FirstJavaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MAIN CLASS CHOICES");
        System.out.println("1. Grade");
        System.out.println("2. Product");
        System.out.println("3. Account");
        
        System.out.print("Choose a Main Class:");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                Grade grd = new Grade();
                grd.getGrade();
                break;
            case 2:
               Product product = new Product();
               product.manageProducts(); 
               break;
            case 3:
                Account.main(args); 
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }

}

