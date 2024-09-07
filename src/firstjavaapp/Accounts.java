
package firstjavaapp;


public class Accounts {
    String firstname, lastname, email, username, password;
    int pid;

    public void addAccounts(int id, String fn, String ln,String eml,String un,String pw){
    this.pid = id;
    this.firstname = fn;
    this.lastname = ln;
    this.email = eml;
    this.username = un;
    this.password = pw;
    }
    
    public void viewAccounts(){
        
        System.out.printf("%-10d %-10s %-10s %-10s %-10s %-10s\n",
                this.pid, this.firstname,this.lastname,this.email,this.username,this.password );
    }
  
    public static boolean isPasswordValid(String pw) {
        if (pw.length() < 8){
            System.out.println("Password must be at least 8 characters long.");
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        String specialCharacters = "!@#$%^&*(),.?\":{}|<>_";
        for (char ch : pw.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') hasUpperCase = true;
            if (ch >= 'a' && ch <= 'z') hasLowerCase = true;
            if (ch >= '0' && ch <= '9') hasNumber = true;
            if (specialCharacters.indexOf(ch) >= 0) hasSpecialChar = true;
        }

        if (!hasUpperCase) {
            System.out.println("Password must contain at least one uppercase letter.");
            return false;
        }
        if (!hasLowerCase) {
            System.out.println("Password must contain at least one lowercase letter.");
            return false;
        }
        if (!hasSpecialChar) {
            System.out.println("Password must contain at least one special character.");
            return false;
        }
        if (!hasNumber) {
            System.out.println("Password must contain at least one number.");
            return false;
        }
        if (pw.toLowerCase().contains("admin") || 
            pw.toLowerCase().contains("password") || 
            pw.contains("1234")) {
            System.out.println("Must not contain common passwords.");
            return false;
        }
        return true;
    }
}

