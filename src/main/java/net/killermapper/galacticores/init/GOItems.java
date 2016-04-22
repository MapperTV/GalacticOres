package net.killermapper.galacticores.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.killermapper.galacticores.GalacticOres;
import net.killermapper.galacticores.common.items.ItemDrops;
import net.killermapper.galacticores.common.items.ItemIngots;
import net.minecraft.item.Item;

public class GOItems
{
    public static Item itemDrops, itemIngots;

    public static void initItems()
    {
        itemDrops = new ItemDrops().setUnlocalizedName("drop").setTextureName(GalacticOres.MODID + ":itemDrops");
        itemIngots = new ItemIngots().setUnlocalizedName("ingot").setTextureName(GalacticOres.MODID + ":itemIngots");
        GOItems.registerItems();
    }

    public static void registerItems()
    {
        GameRegistry.registerItem(itemDrops, "itemDrops");
        GameRegistry.registerItem(itemIngots, "itemIngots");
    }
}
