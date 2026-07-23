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

        inventory.setItem(9,  LoreTestItems.plainTextItem(plugin));
        inventory.setItem(11, LoreTestItems.miniMessageItem(plugin));
        inventory.setItem(13, LoreTestItems.literalItem(plugin));
        inventory.setItem(15, LoreTestItems.bentoTestItem(plugin));

        player.openInventory(inventory);
    }
}
