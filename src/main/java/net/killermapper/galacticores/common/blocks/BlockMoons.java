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

public class BlockMoons extends Block
{
    public static String[] subMoonBlocks = new String[] {"europium", "palladium", "jade", "rhodium", "petalite"};
    private IIcon europium, palladium, jade, rhodium, petalite;

    public BlockMoons()
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
        for(int i = 0; i < subMoonBlocks.length; i++)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.europium = iconRegister.registerIcon(GalacticOres.MODID + ":blockEuropium");
        this.palladium = iconRegister.registerIcon(GalacticOres.MODID + ":blockPalladium");
        this.jade = iconRegister.registerIcon(GalacticOres.MODID + ":blockJade");
        this.rhodium = iconRegister.registerIcon(GalacticOres.MODID + ":blockRhodium");
        this.petalite = iconRegister.registerIcon(GalacticOres.MODID + ":blockPetalite");
    }

    public IIcon getIcon(int side, int metadata)
    {
        switch(metadata)
        {
            case 0:
                return this.europium;
            case 1:
                return this.palladium;
            case 2:
                return this.jade;
            case 3:
                return this.rhodium;
            case 4:
                return this.petalite;
            default:
                return this.europium;
        }
    }
}
