package net.killermapper.galacticores.common.blocks;

import java.util.List;

import net.killermapper.galacticores.GalacticOres;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockPlanets extends Block
{
    public static String[] subPlanetBlocks = new String[] {"mercurian", "citrine", "plutonium", "bismuth", "onyx", "centaurium", "pinkquartz", "carnelian", "chalcedony", "iridium"};
    private IIcon mercurian, citrine, plutonium, bismuth, onyx, centaurium, pinkquartz, carnelian, chalcedony, iridium;

    public BlockPlanets()
    {
        super(Material.iron);
        this.setCreativeTab(GalacticOres.GOTab);
    }

    public int damageDropped(int metadata)
    {
        return metadata;
    }

    public void getSubBlocks(Item item, CreativeTabs tabs, List list)
    {
        for(int i = 0; i < subPlanetBlocks.length; i++)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.mercurian = iconRegister.registerIcon(GalacticOres.MODID + ":blockMercurian");
        this.citrine = iconRegister.registerIcon(GalacticOres.MODID + ":blockCitrine");
        this.plutonium = iconRegister.registerIcon(GalacticOres.MODID + ":blockPlutonium");
        this.bismuth = iconRegister.registerIcon(GalacticOres.MODID + ":blockBismuth");
        this.onyx = iconRegister.registerIcon(GalacticOres.MODID + ":blockOnyx");
        this.centaurium = iconRegister.registerIcon(GalacticOres.MODID + ":blockCentaurium");
        this.pinkquartz = iconRegister.registerIcon(GalacticOres.MODID + ":blockPinkQuartz");
        this.carnelian = iconRegister.registerIcon(GalacticOres.MODID + ":blockCarnelian");
        this.chalcedony = iconRegister.registerIcon(GalacticOres.MODID + ":blockChalcedony");
        this.iridium = iconRegister.registerIcon(GalacticOres.MODID + ":blockIridium");
    }

    public IIcon getIcon(int side, int metadata)
    {
        switch(metadata)
        {
            case 0:
                return this.mercurian;
            case 1:
                return this.citrine;
            case 2:
                return this.plutonium;
            case 3:
                return this.bismuth;
            case 4:
                return this.onyx;
            case 5:
                return this.centaurium;
            case 6:
                return this.pinkquartz;
            case 7:
                return this.carnelian;
            case 8:
                return this.chalcedony;
            case 9:
                return this.iridium;
            default:
                return this.mercurian;
        }
    }
}
