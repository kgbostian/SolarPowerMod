package kgbostian.mods.solarpowermod.blocks;

import java.util.Random;

import kgbostian.mods.solarpowermod.SolarPowerMod;
import kgbostian.mods.solarpowermod.SolarPowerModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SolarGenerator extends Block
{
   public SolarGenerator(int par1)
   {
      super(par1, Material.iron);
      init();
   }
   
   private void init()
   {
      this.setCreativeTab(CreativeTabs.tabBlock);
      this.setHardness(-1.0f);
      this.setResistance(5.0f);
      this.setUnlocalizedName("solargenerator");
      this.setStepSound(soundGrassFootstep);
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
}