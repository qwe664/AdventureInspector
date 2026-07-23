package io.github.qwe664.adventureinspector;

import io.github.qwe664.adventureinspector.command.LoreTestCommand;
import io.github.qwe664.adventureinspector.listener.InventoryListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdventureInspector extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("AdventureInspector is enabling...");

        // 註冊指令
        if (getCommand("loretest") != null) {
            getCommand("loretest").setExecutor(new LoreTestCommand(this));
        }

        // 註冊事件
        getServer().getPluginManager().registerEvents(new InventoryListener(), this);

        getLogger().info("AdventureInspector enabled successfully.");
    }

    @Override
    public void onDisable() {
        getLogger().info("AdventureInspector disabled.");
    }
}
