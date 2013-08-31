package kgbostian.mods.solarpowermod.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import buildcraft.api.power.IPowerEmitter;
import buildcraft.api.power.IPowerReceptor;
import buildcraft.api.power.PowerHandler;
import buildcraft.api.power.PowerHandler.PowerReceiver;

import kgbostian.mods.solarpowermod.SolarPowerMod;
import kgbostian.mods.solarpowermod.SolarPowerModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class SolarGenerator extends Block implements IPowerEmitter
{
   public float energy;
   
   public SolarGenerator(int par1)
   {
      super(par1, Material.iron);
      init();
   }
   
   private void init()
   {
      this.setCreativeTab(CreativeTabs.tabBlock);
      this.setHardness(-1.0f);
      this.setResistance(10.0f);
      this.setUnlocalizedName("solarGenerator");
      this.setStepSound(soundGrassFootstep);
      //this.func_111022_d("solar_engine");
   }
   
   @Override
   public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player)
   {
      world.getWorldLogAgent().logInfo(player.getEntityName() + " clicked a solar engine!");
   }
   
   @Override
   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase elb, ItemStack itemStack)
   {
      EntityPlayer player = world.getPlayerEntityByName(elb.getEntityName());
      world.getWorldLogAgent().logInfo(player.getEntityName() + " went flying!");
      player.addVelocity(0, 4, 0);
   }
   
   @Override
   public int idDropped(int par1, Random par2Random, int par3)
   {
      return SolarPowerModBlocks.solargenerator.blockID;
   }

   @Override
   public boolean canEmitPowerFrom(ForgeDirection side)
   {
      return true;
   }
   
   /**
    * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
    */
   @SideOnly(Side.CLIENT)
   @Override
   public Icon getIcon(int par1, int par2)
   {
       return this.blockIcon;
   }
   
   /**
    * When this method is called, your block should register all the icons it needs with the given IconRegister. This
    * is the only chance you get to register icons.
    */
   @SideOnly(Side.CLIENT)
   @Override
   public void registerIcons(IconRegister par1IconRegister)
   {
      this.blockIcon = par1IconRegister.registerIcon("SolarPowerMod:SolarGenerator");
   }
}
