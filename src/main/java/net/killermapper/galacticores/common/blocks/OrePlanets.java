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

public class OrePlanets extends Block
{
    public static String[] subPlanetOres = new String[] {"mercurian", "citrine", "plutonium", "bismuth", "onyx", "centaurium", "pinkquartz", "carnelian", "chalcedony", "iridium"};
    private IIcon mercurian, citrine, plutonium, bismuth, onyx, centaurium, pinkquartz, carnelian, chalcedony, iridium;

    public OrePlanets()
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
                return 0;
            case 2:
                return metadata;
            case 3:
                return metadata;
            case 4:
                return 1;
            case 5:
                return metadata;
            case 6:
                return 2;
            case 7:
                return 3;
            case 8:
                return 4;
            case 9:
                return 5;
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
        for(int i = 0; i < subPlanetOres.length; i++)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.mercurian = iconRegister.registerIcon(GalacticOres.MODID + ":oreMercurian");
        this.citrine = iconRegister.registerIcon(GalacticOres.MODID + ":oreCitrine");
        this.plutonium = iconRegister.registerIcon(GalacticOres.MODID + ":orePlutonium");
        this.bismuth = iconRegister.registerIcon(GalacticOres.MODID + ":oreBismuth");
        this.onyx = iconRegister.registerIcon(GalacticOres.MODID + ":oreOnyx");
        this.centaurium = iconRegister.registerIcon(GalacticOres.MODID + ":oreCentaurium");
        this.pinkquartz = iconRegister.registerIcon(GalacticOres.MODID + ":orePinkQuartz");
        this.carnelian = iconRegister.registerIcon(GalacticOres.MODID + ":oreCarnelian");
        this.chalcedony = iconRegister.registerIcon(GalacticOres.MODID + ":oreChalcedony");
        this.iridium = iconRegister.registerIcon(GalacticOres.MODID + ":oreIridium");
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

    public Item getItemDropped(int metadata, Random rand, int fortune)
    {
        switch(metadata)
        {
            case 0:
                return Item.getItemFromBlock(GOBlocks.OrePlanets);
            case 1:
                return GOItems.itemDrops;
            case 2:
                return Item.getItemFromBlock(GOBlocks.OrePlanets);
            case 3:
                return Item.getItemFromBlock(GOBlocks.OrePlanets);
            case 4:
                return GOItems.itemDrops;
            case 5:
                return Item.getItemFromBlock(GOBlocks.OrePlanets);
            case 6:
                return GOItems.itemDrops;
            case 7:
                return GOItems.itemDrops;
            case 8:
                return GOItems.itemDrops;
            case 9:
                return GOItems.itemDrops;
            default:
                return Item.getItemFromBlock(GOBlocks.OrePlanets);
        }
    }

    public int quantityDropped(Random rand)
    {
        return 1;
        // return 4 + rand.nextInt(2);
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random)
    {
        if(meta == 1 || meta == 4 || meta == 6 || meta == 7 || meta == 8 || meta == 9)
        {
            int drop = 0;
            switch(meta)
            {
                case 1:
                    drop = 1;
                    break;
                case 4:
                    drop = random.nextInt(2) + random.nextInt(3);
                    break;
                case 6:
                    drop = random.nextInt(3) + 2;
                    break;
                case 7:
                    drop = random.nextInt(2) + random.nextInt(3);
                    break;
                case 8:
                    drop = random.nextInt(2) + random.nextInt(3);
                    break;
                case 9:
                    drop = 1;
                    break;
                default:
                    drop = 1;
                    break;
            }
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
