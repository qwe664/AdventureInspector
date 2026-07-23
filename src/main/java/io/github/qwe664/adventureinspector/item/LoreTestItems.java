package io.github.qwe664.adventureinspector.item;

import io.github.qwe664.adventureinspector.AdventureInspector;
import io.github.qwe664.adventureinspector.util.ItemKeys;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class LoreTestItems {

    private static final MiniMessage MINI_MESSAGE = MiniMessage.miniMessage();

    private LoreTestItems() {
    }

    public static ItemStack plainTextItem(AdventureInspector plugin) {
        ItemStack item = new ItemStack(Material.STONE);

        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text("Plain Text"));

        meta.lore(List.of(
                Component.text("第一行 Lore"),
                Component.text("第二行 Lore"),
                Component.text("第三行 Lore")
        ));

        meta.getPersistentDataContainer().set(
                ItemKeys.testId(plugin),
                PersistentDataType.STRING,
                "plain_text"
        );

        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack miniMessageItem(AdventureInspector plugin) {
        ItemStack item = new ItemStack(Material.EMERALD);

        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text("MiniMessage"));

        meta.lore(List.of(
                MINI_MESSAGE.deserialize("<green>拾取物品！</green>"),
                MINI_MESSAGE.deserialize("<gray>Gray Text</gray>"),
                MINI_MESSAGE.deserialize("<red>Red</red><gray> Gray</gray>")
        ));

        meta.getPersistentDataContainer().set(
                ItemKeys.testId(plugin),
                PersistentDataType.STRING,
                "minimessage"
        );

        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack literalItem(AdventureInspector plugin) {
        ItemStack item = new ItemStack(Material.PAPER);

        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text("Literal Test"));

        meta.lore(List.of(
                Component.text("{/gray}"),
                Component.text("</gray>"),
                Component.text("<gray>")
        ));

        meta.getPersistentDataContainer().set(
                ItemKeys.testId(plugin),
                PersistentDataType.STRING,
                "literal"
        );

        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack bentoTestItem(AdventureInspector plugin) {
        ItemStack item = new ItemStack(Material.HOPPER);

        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text("Bento Test"));

        meta.lore(List.of(
                MINI_MESSAGE.deserialize("<green>Block Donation</green>"),
                MINI_MESSAGE.deserialize("<gray>Toggle who can donate</gray>"),
                MINI_MESSAGE.deserialize("<gray>blocks to raise island level.</gray>"),
                MINI_MESSAGE.deserialize("<yellow>Left Click</yellow><gray> Down</gray>"),
                MINI_MESSAGE.deserialize("<yellow>Right Click</yellow><gray> Up</gray>")
        ));

        meta.getPersistentDataContainer().set(
                ItemKeys.testId(plugin),
                PersistentDataType.STRING,
                "bento_test"
        );

        item.setItemMeta(meta);
        return item;
    }
}
