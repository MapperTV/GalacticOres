package net.killermapper.galacticores;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.killermapper.galacticores.init.GOBlocks;
import net.killermapper.galacticores.init.GOItems;
import net.killermapper.galacticores.init.GORecipes;
import net.killermapper.galacticores.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = "galacticores", name = "Galactic Ores", version = "1.1")

public class GalacticOres
{
    @Instance("galacticores")
    public static GalacticOres instance;

    public static final String MODID = "galacticores";

    @SidedProxy(clientSide = "net.killermapper.galacticores.proxy.ClientProxy", serverSide = "net.killermapper.galacticores.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs GOTab = new CreativeTabs("GalacticOres")
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(GOBlocks.OrePlanets);
        }

        @SideOnly(Side.CLIENT)
        public int func_151243_f()
        {
            return 7;
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        GOBlocks.initBlocks();
        GOItems.initItems();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRender();

        GORecipes.initRecipes();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
