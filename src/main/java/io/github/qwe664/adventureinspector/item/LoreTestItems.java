package io.github.qwe664.adventureinspector.item;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public final class LoreTestItems {

    private LoreTestItems() {
    }

    public static ItemStack plainTextItem() {
        ItemStack item = new ItemStack(Material.STONE);

        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text("Plain Text"));

        meta.lore(List.of(
                Component.text("第一行 Lore"),
                Component.text("第二行 Lore"),
                Component.text("第三行 Lore")
        ));

        item.setItemMeta(meta);
        return item;
    }
}
