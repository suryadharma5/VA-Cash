package ProejctAkhir.myapplication;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String name,description,gameType;
    public ArrayList<Item> items = new ArrayList<>();

    public Game(String name, String description, String gameType){
        this.name = name;
        this.description = description;
        this.gameType = gameType;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
}
