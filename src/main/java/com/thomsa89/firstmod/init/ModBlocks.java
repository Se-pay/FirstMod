package com.thomsa89.firstmod.init;

import com.thomsa89.firstmod.block.BlockTest;
import com.thomsa89.firstmod.block.CommonBlock;
import com.thomsa89.firstmod.reference.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final CommonBlock blocktest = new BlockTest();

    public static void init()  {
        GameRegistry.registerBlock(blocktest, "Block Test");
    }
}
