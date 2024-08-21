
package firstjavaapp;

public class Product {
    String name;
    int pid, stocks;
    double price;

    public void addProduct(int id, String pname, int st, double pr ){
    this.name = pname;
    this.pid = id;
    this.price = pr;
    this.stocks = st;
   
  }
    public void viewProduct(){
        
        String status = (this.stocks < 1) ? "Out of Stock" : "Available" ;
        double tep = this.price  * this.stocks;
        System.out.printf("%-10d %-10s %-10d %-10.2f %-10s %-10.2f\n", 
                this.pid, this.name, this.stocks,this.price ,status, tep);
    }
    
  }

