package xero.tageszeiten.main;

import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin enabled");
        getCommand("guten").setExecutor(new Tageszeiten());

    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled");
    }

}

