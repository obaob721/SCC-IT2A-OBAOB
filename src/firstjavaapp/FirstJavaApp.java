package firstjavaapp;
import java.util.Scanner;

public class FirstJavaApp {
    public static void main(String[] args) {
  //      Grades grd = new Grades();
 //       grd.getGrade();
 
 Product pr = new Product();
 pr.addProduct(10011, "Soap", 10, 20);
 pr.viewProduct();
 
 Product pr1 = new Product();
 pr1.addProduct(10012,"Cards", 0, 50);
 pr1.viewProduct();
}         
}
