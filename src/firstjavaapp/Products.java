package firstjavaapp;

public class Products {
    String pname;
    int pid, stocks, sold;
    double price;

    public void addProducts(int id, String name, double prc, int stk, int sld) {
        this.pid = id;
        this.pname = name;
        this.price = prc;
        this.stocks = stk;
        this.sold = sld;
    }

    public void viewProducts() {
        double profit = this.price * this.sold;
        String status = (this.stocks < 1) ? "Out-of-Stock" : "Available";
        double tep = this.price * this.stocks;

        System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %-10.2f %-10s \n",
                this.pid, this.pname, this.price, this.stocks, this.sold, profit, tep, status);
    }
}

