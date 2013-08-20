package kgbostian.mods.solarpowermod;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
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
      registerBlocks();
      addNames();
   }
   
   private static void registerBlocks()
   {
      GameRegistry.registerBlock(solargenerator, "SolarGenerator");
   }
   
   private static void addNames()
   {
      LanguageRegistry.addName(solargenerator, "Solar Engine");
   }
}
