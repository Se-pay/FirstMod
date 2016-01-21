package com.thomsa89.firstmod.init;

import com.thomsa89.firstmod.item.CommonItem;
import com.thomsa89.firstmod.item.ItemTest;
import com.thomsa89.firstmod.reference.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final CommonItem testItem = new ItemTest();

    public static void init() {
        GameRegistry.registerItem(testItem, "Test");
    }
}
