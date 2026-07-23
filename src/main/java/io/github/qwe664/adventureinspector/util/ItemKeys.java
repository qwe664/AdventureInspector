package io.github.qwe664.adventureinspector.util;

import io.github.qwe664.adventureinspector.AdventureInspector;
import org.bukkit.NamespacedKey;

public final class ItemKeys {

    private ItemKeys() {
    }

    public static NamespacedKey testId(AdventureInspector plugin) {
        return new NamespacedKey(plugin, "test_id");
    }
}
