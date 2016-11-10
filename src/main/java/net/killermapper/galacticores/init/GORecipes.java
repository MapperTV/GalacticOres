package net.killermapper.galacticores.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class GORecipes
{
    public static void initRecipes()
    {
        initOreDict();

        // Storage blocks
        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockPlanets, 1, 0), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemIngots, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockPlanets, 1, 1), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemDrops, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockPlanets, 1, 2), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemIngots, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockPlanets, 1, 3), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemIngots, 1, 2)});
        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockPlanets, 1, 4), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemDrops, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockPlanets, 1, 5), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemIngots, 1, 3)});
        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockPlanets, 1, 6), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemDrops, 1, 2)});
        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockPlanets, 1, 7), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemDrops, 1, 3)});
        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockPlanets, 1, 8), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemDrops, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockPlanets, 1, 9), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemIngots, 1, 4)});

        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockMoons, 1, 0), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemIngots, 1, 5)});
        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockMoons, 1, 1), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemIngots, 1, 6)});
        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockMoons, 1, 2), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemDrops, 1, 6)});
        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockMoons, 1, 3), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemIngots, 1, 7)});
        GameRegistry.addRecipe(new ItemStack(GOBlocks.BlockMoons, 1, 4), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(GOItems.itemDrops, 1, 7)});

        // Storage blocks to raw items / ingot
        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemIngots, 9, 0), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockPlanets, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemIngots, 9, 1), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockPlanets, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemIngots, 9, 2), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockPlanets, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemIngots, 9, 3), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockPlanets, 1, 5)});
        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemIngots, 9, 4), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockPlanets, 1, 9)});
        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemIngots, 9, 5), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockMoons, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemIngots, 9, 6), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockMoons, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemIngots, 9, 7), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockMoons, 1, 3)});

        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemDrops, 9, 0), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockPlanets, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemDrops, 9, 1), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockPlanets, 1, 4)});
        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemDrops, 9, 2), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockPlanets, 1, 6)});
        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemDrops, 9, 3), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockPlanets, 1, 7)});
        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemDrops, 9, 4), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockPlanets, 1, 8)});
        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemDrops, 9, 6), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockMoons, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(GOItems.itemDrops, 9, 7), new Object[] {"X", 'X', new ItemStack(GOBlocks.BlockMoons, 1, 4)});

        // Furnace
        GameRegistry.addSmelting(new ItemStack(GOBlocks.OrePlanets, 1, 0), new ItemStack(GOItems.itemIngots, 1, 0), 0.35F);
        GameRegistry.addSmelting(new ItemStack(GOBlocks.OrePlanets, 1, 2), new ItemStack(GOItems.itemIngots, 1, 1), 0.35F);
        GameRegistry.addSmelting(new ItemStack(GOBlocks.OrePlanets, 1, 3), new ItemStack(GOItems.itemIngots, 1, 2), 0.35F);
        GameRegistry.addSmelting(new ItemStack(GOBlocks.OrePlanets, 1, 5), new ItemStack(GOItems.itemIngots, 1, 3), 0.35F);
        GameRegistry.addSmelting(new ItemStack(GOItems.itemDrops, 1, 5), new ItemStack(GOItems.itemIngots, 1, 4), 0.75F);
        GameRegistry.addSmelting(new ItemStack(GOBlocks.OreMoons, 1, 0), new ItemStack(GOItems.itemIngots, 1, 5), 0.35F);
        GameRegistry.addSmelting(new ItemStack(GOBlocks.OreMoons, 1, 1), new ItemStack(GOItems.itemIngots, 1, 6), 0.35F);
        GameRegistry.addSmelting(new ItemStack(GOBlocks.OreMoons, 1, 3), new ItemStack(GOItems.itemIngots, 1, 7), 0.35F);
    }

    public static void initOreDict()
    {
        OreDictionary.registerOre("gemCitrine", new ItemStack(GOItems.itemDrops, 0, 0));
        OreDictionary.registerOre("gemOnyx", new ItemStack(GOItems.itemDrops, 0, 1));
        OreDictionary.registerOre("gemPinkQuartz", new ItemStack(GOItems.itemDrops, 0, 2));
        OreDictionary.registerOre("gemCarnelian", new ItemStack(GOItems.itemDrops, 0, 3));
        OreDictionary.registerOre("gemChalcedony", new ItemStack(GOItems.itemDrops, 0, 4));
        OreDictionary.registerOre("gemIridium", new ItemStack(GOItems.itemDrops, 0, 5));
        OreDictionary.registerOre("gemJade", new ItemStack(GOItems.itemDrops, 0, 6));
        OreDictionary.registerOre("gemPetalite", new ItemStack(GOItems.itemDrops, 0, 7));

        OreDictionary.registerOre("ingotMercurianIron", new ItemStack(GOItems.itemIngots, 0, 0));
        OreDictionary.registerOre("ingotPlutonium", new ItemStack(GOItems.itemIngots, 0, 1));
        OreDictionary.registerOre("ingotBismuth", new ItemStack(GOItems.itemIngots, 0, 2));
        OreDictionary.registerOre("ingotCentaurium", new ItemStack(GOItems.itemIngots, 0, 3));
        OreDictionary.registerOre("ingotIridium", new ItemStack(GOItems.itemIngots, 0, 4));
        OreDictionary.registerOre("ingotEuropium", new ItemStack(GOItems.itemIngots, 0, 5));
        OreDictionary.registerOre("ingotPalladium", new ItemStack(GOItems.itemIngots, 0, 6));
        OreDictionary.registerOre("ingotRhodium", new ItemStack(GOItems.itemIngots, 0, 7));

        OreDictionary.registerOre("oreEuropium", new ItemStack(GOBlocks.OreMoons, 0, 0));
        OreDictionary.registerOre("orePalladium", new ItemStack(GOBlocks.OreMoons, 0, 1));
        OreDictionary.registerOre("oreJade", new ItemStack(GOBlocks.OreMoons, 0, 2));
        OreDictionary.registerOre("oreRhodium", new ItemStack(GOBlocks.OreMoons, 0, 3));
        OreDictionary.registerOre("orePetalite", new ItemStack(GOBlocks.OreMoons, 0, 4));

        OreDictionary.registerOre("oreMercurianIron", new ItemStack(GOBlocks.OrePlanets, 0, 0));
        OreDictionary.registerOre("oreCitrine", new ItemStack(GOBlocks.OrePlanets, 0, 1));
        OreDictionary.registerOre("orePlutonium", new ItemStack(GOBlocks.OrePlanets, 0, 2));
        OreDictionary.registerOre("oreBismuth", new ItemStack(GOBlocks.OrePlanets, 0, 3));
        OreDictionary.registerOre("oreOnyx", new ItemStack(GOBlocks.OrePlanets, 0, 4));
        OreDictionary.registerOre("oreCentaurium", new ItemStack(GOBlocks.OrePlanets, 0, 5));
        OreDictionary.registerOre("orePinkQuartz", new ItemStack(GOBlocks.OrePlanets, 0, 6));
        OreDictionary.registerOre("oreCarnelian", new ItemStack(GOBlocks.OrePlanets, 0, 7));
        OreDictionary.registerOre("oreChalcedony", new ItemStack(GOBlocks.OrePlanets, 0, 8));
        OreDictionary.registerOre("oreIridium", new ItemStack(GOBlocks.OrePlanets, 0, 9));

        OreDictionary.registerOre("blockMercurianIron", new ItemStack(GOBlocks.BlockPlanets, 0, 0));
        OreDictionary.registerOre("blockCitrine", new ItemStack(GOBlocks.BlockPlanets, 0, 1));
        OreDictionary.registerOre("blockPlutonium", new ItemStack(GOBlocks.BlockPlanets, 0, 2));
        OreDictionary.registerOre("blockBismuth", new ItemStack(GOBlocks.BlockPlanets, 0, 3));
        OreDictionary.registerOre("blockOnyx", new ItemStack(GOBlocks.BlockPlanets, 0, 4));
        OreDictionary.registerOre("blockCentaurium", new ItemStack(GOBlocks.BlockPlanets, 0, 5));
        OreDictionary.registerOre("blockPinkQuartz", new ItemStack(GOBlocks.BlockPlanets, 0, 6));
        OreDictionary.registerOre("blockCarnelian", new ItemStack(GOBlocks.BlockPlanets, 0, 7));
        OreDictionary.registerOre("blockChalcedony", new ItemStack(GOBlocks.BlockPlanets, 0, 8));
        OreDictionary.registerOre("blockIridium", new ItemStack(GOBlocks.BlockPlanets, 0, 9));

        OreDictionary.registerOre("blockEuropium", new ItemStack(GOBlocks.BlockMoons, 0, 0));
        OreDictionary.registerOre("blockPalladium", new ItemStack(GOBlocks.BlockMoons, 0, 1));
        OreDictionary.registerOre("blockJade", new ItemStack(GOBlocks.BlockMoons, 0, 2));
        OreDictionary.registerOre("blockRhodium", new ItemStack(GOBlocks.BlockMoons, 0, 3));
        OreDictionary.registerOre("blockPetalite", new ItemStack(GOBlocks.BlockMoons, 0, 4));

    }

}
