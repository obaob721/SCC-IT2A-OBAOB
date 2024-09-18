package firstjavaapp;

import java.util.Scanner;

public class Product {
    
    public void editProducts(Products[] pds, int id, int size){
       Scanner sc = new Scanner(System.in);
    for(int i = 0; i < size; i++){
      if(id == pds[i].pid){
          System.out.println("Enter new products "+pds[i].pid+":");
            System.out.print("Price: ");
            double ice = sc.nextDouble();
            System.out.print("Stock: ");
            int cks = sc.nextInt();
            System.out.print("Sold: ");
            int old = sc.nextInt();
            
            pds[i].price = ice;
            pds[i].stocks = cks;
            pds[i].sold = old;
      }
  }

}
     

    public void manageProducts() {
        Scanner sc = new Scanner(System.in);
        Products[] pr = new Products[100];
        
     int nump = 0, i, res;
     double ttp = 0, totalTEP = 0;
    
     do{
    System.out.println("Products Demo App");
    System.out.println("-------------------------------------");
    System.out.println("Actions:");
    System.out.println("1. Add Products");
    System.out.println("2. View Products");
    System.out.println("3. Edit Products");
    System.out.println("4. Delete Products");
    System.out.println("5. Exit");
    System.out.println("------------------------------------");

    System.out.print("Select an Option: ");
    int option = sc.nextInt();
    
     while(option > 5){
        System.out.print("Invalid Selection, Try Again: ");
        option = sc.nextInt();
    }
      switch(option){
        
        case 1:
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
        break;
        
        case 2:
            for(i = 0; i < nump; i++) {
            pr[i].viewProducts();
            ttp = ttp + (pr[i].price * pr[i].sold);
            totalTEP = totalTEP + pr[i].price * pr[i].stocks;
        }

        System.out.println("Total Profit: " + ttp);
        System.out.println("Total TEP: " + totalTEP);
    
        break;
        case 3:
            System.out.print("Enter id to update: ");
            int ids = sc.nextInt();
            editProducts(pr, ids, nump);
        break;
     }
        System.out.print("Do you want to continue ?  (1 / 0):  ");
        res =  sc.nextInt();

    }while(res != 0 );
}
}
