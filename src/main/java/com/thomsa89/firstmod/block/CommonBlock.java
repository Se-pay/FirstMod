package com.thomsa89.firstmod.block;

import com.thomsa89.firstmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CommonBlock extends Block{
    public CommonBlock(net.minecraft.block.material.Material material) {
        super(material);
    }

    public CommonBlock() {
        super(Material.rock);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
