package io.github.qwe664.adventureinspector.command;

import io.github.qwe664.adventureinspector.AdventureInspector;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LoreTestCommand implements CommandExecutor {

    private final AdventureInspector plugin;

    public LoreTestCommand(AdventureInspector plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        player.sendMessage("§aAdventureInspector 已成功載入！");
        player.sendMessage("§7LoreTest GUI 開發中...");

        return true;
    }
}
