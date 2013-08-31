package kgbostian.mods.solarpowermod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class SolarGenerator extends Item
{

   public SolarGenerator(int par1)
   {
      super(par1);
      // TODO Auto-generated constructor stub
   }
   
   /**
    * When this method is called, your block should register all the icons it needs with the given IconRegister. This
    * is the only chance you get to register icons.
    */
   @SideOnly(Side.CLIENT)
   @Override
   public void registerIcons(IconRegister par1IconRegister)
   {
      this.itemIcon = par1IconRegister.registerIcon("SolarPowerMod:SolarGenerator");
   }
}
