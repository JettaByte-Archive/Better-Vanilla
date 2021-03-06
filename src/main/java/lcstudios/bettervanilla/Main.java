package lcstudios.bettervanilla;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.GREEN + "Better Vanilla Plugin is now enable");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(ChatColor.RED + "Better Vanilla Plugin is now disable");
    }
}
