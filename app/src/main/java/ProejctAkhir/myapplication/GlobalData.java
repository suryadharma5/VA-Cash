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
        pubg.items.add(new Item("Belt", "10000", "This is a coin"));
        pubg.items.add(new Item("Backpack", "50000", "This is a red light"));
        pubg.items.add(new Item("Pain Killer", "60000", "This is a red light"));
        games.add(pubg);

        Game stumbleGuy = new Game("Stumble Guys", "Stumble Guy is a scary game", "mobile", R.drawable.img_game);
        stumbleGuy.items.add(new Item("275 Gems", "12000", "This is a sword"));
        stumbleGuy.items.add(new Item("900 Gems", "65000", "This is a red light"));
        stumbleGuy.items.add(new Item("1800 Gems", "120000", "This is a character"));
        games.add(stumbleGuy);

        Game hayDay = new Game("Hay Day", "Hay Day is a scary game", "mobile", R.drawable.img_game);
        hayDay.items.add(new Item("Bacon Pie", "12000", "This is a sword"));
        hayDay.items.add(new Item("Cotton Shirt", "65000", "This is a red light"));
        hayDay.items.add(new Item("Wooly Chaps", "120000", "This is a character"));
        games.add(hayDay);

        Game clashRoyal = new Game("Clash Royale", "Clash Royal is a scary game", "mobile", R.drawable.img_game);
        clashRoyal.items.add(new Item("80 Gems", "12000", "This is a sword"));
        clashRoyal.items.add(new Item("500 Gems", "65000", "This is a red light"));
        clashRoyal.items.add(new Item("1800 Gems", "120000", "This is a character"));
        games.add(clashRoyal);

        Game snakeIO = new Game("Among Us", "Snake IO is a scary game", "mobile", R.drawable.img_game);
        snakeIO.items.add(new Item("Breb Pet", "12000", "This is a sword"));
        snakeIO.items.add(new Item("Captain Hat", "65000", "This is a red light"));
        snakeIO.items.add(new Item("Mummy Skin", "120000", "This is a character"));
        games.add(snakeIO);

        //PC Game
        Game valorant = new Game("Valorant", "Valorant is a scary game", "PC", R.drawable.img_game);
        valorant.items.add(new Item("Smith", "12000", "This is a sword"));
        valorant.items.add(new Item("Frenzy", "65000", "This is a red light"));
        valorant.items.add(new Item("Origin", "120000", "This is a character"));
        games.add(valorant);

        Game gta = new Game("GTA", "GTA is a scary game", "PC", R.drawable.img_game);
        gta.items.add(new Item("Parachute", "12000", "This is a sword"));
        gta.items.add(new Item("Camera", "65000", "This is a red light"));
        gta.items.add(new Item("Detonator", "120000", "This is a character"));
        games.add(gta);

        Game mineCraft = new Game("Minecraft", "Minecraft is a scary game", "PC", R.drawable.img_game);
        mineCraft.items.add(new Item("Coald", "12000", "This is a sword"));
        mineCraft.items.add(new Item("Gold", "65000", "This is a red light"));
        mineCraft.items.add(new Item("Emerald", "120000", "This is a character"));
        games.add(mineCraft);

        Game fortNite = new Game("Fortnite", "Fortnite is a scary game", "PC", R.drawable.img_game);
        fortNite.items.add(new Item("Golden Spaces", "12000", "This is a sword"));
        fortNite.items.add(new Item("Paper Plane", "65000", "This is a red light"));
        fortNite.items.add(new Item("Goaldbounds", "120000", "This is a character"));
        games.add(fortNite);

        Game asphalt = new Game("Asphalt", "Asphalt is a scary game", "PC", R.drawable.img_game);
        asphalt.items.add(new Item("LB1500", "12000", "This is a sword"));
        asphalt.items.add(new Item("MDHB60", "65000", "This is a red light"));
        asphalt.items.add(new Item("QLB40", "120000", "This is a character"));
        games.add(asphalt);

        //Console
        Game marioKart = new Game("Mario Kart", "Mario Kart is a scary game", "console", R.drawable.img_game);
        marioKart.items.add(new Item("Banana", "12000", "This is a sword"));
        marioKart.items.add(new Item("Boo", "65000", "This is a red light"));
        marioKart.items.add(new Item("Mushroom", "120000", "This is a character"));
        games.add(marioKart);

        Game fifa23 = new Game("FIFA 23", "FIFA 23 is a scary game", "console", R.drawable.img_game);
        fifa23.items.add(new Item("Basic", "12000", "This is a sword"));
        fifa23.items.add(new Item("Anchor", "65000", "This is a red light"));
        fifa23.items.add(new Item("Wall", "120000", "This is a character"));
        games.add(fifa23);

        Game marioBros = new Game("Mario Bros", "Mario Bros is a scary game", "console", R.drawable.img_game);
        marioBros.items.add(new Item("Coconut", "12000", "This is a sword"));
        marioBros.items.add(new Item("Egg Drop", "65000", "This is a red light"));
        marioBros.items.add(new Item("Ice Bomb", "120000", "This is a character"));
        games.add(marioBros);

        Game pikmin = new Game("Pikmin", "Pikmin 4 is a scary game", "console", R.drawable.img_game);
        pikmin.items.add(new Item("Towel", "12000", "This is a sword"));
        pikmin.items.add(new Item("Shoe Charm", "65000", "This is a red light"));
        pikmin.items.add(new Item("Pillow", "120000", "This is a character"));
        games.add(pikmin);

        Game pokemon = new Game("Pokemon", "Pokemon Gold is a scary game", "console", R.drawable.img_game);
        pokemon.items.add(new Item("Absolite", "12000", "This is a sword"));
        pokemon.items.add(new Item("Antidote", "65000", "This is a red light"));
        pokemon.items.add(new Item("Bug Gem", "120000", "This is a character"));
        games.add(pokemon);

        return games;
    }
}
