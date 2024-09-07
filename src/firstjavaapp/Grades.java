package firstjavaapp;

import java.util.Scanner;

public class Grades {
    public void getGrade(){
        Scanner s = new Scanner(System.in);
        
       String name; 
       int math, sc, eng, com;
       float ave, sum; 
     System.out.print("Enter your fullname: ");
     name = s.nextLine();
     System.out.println("Enter Marks In");
     System.out.print("Math: ");
     math = s.nextInt();
     System.out.print("Science: ");
     sc = s.nextInt();
     System.out.print("English: ");
     eng = s.nextInt();
     System.out.print("Computer: ");
     com= s.nextInt();
     
     System.out.println("\nGrade Detail: "); 
     System.out.print("Name: "+name);
     
     sum=math+sc+eng+com;
     ave =sum/4;
     System.out.println("\nTotal Marks: "+sum);     
     System.out.println(String.format("Average: %.2f",ave));
   }
   
}