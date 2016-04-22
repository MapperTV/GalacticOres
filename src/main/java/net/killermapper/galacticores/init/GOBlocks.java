package net.killermapper.galacticores.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.killermapper.galacticores.common.blocks.BlockMoons;
import net.killermapper.galacticores.common.blocks.BlockPlanets;
import net.killermapper.galacticores.common.blocks.OreMoons;
import net.killermapper.galacticores.common.blocks.OrePlanets;
import net.killermapper.galacticores.common.items.ItemBlockMoons;
import net.killermapper.galacticores.common.items.ItemBlockPlanets;
import net.killermapper.galacticores.common.items.ItemOreMoons;
import net.killermapper.galacticores.common.items.ItemOrePlanets;
import net.minecraft.block.Block;

public class GOBlocks
{
    public static Block OreMoons, OrePlanets, BlockMoons, BlockPlanets;

    public static void initBlocks()
    {
        OreMoons = new OreMoons().setBlockName("oreMoons").setHardness(1.5F).setResistance(10.0F);
        OrePlanets = new OrePlanets().setBlockName("orePlanets").setHardness(1.5F).setResistance(10.0F);
        BlockMoons = new BlockMoons().setBlockName("blockMoons").setHardness(1.5F).setResistance(10.0F);
        BlockPlanets = new BlockPlanets().setBlockName("blockPlanets").setHardness(1.5F).setResistance(10.0F);

        registerBlocks();
        setHarvestLevels();
    }

    public static void setHarvestLevels()
    {
        OreMoons.setHarvestLevel("pickaxe", 2);
        OrePlanets.setHarvestLevel("pickaxe", 2);
        BlockMoons.setHarvestLevel("pickaxe", 1);
        BlockPlanets.setHarvestLevel("pickaxe", 1);
    }

    public static void registerBlocks()
    {
        GameRegistry.registerBlock(OreMoons, ItemOreMoons.class, "oreMoons");
        GameRegistry.registerBlock(OrePlanets, ItemOrePlanets.class, "orePlanets");
        GameRegistry.registerBlock(BlockMoons, ItemBlockMoons.class, "blockMoons");
        GameRegistry.registerBlock(BlockPlanets, ItemBlockPlanets.class, "blockPlanets");
    }

}
