package kgbostian.mods.solarpowermod;

import kgbostian.mods.solarpowermod.blocks.SolarGenerator;
import net.minecraft.block.Block;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;

public class SolarPowerModBlocks
{
   public static SolarGenerator solargenerator;
   
   public static void init()
   {
      solargenerator = new SolarGenerator(SolarPowerModConfig.solargeneratorID);
   }
}
