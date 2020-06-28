package dev.aquild.actionenchantments;

import org.bukkit.plugin.java.JavaPlugin;

public final class ActionEnchantments extends JavaPlugin {

    @Override
    public void onEnable() {
        // Config
        this.saveDefaultConfig();

        this.getLogger().info("Action Enchantments by Aquild");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
