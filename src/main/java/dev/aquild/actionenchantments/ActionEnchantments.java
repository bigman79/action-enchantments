package dev.aquild.actionenchantments;

import org.bukkit.plugin.java.JavaPlugin;

public final class ActionEnchantments extends JavaPlugin {

    @Override
    public void onEnable() {
        // 
        this.saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
