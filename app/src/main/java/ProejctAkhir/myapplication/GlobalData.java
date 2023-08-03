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


    public ArrayList<Game> createGame () {
       ArrayList<Game> games = new ArrayList<Game>();
       // Type Mobile
       Game pubg = new Game("PUBG Mobile", "Experience the intense battle royale action in PUBG Mobile", "mobile", R.drawable.pubgm);
       pubg.items.add(new Item(1, "Assault Rifle", "Shop Grak", "10000", "Equip the powerful Assault Rifle for your battles", R.drawable.pubg_250uc));
       pubg.items.add(new Item(2, "Sniper Rifle", "Shop Grak", "20000", "Take down enemies from afar with the Sniper Rifle", R.drawable.pubg_250uc));
       pubg.items.add(new Item(3, "Submachine Gun", "Shop Grak", "30000", "Unleash rapid fire with the Submachine Gun", R.drawable.pubg_250uc));
       games.add(pubg);

       Game stumbleGuys = new Game("Stumble Guys", "Join the hilarious race with funny characters in Stumble Guys", "mobile", R.drawable.stumble);
       stumbleGuys.items.add(new Item(1, "Beast Bucks", "Shop Grak", "10000", "Use Beast Bucks for in-game purchases", R.drawable.pubg_250uc));
       stumbleGuys.items.add(new Item(2, "275 Gems", "Shop Grak", "20000", "Collect 275 Gems to unlock exclusive items", R.drawable.pubg_250uc));
       stumbleGuys.items.add(new Item(3, "125 Tokens", "Shop Grak", "30000", "Participate in events with 125 Tokens", R.drawable.pubg_250uc));
       games.add(stumbleGuys);

       Game hayDay = new Game("HayDay", "Build and manage your dream farm in the charming world of HayDay", "mobile", R.drawable.hayda);
       hayDay.items.add(new Item(1, "Bacon Pie", "Shop Grak", "10000", "Serve delicious Bacon Pie to your farm visitors", R.drawable.pubg_250uc));
       hayDay.items.add(new Item(2, "Cotton Shirt", "Shop Grak", "20000", "Dress up your characters with a comfy Cotton Shirt", R.drawable.pubg_250uc));
       hayDay.items.add(new Item(3, "Wooly Chaps", "Shop Grak", "30000", "Style your farmhands with trendy Wooly Chaps", R.drawable.pubg_250uc));
       games.add(hayDay);

       Game clashRoyale = new Game("Clash Royale", "Enter the epic Clash Royale arena and battle with your favorite cards", "mobile", R.drawable.clashroyale);
       clashRoyale.items.add(new Item(1, "88 Gem", "Shop Grak", "10000", "Acquire 88 Gems for in-game purchases", R.drawable.pubg_250uc));
       clashRoyale.items.add(new Item(2, "550 Gem", "Shop Grak", "20000", "Unlock exclusive items with 550 Gems", R.drawable.pubg_250uc));
       clashRoyale.items.add(new Item(3, "13220 Gem", "Shop Grak", "30000", "Get a large pack of 13220 Gems", R.drawable.pubg_250uc));
       games.add(clashRoyale);

       Game amongUs = new Game("Among Us", "Unmask the impostors in the thrilling social deduction game Among Us", "Mobile", R.drawable.amongus);
       amongUs.items.add(new Item(1, "Astronaut Hat", "Shop Grak", "10000", "Wear a cool Astronaut Hat as your crewmate", R.drawable.pubg_250uc));
       amongUs.items.add(new Item(2, "MIRA HQ Skin Bundle", "Shop Grak", "20000", "Unlock the exclusive MIRA HQ Skin Bundle", R.drawable.pubg_250uc));
       amongUs.items.add(new Item(3, "BedCrab Pet Bundle", "Shop Grak", "30000", "Adopt a cute BedCrab as your loyal pet", R.drawable.pubg_250uc));
       games.add(amongUs);

       // Type PC
       Game valorant = new Game("Valorant", "Join the tactical first-person shooter Valorant and become a skilled agent", "PC", R.drawable.valo);
       valorant.items.add(new Item(1, "Luxe - Ghost", "Shop Grak", "10000", "Equip the luxurious Luxe skin for your Ghost pistol", R.drawable.pubg_250uc));
       valorant.items.add(new Item(2, "Rush - Frenzy", "Shop Grak", "20000", "Get the adrenaline-pumping Rush skin for your Frenzy pistol", R.drawable.pubg_250uc));
       valorant.items.add(new Item(3, "Prime - Axe", "Shop Grak", "30000", "Unlock the elite Prime skin for your Axe melee weapon", R.drawable.pubg_250uc));
       games.add(valorant);

       Game gta = new Game("GTA", "Experience the open-world adventure in the action-packed game GTA", "PC", R.drawable.gta5);
       gta.items.add(new Item(1, "Flare", "Shop Grak", "10000", "Use Flare for signaling purposes and create dazzling effects", R.drawable.pubg_250uc));
       gta.items.add(new Item(2, "Earpiece", "Shop Grak", "20000", "Stay connected with a high-tech Bluetooth Earpiece", R.drawable.pubg_250uc));
       gta.items.add(new Item(3, "Parachute", "Shop Grak", "30000", "Jump off buildings with style using the Parachute", R.drawable.pubg_250uc));
       games.add(gta);

       Game minecraft = new Game("Minecraft", "Explore the blocky world and unleash your creativity in Minecraft", "PC", R.drawable.minecraft_img);
       minecraft.items.add(new Item(1, "Paper", "Shop Grak", "10000", "Craft and use Paper for various purposes", R.drawable.pubg_250uc));
       minecraft.items.add(new Item(2, "Carrot", "Shop Grak", "20000", "Grow and harvest Carrots for food and potions", R.drawable.pubg_250uc));
       minecraft.items.add(new Item(3, "Eggs", "Shop Grak", "30000", "Collect and use Eggs for various recipes", R.drawable.pubg_250uc));
       games.add(minecraft);

       Game fortNite = new Game("FortNite", "Enter the battle royale madness in the popular game FortNite", "PC", R.drawable.fort);
       fortNite.items.add(new Item(1, "Homescape", "Shop Grak", "10000", "Escape from tricky situations with Homescape", R.drawable.pubg_250uc));
       fortNite.items.add(new Item(2, "The stylist", "Shop Grak", "20000", "Style your character with the trendy The Stylist outfit", R.drawable.pubg_250uc));
       fortNite.items.add(new Item(3, "Golden Scales", "Shop Grak", "30000", "Shine brightly with the Golden Scales pickaxe", R.drawable.pubg_250uc));
       games.add(fortNite);

       Game asphalt = new Game("Asphalt", "Experience high-speed racing action in the thrilling Asphalt series", "PC", R.drawable.ashpalt);
       asphalt.items.add(new Item(1, "RLB80 Hot Recycled AMP", "Shop Grak", "10000", "Crush and recycle asphalt with the RLB80 Hot Recycled AMP", R.drawable.pubg_250uc));
       asphalt.items.add(new Item(2, "SLB20 Mini Mobile AMP", "Shop Grak", "20000", "Produce asphalt on-the-go with the SLB20 Mini Mobile AMP", R.drawable.pubg_250uc));
       asphalt.items.add(new Item(3, "LB1500 Asphalt Batching Plant", "Shop Grak", "30000", "Operate the LB1500 Asphalt Batching Plant for large-scale production", R.drawable.pubg_250uc));
       games.add(asphalt);

       // Type Console
       Game mariokart = new Game("Mariokart", "Race with iconic characters in the thrilling Mariokart series", "Console", R.drawable.mariok);
       mariokart.items.add(new Item(1, "Mario Kart 64", "Shop Grak", "10000", "Experience classic racing with Mario Kart 64", R.drawable.pubg_250uc));
       mariokart.items.add(new Item(2, "Mario Kart 7", "Shop Grak", "20000", "Join the race with Mario Kart 7", R.drawable.pubg_250uc));
       mariokart.items.add(new Item(3, "Mario Kart 8", "Shop Grak", "30000", "Race with Mario Kart 8 and enjoy stunning graphics", R.drawable.pubg_250uc));
       games.add(mariokart);

       Game fifa23 = new Game("Fifa23", "Play as your favorite soccer stars in the exciting game Fifa23", "Console", R.drawable.fifa);
       fifa23.items.add(new Item(1, "Gold", "Shop Grak", "10000", "Recruit Gold players for your team", R.drawable.pubg_250uc));
       fifa23.items.add(new Item(2, "Silver", "Shop Grak", "20000", "Acquire Silver players to strengthen your squad", R.drawable.pubg_250uc));
       fifa23.items.add(new Item(3, "Bronze", "Shop Grak", "30000", "Get Bronze players and train them to stardom", R.drawable.pubg_250uc));
       games.add(fifa23);

       Game marioBros = new Game("MarioBros", "Relive the classic adventures with the iconic MarioBros", "Console", R.drawable.mariob);
       marioBros.items.add(new Item(1, "Dr. Mario", "Shop Grak", "10000", "Cure viruses and save the world as Dr. Mario", R.drawable.pubg_250uc));
       marioBros.items.add(new Item(2, "Mario's Tennis", "Shop Grak", "20000", "Compete in exciting tennis matches with Mario", R.drawable.pubg_250uc));
       marioBros.items.add(new Item(3, "Super Mario Bros NES 1985", "Shop Grak", "30000", "Embark on a nostalgic journey with Super Mario Bros NES 1985", R.drawable.pubg_250uc));
       games.add(marioBros);

       Game pikmin = new Game("Pikmin", "Embark on a thrilling adventure with the adorable Pikmin", "Console", R.drawable.pikmin1);
       pikmin.items.add(new Item(1, "Pikmin 1", "Shop Grak", "10000", "Command Pikmin to explore a mysterious world", R.drawable.pubg_250uc));
       pikmin.items.add(new Item(2, "Pikmin 2", "Shop Grak", "20000", "Discover new creatures and treasures in Pikmin 2", R.drawable.pubg_250uc));
       pikmin.items.add(new Item(3, "Pikmin 3", "Shop Grak", "30000", "Uncover the secrets of the planet in Pikmin 3", R.drawable.pubg_250uc));
       games.add(pikmin);

       Game pokemon = new Game("Pokemon", "Catch and train a variety of Pokémon in the legendary Pokemon series", "Console", R.drawable.poke);
       pokemon.items.add(new Item(1, "Abra", "Shop Grak", "10000", "Capture Abra and add it to your Pokémon team", R.drawable.pubg_250uc));
       pokemon.items.add(new Item(2, "Bill", "Shop Grak", "20000", "Meet Bill, the inventor of the Pokémon Storage System", R.drawable.pubg_250uc));
       pokemon.items.add(new Item(3, "Duduo", "Shop Grak", "30000", "Find Duduo in the wild and catch it", R.drawable.pubg_250uc));
       games.add(pokemon);

        return games;
    }
}
