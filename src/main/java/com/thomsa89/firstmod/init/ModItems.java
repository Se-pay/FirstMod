package com.thomsa89.firstmod.init;

import com.thomsa89.firstmod.item.CommonItem;
import com.thomsa89.firstmod.item.ItemTest;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static final CommonItem testItem = new ItemTest();

    public static void init() {
        GameRegistry.registerItem(testItem, "Test");
    }
}
