package ProejctAkhir.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Item implements Parcelable {
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

    protected Item(Parcel in) {
        id = in.readInt();
        name = in.readString();
        shop = in.readString();
        price = in.readString();
        description = in.readString();
        image = in.readInt();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(shop);
        dest.writeString(price);
        dest.writeString(description);
        dest.writeInt(image);
    }
}
