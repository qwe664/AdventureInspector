package io.github.qwe664.adventureinspector.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public final class MiniMessageUtil {

    private static final MiniMessage MINI_MESSAGE = MiniMessage.miniMessage();

    private MiniMessageUtil() {
    }

    public static Component parse(String text) {
        return MINI_MESSAGE.deserialize(text);
    }
}
