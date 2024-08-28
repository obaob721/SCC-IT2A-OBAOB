

package firstjavaapp;

public class Product {
    String name;
    int pid, stocks, sold;
    double price;

    public void addProduct(int id, String pname, double prc, int st, int sld){
    this.name = pname;
    this.pid = id;
    this.price = prc;
    this.stocks = st;
    this.sold = sld;
   
  }
    public void viewProduct(){
        
        String status = (this.stocks < 1) ? "Out of Stock" : "Available" ;
        double tep = this.price  * this.stocks;
        double profit =  this.price * this.sold;
        
        System.out.printf("%-10d %-10s %-10d %-10.2f %-10d %-10.2f %-10s %-10.2f\n", 
                this.pid, this.name, this.stocks,this.price ,this.sold, profit, status, tep);
    }
    
  }