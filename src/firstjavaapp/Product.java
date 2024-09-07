package firstjavaapp;

import java.util.Scanner;

public class Product {
     Scanner sc = new Scanner(System.in);
    Products[] pr = new Products[100];
        
    int nump, i;
    double ttp = 0, totalTEP = 0;

    public void manageProducts() {
        System.out.print("Enter number of products: ");
        nump = sc.nextInt();
        
        for(i = 0; i < nump; i++) {
            System.out.println("Enter details of Product " + (i+1) + ": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double pri = sc.nextDouble();
            System.out.print("Stocks: ");
            int st = sc.nextInt();
            System.out.print("Sold: ");
            int sold = sc.nextInt();
            
            pr[i] = new Products();
            pr[i].addProducts(id, name, pri, st, sold);
        }

        for(i = 0; i < nump; i++) {
            pr[i].viewProducts();
            ttp = ttp + (pr[i].price * pr[i].sold);
            totalTEP = totalTEP + pr[i].price * pr[i].stocks;
        }

        System.out.println("Total Profit: " + ttp);
        System.out.println("Total TEP: " + totalTEP);
  }
}