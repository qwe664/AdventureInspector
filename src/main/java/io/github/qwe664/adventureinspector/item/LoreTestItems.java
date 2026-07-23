package io.github.qwe664.adventureinspector.item;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public final class LoreTestItems {

    private static final MiniMessage MINI_MESSAGE = MiniMessage.miniMessage();

    private LoreTestItems() {
    }

    /**
     * 純 Adventure Component.text() Lore
     */
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

    /**
     * MiniMessage Lore
     */
    public static ItemStack miniMessageItem() {
        ItemStack item = new ItemStack(Material.EMERALD);

        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text("MiniMessage"));

        meta.lore(List.of(
                MINI_MESSAGE.deserialize("<green>拾取物品！</green>"),
                MINI_MESSAGE.deserialize("<gray>Gray Text</gray>"),
                MINI_MESSAGE.deserialize("<red>Red</red><gray> Gray</gray>")
        ));

        item.setItemMeta(meta);
        return item;
    }

    /**
     * 測試特殊字串是否被解析
     */
    public static ItemStack literalItem() {
        ItemStack item = new ItemStack(Material.PAPER);

        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text("Literal Test"));

        meta.lore(List.of(
                Component.text("{/gray}"),
                Component.text("</gray>"),
                Component.text("<gray>")
        ));

        item.setItemMeta(meta);
        return item;
    }
}
