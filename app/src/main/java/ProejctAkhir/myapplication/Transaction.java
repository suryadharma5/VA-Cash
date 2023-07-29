package ProejctAkhir.myapplication;

public class Transaction {
    private String name,item,quantity, price;


    public Transaction(String name, String item, String quantity, String price) {
        this.name = name;
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
