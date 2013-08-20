package kgbostian.mods.solarpowermod.blocks;

import java.util.Random;

import kgbostian.mods.solarpowermod.SolarPowerMod;
import kgbostian.mods.solarpowermod.SolarPowerModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class SolarGenerator extends Block
{
   public SolarGenerator(int par1)
   {
      super(par1, Material.iron);
   }
   
   @Override
   public void onBlockClicked(World world, int x, int y, int z,
         EntityPlayer player)
   {
      player.addChatMessage("You clicked a solar generator!");
   }
   
   @Override
   public int idDropped(int par1, Random par2Random, int par3)
   {
      return SolarPowerModBlocks.solargenerator.blockID;
   }
}