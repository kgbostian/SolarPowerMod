package kgbostian.mods.solarpowermod.blocks;

import java.util.Random;

import buildcraft.api.power.IPowerEmitter;
import buildcraft.api.power.IPowerReceptor;
import buildcraft.api.power.PowerHandler;
import buildcraft.api.power.PowerHandler.PowerReceiver;

import kgbostian.mods.solarpowermod.SolarPowerMod;
import kgbostian.mods.solarpowermod.SolarPowerModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class SolarGenerator extends Block implements IPowerEmitter, IPowerReceptor
{
   private PowerHandler powerHandler;
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
      this.func_111022_d("solar_engine");
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

   @Override
   public PowerReceiver getPowerReceiver(ForgeDirection side)
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void doWork(PowerHandler workProvider)
   {
      addEnergy(powerHandler.useEnergy(1, maxEnergyReceived(), true) * 0.95F);
   }

   private void addEnergy(float f)
   {
      // TODO Auto-generated method stub
      
   }

   private float maxEnergyReceived()
   {
      
      return 0;
   }

   @Override
   public World getWorld()
   {
      // TODO Auto-generated method stub
      return null;
   }
}