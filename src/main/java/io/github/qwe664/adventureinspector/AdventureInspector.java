package io.github.qwe664.adventureinspector;

import io.github.qwe664.adventureinspector.command.LoreTestCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdventureInspector extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("AdventureInspector is enabling...");

        if (getCommand("loretest") != null) {
            getCommand("loretest").setExecutor(new LoreTestCommand(this));
        }

        getLogger().info("AdventureInspector enabled successfully.");
    }

    @Override
    public void onDisable() {
        getLogger().info("AdventureInspector disabled.");
    }
}
