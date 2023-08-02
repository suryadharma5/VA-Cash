package ProejctAkhir.myapplication;

public class Item {
    private int id;
    private String name;
    private String shop;
    private String price;

    private String description;
    private int image;

    // CONSTRUCTOR + GETTER SETTER -> ALT + INSERT
    public Item(){

    }

    public Item(int id, String name, String shop, String price, String description, int image) {
        this.id = id;
        this.name = name;
        this.shop = shop;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
