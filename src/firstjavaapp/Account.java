
package firstjavaapp;

import java.util.Scanner;

public class Account {
    
    public static void editAccounts(Accounts[] ats, int id, int size){
    Scanner sc = new Scanner(System.in);
     for(int i = 0; i < size; i++){
       if(id == ats[i].pid){
          System.out.println("Enter new password: "+ats[i].pid+":");
            System.out.print("Password: ");
            String npr = sc.next();
            
            ats[i].password = npr;
            
      }
  }

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Accounts[] ac = new Accounts[100];
        
        int nump = 0, i, res;
        
        do{
    System.out.println("Accounts Demo App");
    System.out.println("-------------------------------------");
    System.out.println("Actions:");
    System.out.println("1. Add Accounts");
    System.out.println("2. View Accounts");
    System.out.println("3. Edit Accounts");
    System.out.println("4. Delete Accounts");
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
            System.out.print("Enter no. of Accounts: ");
        nump = sc.nextInt();
        
        for(i = 0; i < nump; i++) {
            System.out.println("Enter Details of Account " + (i + 1) + ": ");
            
            int id;
            boolean sameID;
            do {
                sameID = false;    
                System.out.print("Id: ");
                id = sc.nextInt();
                int x;
                for(x = 0; x < i; x++) {
                    if(ac[x].pid == id) {
                        System.out.println("ID already exists!");
                        sameID = true;
                        break;
                    }
                }
            } while(sameID);
            
            String fn, ln, eml, un, pw;
            boolean sameUsername, sameEmail;
            
            System.out.print("Firstname: ");
            fn = sc.next();
            
            System.out.print("Lastname: ");
            ln = sc.next();
            
            do {
                sameEmail = false;
                System.out.print("Email: ");
                eml = sc.next();
                int x;
                for(x = 0; x < i; x++) {
                    if(ac[x].email.equals(eml)) {
                        System.out.println("Email already exists!");
                        sameEmail = true;
                        break;
                    }
                }
            } while(sameEmail);
            
            do {
                sameUsername = false;
                System.out.print("Username: ");
                un = sc.next();
                int x;
                for(x = 0; x < i; x++) {
                    if(ac[x].username.equals(un)) {
                        System.out.println("Username already exists!");
                        sameUsername = true;
                        break;
                    }
                }
            } while(sameUsername);
        do {
                System.out.print("Password: ");
                pw = sc.next();
        }while (!Accounts.isPasswordValid(pw));
            
            ac[i] = new Accounts();
            ac[i].addAccounts(id, fn, ln, eml, un, pw);
        }
        break;
        case 2:
            for(i = 0; i < nump; i++) {
            ac[i].viewAccounts(); 
            }
        break;
        case 3:
        System.out.print("Enter id to update: ");
            int ids = sc.nextInt();
            editAccounts(ac, ids, nump);
        break;
         }
         
    
        System.out.print("Do you want to continue ?  (1 / 0):  ");
        res =  sc.nextInt();

    }while(res != 0 );
        
        

        

    } 
}

