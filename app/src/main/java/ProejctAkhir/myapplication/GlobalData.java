package ProejctAkhir.myapplication;

import java.util.ArrayList;

public class GlobalData {
    //Value username
    public static String username;

    //Halaman Profile
    public static String topUp_value = "0";
    public static String cash = "Rp. 10000";

    public static ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    //  Game


    public ArrayList<Game> createGame () {
       ArrayList<Game> games = new ArrayList<Game>();
        //Mobile Game
        Game pubg = new Game("PUBG Mobile", "PUBG is a scary game", "mobile", R.drawable.img_game);
        pubg.items.add(new Item("UC Coin", "10000", "This is a coin"));
        pubg.items.add(new Item("Red Light", "50000", "This is a red light"));
        pubg.items.add(new Item("Pan", "60000", "This is a red light"));
        games.add(pubg);

        Game stumbleGuy = new Game("Stumble Guy", "Stumble Guy is a scary game", "mobile", R.drawable.img_game);
        stumbleGuy.items.add(new Item("Sword", "12000", "This is a sword"));
        stumbleGuy.items.add(new Item("Water", "65000", "This is a red light"));
        stumbleGuy.items.add(new Item("Character", "120000", "This is a character"));
        games.add(stumbleGuy);

        Game hayDay = new Game("Hay Day", "Hay Day is a scary game", "mobile", R.drawable.img_game);
        hayDay.items.add(new Item("Sword", "12000", "This is a sword"));
        hayDay.items.add(new Item("Water", "65000", "This is a red light"));
        hayDay.items.add(new Item("Character", "120000", "This is a character"));
        games.add(hayDay);

        Game clashRoyal = new Game("Clash Royal", "Clash Royal is a scary game", "mobile", R.drawable.img_game);
        clashRoyal.items.add(new Item("Sword", "12000", "This is a sword"));
        clashRoyal.items.add(new Item("Water", "65000", "This is a red light"));
        clashRoyal.items.add(new Item("Character", "120000", "This is a character"));
        games.add(clashRoyal);

        Game snakeIO = new Game("Snake IO", "Snake IO is a scary game", "mobile", R.drawable.img_game);
        snakeIO.items.add(new Item("Sword", "12000", "This is a sword"));
        snakeIO.items.add(new Item("Water", "65000", "This is a red light"));
        snakeIO.items.add(new Item("Character", "120000", "This is a character"));
        games.add(snakeIO);

        //PC Game
        Game valorant = new Game("Valorant", "Valorant is a scary game", "PC", R.drawable.img_game);
        valorant.items.add(new Item("Sword", "12000", "This is a sword"));
        valorant.items.add(new Item("Water", "65000", "This is a red light"));
        valorant.items.add(new Item("Character", "120000", "This is a character"));
        games.add(valorant);

        Game gta = new Game("GTA", "GTA is a scary game", "PC", R.drawable.img_game);
        gta.items.add(new Item("Sword", "12000", "This is a sword"));
        gta.items.add(new Item("Water", "65000", "This is a red light"));
        gta.items.add(new Item("Character", "120000", "This is a character"));
        games.add(gta);

        Game mineCraft = new Game("Minecraft", "Minecraft is a scary game", "PC", R.drawable.img_game);
        mineCraft.items.add(new Item("Sword", "12000", "This is a sword"));
        mineCraft.items.add(new Item("Water", "65000", "This is a red light"));
        mineCraft.items.add(new Item("Character", "120000", "This is a character"));
        games.add(mineCraft);

        Game fortNite = new Game("Fortnite", "Fortnite is a scary game", "PC", R.drawable.img_game);
        fortNite.items.add(new Item("Sword", "12000", "This is a sword"));
        fortNite.items.add(new Item("Water", "65000", "This is a red light"));
        fortNite.items.add(new Item("Character", "120000", "This is a character"));
        games.add(fortNite);

        Game asphalt = new Game("Asphalt", "Asphalt is a scary game", "PC", R.drawable.img_game);
        asphalt.items.add(new Item("Sword", "12000", "This is a sword"));
        asphalt.items.add(new Item("Water", "65000", "This is a red light"));
        asphalt.items.add(new Item("Character", "120000", "This is a character"));
        games.add(asphalt);

        //Console
        Game marioKart = new Game("Mario Kart", "Mario Kart is a scary game", "console", R.drawable.img_game);
        marioKart.items.add(new Item("Sword", "12000", "This is a sword"));
        marioKart.items.add(new Item("Water", "65000", "This is a red light"));
        marioKart.items.add(new Item("Character", "120000", "This is a character"));
        games.add(marioKart);

        Game fifa23 = new Game("FIFA 23", "FIFA 23 is a scary game", "console", R.drawable.img_game);
        fifa23.items.add(new Item("Sword", "12000", "This is a sword"));
        fifa23.items.add(new Item("Water", "65000", "This is a red light"));
        fifa23.items.add(new Item("Character", "120000", "This is a character"));
        games.add(fifa23);

        Game marioBros = new Game("Mario Bros", "Mario Bros is a scary game", "console", R.drawable.img_game);
        marioBros.items.add(new Item("Sword", "12000", "This is a sword"));
        marioBros.items.add(new Item("Water", "65000", "This is a red light"));
        marioBros.items.add(new Item("Character", "120000", "This is a character"));
        games.add(marioBros);

        Game pikmin = new Game("Pikmin 4", "Pikmin 4 is a scary game", "console", R.drawable.img_game);
        pikmin.items.add(new Item("Sword", "12000", "This is a sword"));
        pikmin.items.add(new Item("Water", "65000", "This is a red light"));
        pikmin.items.add(new Item("Character", "120000", "This is a character"));
        games.add(pikmin);

        Game pokemon = new Game("Pokemon Gold", "Pokemon Gold is a scary game", "console", R.drawable.img_game);
        pokemon.items.add(new Item("Sword", "12000", "This is a sword"));
        pokemon.items.add(new Item("Water", "65000", "This is a red light"));
        pokemon.items.add(new Item("Character", "120000", "This is a character"));
        games.add(pokemon);

        return games;
    }
}
