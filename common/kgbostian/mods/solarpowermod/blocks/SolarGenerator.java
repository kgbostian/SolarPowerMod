package kgbostian.mods.solarpowermod.blocks;

import java.util.Random;

import kgbostian.mods.solarpowermod.SolarPowerMod;
import kgbostian.mods.solarpowermod.SolarPowerModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SolarGenerator extends Block
{
   public SolarGenerator(int par1)
   {
      super(par1, Material.iron);
   }
   
   @Override
   public int idDropped(int par1, Random par2Random, int par3)
   {
      return SolarPowerModBlocks.solargenerator.blockID;
   }
}