package dev.aquild.actionenchantments;

import dev.aquild.actionenchantments.Listeners.Attack;
import dev.aquild.actionenchantments.Listeners.Damage;
import org.bukkit.plugin.java.JavaPlugin;

public final class ActionEnchantments extends JavaPlugin {

    @Override
    public void onEnable() {
        // Config
        this.saveDefaultConfig();

        // Attach listeners
        if (this.getConfig().isSet("attack")) {
            this.getServer().getPluginManager().registerEvents(new Attack(this, this.getConfig().getInt("attack")), this);
        }
        if (this.getConfig().isSet("damage")) {
            this.getServer().getPluginManager().registerEvents(new Damage(this, this.getConfig().getInt("damage")), this);
        }

        this.getLogger().info("Loaded Action Enchantments by Aquild");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
