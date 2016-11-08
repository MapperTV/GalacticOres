package net.killermapper.galacticores.common.blocks;

import java.util.List;
import java.util.Random;

import net.killermapper.galacticores.GalacticOres;
import net.killermapper.galacticores.init.GOBlocks;
import net.killermapper.galacticores.init.GOItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class OreMoons extends Block
{
    public static String[] subMoonOres = new String[] {"europium", "palladium", "jade", "rhodium", "petalite"};
    private IIcon europium, palladium, jade, rhodium, petalite;

    public OreMoons()
    {
        super(Material.rock);
        this.setCreativeTab(GalacticOres.GOTab);
    }

    public int damageDropped(int metadata)
    {
        switch(metadata)
        {
            case 0:
                return metadata;
            case 1:
                return metadata;
            case 2:
                return 6;
            case 3:
                return metadata;
            case 4:
                return 7;
            default:
                return metadata;
        }
    }
    
    public int getDamageValue(World world, int x, int y, int z)
    {
        int meta = world.getBlockMetadata(x, y, z);
        return meta;
    }

    public void getSubBlocks(Item item, CreativeTabs tabs, List list)
    {
        for(int i = 0; i < subMoonOres.length; i++)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.europium = iconRegister.registerIcon(GalacticOres.MODID + ":oreEuropium");
        this.palladium = iconRegister.registerIcon(GalacticOres.MODID + ":orePalladium");
        this.jade = iconRegister.registerIcon(GalacticOres.MODID + ":oreJade");
        this.rhodium = iconRegister.registerIcon(GalacticOres.MODID + ":oreRhodium");
        this.petalite = iconRegister.registerIcon(GalacticOres.MODID + ":orePetalite");
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

    public Item getItemDropped(int metadata, Random rand, int fortune)
    {
        switch(metadata)
        {
            case 0:
                return Item.getItemFromBlock(GOBlocks.OreMoons);
            case 1:
                return Item.getItemFromBlock(GOBlocks.OreMoons);
            case 2:
                return GOItems.itemDrops;
            case 3:
                return Item.getItemFromBlock(GOBlocks.OreMoons);
            case 4:
                return GOItems.itemDrops;
            default:
                return Item.getItemFromBlock(GOBlocks.OreMoons);
        }
    }

    public int quantityDropped(Random rand)
    {
        return 1;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random)
    {
        // Drops only for blocks with drops
        if(meta == 2 || meta == 4)
        {
            // Drop control depending of metadata
            int drop = 0;
            switch(meta)
            {
                case 2:
                    drop = 1;
                    break;
                case 4:
                    drop = random.nextInt(2) + 1;
                    break;
                default:
                    drop = 1;
                    break;
            }
            // To be sure the block will drop at least one drop
            if(drop < 1)
            {
                drop = 1;
            }
            if(fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(meta, random, fortune))
            {
                int j = random.nextInt(fortune + 2) - 1;

                if(j < 0)
                {
                    j = 0;
                }

                return this.quantityDropped(random) * (j + 1) * drop;
            }
            else
            {
                return this.quantityDropped(random) * drop;
            }
        }
        else
        {
            return 1;
        }
    }

    private Random rand = new Random();

    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if(this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            int j1 = 0;

            if(this == GOBlocks.OreMoons || this == GOBlocks.OrePlanets)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 0, 2);
            }
            return j1;
        }
        return 0;
    }
}
