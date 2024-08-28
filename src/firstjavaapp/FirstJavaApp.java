package firstjavaapp;
import java.util.Scanner;

public class FirstJavaApp {
    public static void main(String[] args) {
  //      Grades grd = new Grades();
 //       grd.getGrade();
 
 //Product pr = new Product();
 //pr.addProduct(10011, "Soap", 10, 20);
 //pr.viewProduct();
 
 //Product pr1 = new Product();
 //pr1.addProduct(10012,"Cards", 0, 50);
 //pr1.viewProduct();
   Scanner sc = new Scanner(System.in);
   Product[] pr = new Product[100];
   
   int nump, i;
        System.out.print("Enter no. of products: ");
        nump = sc.nextInt();
        double ttp = 0, totalTEP = 0;
        for(i = 0; i<nump;i++){
            System.out.println("Enter Details of Products: "+(i+1)+": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double prc = sc.nextDouble();
            System.out.print("Stock: ");
            int st = sc.nextInt();
            System.out.print("Sold: ");
            int sold = sc.nextInt();
            
            pr[i] = new Product();
            pr[i].addProduct(id, name, prc, st, sold);
        }
        for(i = 0; i<nump;i++){
        pr[i].viewProduct();
        
         ttp = ttp + (pr[i].price * pr[i].sold);
         totalTEP = totalTEP + pr[i].price * pr[i].stocks; 
        }
        System.out.println("Total Profit: "+ttp);
        System.out.println("Total TEP: "+totalTEP);
}         
}