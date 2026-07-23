package io.github.qwe664.adventureinspector.gui;

import io.github.qwe664.adventureinspector.item.LoreTestItems;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class LoreTestGui {

    private LoreTestGui() {
    }

    public static void open(Player player) {
        Inventory inventory = Bukkit.createInventory(null, 27, "AdventureInspector");

        // 第一個測試物品
        inventory.setItem(10, LoreTestItems.plainTextItem());

        player.openInventory(inventory);
    }
}
