package ProejctAkhir.myapplication;

import java.util.ArrayList;

public class GlobalData {
    //Value username
    public static String username;

    public static String currentType = "mobile";
    public static String currentGame = "PUBG Mobile";

    public static String currentItem = "";

    //Halaman Profile
    public static String topUp_value = "0";
    public static String cash = "Rp. 10000";

    public static ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    //  Game
   public static ArrayList<Game> games = createGame();

    public static  ArrayList<Game> createGame () {
       ArrayList<Game> games = new ArrayList<Game>();
       // Type Mobile
       Game pubg = new Game("PUBG Mobile", "Experience the intense battle royale action in PUBG Mobile", "mobile", R.drawable.pubgm);
       pubg.items.add(new Item(1, "Belt", "Shop Grak", "10000", "Equip the powerful Assault Rifle for your battles", R.drawable.pubg_belt));
       pubg.items.add(new Item(2, "Backpack", "Shop Grak", "20000", "Take down enemies from afar with the Sniper Rifle", R.drawable.pubg_backpack));
       pubg.items.add(new Item(3, "Pain Killer", "Shop Grak", "30000", "Unleash rapid fire with the Submachine Gun", R.drawable.pubg_painkiller));
       games.add(pubg);

       Game stumbleGuys = new Game("Stumble Guys", "Join the hilarious race with funny characters in Stumble Guys", "mobile", R.drawable.stumble);
       stumbleGuys.items.add(new Item(1, "275 Gems", "Shop Grak", "10000", "Use Beast Bucks for in-game purchases", R.drawable.stumbleguys1));
       stumbleGuys.items.add(new Item(2, "900 Gems", "Shop Grak", "20000", "Collect 275 Gems to unlock exclusive items", R.drawable.stumbleguys2));
       stumbleGuys.items.add(new Item(3, "1800 Gems", "Shop Grak", "30000", "Participate in events with 125 Tokens", R.drawable.stumbleguys3));
       games.add(stumbleGuys);

       Game hayDay = new Game("HayDay", "Build and manage your dream farm in the charming world of HayDay", "mobile", R.drawable.hayda);
       hayDay.items.add(new Item(1, "Bacon Pie", "Shop Grak", "10000", "Serve delicious Bacon Pie to your farm visitors", R.drawable.hayday_1));
       hayDay.items.add(new Item(2, "Cotton Shirt", "Shop Grak", "20000", "Dress up your characters with a comfy Cotton Shirt", R.drawable.hayday_2));
       hayDay.items.add(new Item(3, "Wooly Chaps", "Shop Grak", "30000", "Style your farmhands with trendy Wooly Chaps", R.drawable.hayday_3));
       games.add(hayDay);

       Game clashRoyale = new Game("Clash Royale", "Enter the epic Clash Royale arena and battle with your favorite cards", "mobile", R.drawable.clashroyale);
       clashRoyale.items.add(new Item(1, "88 Gems", "Shop Grak", "10000", "Acquire 88 Gems for in-game purchases", R.drawable.clahroyale_1));
       clashRoyale.items.add(new Item(2, "550 Gems", "Shop Grak", "20000", "Unlock exclusive items with 550 Gems", R.drawable.clahroyale_2));
       clashRoyale.items.add(new Item(3, "1320 Gems", "Shop Grak", "30000", "Get a large pack of 13220 Gems", R.drawable.clahroyale_3));
       games.add(clashRoyale);

       Game amongUs = new Game("Among Us", "Unmask the impostors in the thrilling social deduction game Among Us", "Mobile", R.drawable.amongus);
       amongUs.items.add(new Item(1, "Breb Pet", "Shop Grak", "10000", "Wear a cool Astronaut Hat as your crewmate", R.drawable.among_1));
       amongUs.items.add(new Item(2, "Captain Hat", "Shop Grak", "20000", "Unlock the exclusive MIRA HQ Skin Bundle", R.drawable.among_2));
       amongUs.items.add(new Item(3, "Mummy Skin", "Shop Grak", "30000", "Adopt a cute BedCrab as your loyal pet", R.drawable.among_3));
       games.add(amongUs);

       // Type PC
       Game valorant = new Game("Valorant", "Join the tactical first-person shooter Valorant and become a skilled agent", "PC", R.drawable.valo);
       valorant.items.add(new Item(1, "Smith", "Shop Grak", "10000", "Equip the luxurious Luxe skin for your Ghost pistol", R.drawable.valorant_1));
       valorant.items.add(new Item(2, "Frenzy", "Shop Grak", "20000", "Get the adrenaline-pumping Rush skin for your Frenzy pistol", R.drawable.valorant_2));
       valorant.items.add(new Item(3, "Origin", "Shop Grak", "30000", "Unlock the elite Prime skin for your Axe melee weapon", R.drawable.valorant_3));
       games.add(valorant);

       Game gta = new Game("GTA", "Experience the open-world adventure in the action-packed game GTA", "PC", R.drawable.gta5);
       gta.items.add(new Item(1, "Flare", "Shop Grak", "10000", "Use Flare for signaling purposes and create dazzling effects", R.drawable.gta_1));
       gta.items.add(new Item(2, "Camera", "Shop Grak", "20000", "Stay connected with a high-tech Bluetooth Earpiece", R.drawable.gta_2));
       gta.items.add(new Item(3, "Detonator", "Shop Grak", "30000", "Jump off buildings with style using the Parachute", R.drawable.gta_3));
       games.add(gta);

       Game minecraft = new Game("Minecraft", "Explore the blocky world and unleash your creativity in Minecraft", "PC", R.drawable.minecraft_img);
       minecraft.items.add(new Item(1, "Coal", "Shop Grak", "10000", "Craft and use Paper for various purposes", R.drawable.minecraft_1));
       minecraft.items.add(new Item(2, "Gold", "Shop Grak", "20000", "Grow and harvest Carrots for food and potions", R.drawable.minecraft_2));
       minecraft.items.add(new Item(3, "Emerald", "Shop Grak", "30000", "Collect and use Eggs for various recipes", R.drawable.minecraft_3));
       games.add(minecraft);

       Game fortNite = new Game("FortNite", "Enter the battle royale madness in the popular game FortNite", "PC", R.drawable.fort);
       fortNite.items.add(new Item(1, "Golden Spaces", "Shop Grak", "10000", "Escape from tricky situations with Homescape", R.drawable.fortnite_1));
       fortNite.items.add(new Item(2, "Paper Plane", "Shop Grak", "20000", "Style your character with the trendy The Stylist outfit", R.drawable.fortnite_2));
       fortNite.items.add(new Item(3, "Goaldbounds", "Shop Grak", "30000", "Shine brightly with the Golden Scales pickaxe", R.drawable.fortnite_1));
       games.add(fortNite);

       Game asphalt = new Game("Asphalt", "Experience high-speed racing action in the thrilling Asphalt series", "PC", R.drawable.ashpalt);
       asphalt.items.add(new Item(1, "LB1500", "Shop Grak", "10000", "Crush and recycle asphalt with the RLB80 Hot Recycled AMP", R.drawable.asphalt_1));
       asphalt.items.add(new Item(2, "MDHB60", "Shop Grak", "20000", "Produce asphalt on-the-go with the SLB20 Mini Mobile AMP", R.drawable.asphalt_2));
       asphalt.items.add(new Item(3, "QLB40 Asphalt Batching Plant", "Shop Grak", "30000", "Operate the LB1500 Asphalt Batching Plant for large-scale production", R.drawable.asphalt_3));
       games.add(asphalt);

       // Type Console
       Game mariokart = new Game("Mariokart", "Race with iconic characters in the thrilling Mariokart series", "Console", R.drawable.mariok);
       mariokart.items.add(new Item(1, "Banana", "Shop Grak", "10000", "Experience classic racing with Mario Kart 64", R.drawable.mariokart_1));
       mariokart.items.add(new Item(2, "Boo", "Shop Grak", "20000", "Join the race with Mario Kart 7", R.drawable.mariokart_2));
       mariokart.items.add(new Item(3, "Mushroom", "Shop Grak", "30000", "Race with Mario Kart 8 and enjoy stunning graphics", R.drawable.mariokart_3));
       games.add(mariokart);

       Game fifa23 = new Game("Fifa23", "Play as your favorite soccer stars in the exciting game Fifa23", "Console", R.drawable.fifa);
       fifa23.items.add(new Item(1, "Basic", "Shop Grak", "10000", "Recruit Gold players for your team", R.drawable.fifa_1));
       fifa23.items.add(new Item(2, "Acnhor", "Shop Grak", "20000", "Acquire Silver players to strengthen your squad", R.drawable.fifa_2));
       fifa23.items.add(new Item(3, "Wall", "Shop Grak", "30000", "Get Bronze players and train them to stardom", R.drawable.fifa_3));
       games.add(fifa23);

       Game marioBros = new Game("MarioBros", "Relive the classic adventures with the iconic MarioBros", "Console", R.drawable.mariob);
       marioBros.items.add(new Item(1, "Coconut", "Shop Grak", "10000", "Cure viruses and save the world as Dr. Mario", R.drawable.mariobros_1));
       marioBros.items.add(new Item(2, "Egg Drop", "Shop Grak", "20000", "Compete in exciting tennis matches with Mario", R.drawable.mariobros_2));
       marioBros.items.add(new Item(3, "Ice Bomb", "Shop Grak", "30000", "Embark on a nostalgic journey with Super Mario Bros NES 1985", R.drawable.mariobros_3));
       games.add(marioBros);

       Game pikmin = new Game("Pikmin", "Embark on a thrilling adventure with the adorable Pikmin", "Console", R.drawable.pikmin1);
       pikmin.items.add(new Item(1, "Towel", "Shop Grak", "10000", "Command Pikmin to explore a mysterious world", R.drawable.pikmin_1));
       pikmin.items.add(new Item(2, "Shoe Charm", "Shop Grak", "20000", "Discover new creatures and treasures in Pikmin 2", R.drawable.pikmin_2));
       pikmin.items.add(new Item(3, "Pillow", "Shop Grak", "30000", "Uncover the secrets of the planet in Pikmin 3", R.drawable.pikmin_3));
       games.add(pikmin);

       Game pokemon = new Game("Pokemon", "Catch and train a variety of Pokémon in the legendary Pokemon series", "Console", R.drawable.poke);
       pokemon.items.add(new Item(1, "Absolite", "Shop Grak", "10000", "Capture Abra and add it to your Pokémon team", R.drawable.pokemon_1));
       pokemon.items.add(new Item(2, "Antidote", "Shop Grak", "20000", "Meet Bill, the inventor of the Pokémon Storage System", R.drawable.pokemon_2));
       pokemon.items.add(new Item(3, "Bug Gem", "Shop Grak", "30000", "Find Duduo in the wild and catch it", R.drawable.pokemon_3));
       games.add(pokemon);

        return games;
    }
}
