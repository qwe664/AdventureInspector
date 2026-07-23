package io.github.qwe664.adventureinspector.gui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class LoreTestGui {

    private LoreTestGui() {
    }

    public static void open(Player player) {
        Inventory inventory = Bukkit.createInventory(null, 27, "AdventureInspector");

        player.openInventory(inventory);
    }
}
