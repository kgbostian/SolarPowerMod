package kgbostian.mods.solarpowermod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "SolarPowerMod", name = "SolarPowerMod", version = "0.0.0.1")
@NetworkMod(channels =
{ "SolarPowerMod" }, clientSideRequired = true, serverSideRequired = false)
public class SolarPowerMod
{
   @Instance(value = "SolarPowerMod")
   public static SolarPowerMod instance;
   
   @EventHandler
   public void preInit(FMLPreInitializationEvent event)
   {
      SolarPowerModBlocks.init();
   }
}
