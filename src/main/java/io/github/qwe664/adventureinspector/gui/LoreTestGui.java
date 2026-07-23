package io.github.qwe664.adventureinspector.gui;

import io.github.qwe664.adventureinspector.AdventureInspector;
import io.github.qwe664.adventureinspector.item.LoreTestItems;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public final class LoreTestGui {

    private LoreTestGui() {
    }

    public static void open(Player player, AdventureInspector plugin) {
        Inventory inventory = Bukkit.createInventory(null, 27, "AdventureInspector");

        inventory.setItem(10, LoreTestItems.plainTextItem(plugin));
        inventory.setItem(12, LoreTestItems.miniMessageItem(plugin));
        inventory.setItem(14, LoreTestItems.literalItem(plugin));

        player.openInventory(inventory);
    }
}
