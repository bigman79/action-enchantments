package dev.aquild.actionenchantments;

import dev.aquild.actionenchantments.Listeners.Attack;
import org.bukkit.plugin.java.JavaPlugin;

public final class ActionEnchantments extends JavaPlugin {

    @Override
    public void onEnable() {
        // Config
        this.saveDefaultConfig();

        // Attach listeners
        this.getServer().getPluginManager().registerEvents(new Attack(this), this);

        this.getLogger().info("Loaded Action Enchantments by Aquild");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
