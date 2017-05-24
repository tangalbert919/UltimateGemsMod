package api.slimeknights.tconstruct;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.event.FMLInterModComms;

/**
 * This class is supposed to allow the mod to integrate with Tinkers' Construct.
 * So far, I need to find a way to get the metals I created to melt
 */
public class IMCHandler {
    private static Fluid palladium;
    private static Fluid titanium;
    public static void init() {
        palladium = new Fluid("palladium_fluid", new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
        titanium = new Fluid("titanium_fluid", new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
    }
    public static void register() {
        FluidRegistry.registerFluid(palladium);
        FluidRegistry.addBucketForFluid(palladium);
        FluidRegistry.registerFluid(titanium);
        FluidRegistry.addBucketForFluid(titanium);
    }
    public static void addBlocks() {
        // TODO: Figure out how to register these blocks.
        Block palladium_fluid = new BlockFluidClassic(palladium, Material.LAVA);
        Block titanium_fluid = new BlockFluidClassic(titanium, Material.LAVA);
        NBTTagCompound tag = new NBTTagCompound();
        // Palladium
        tag.setString("fluid", palladium.getName());
        tag.setString("ore", "Foo");
        tag.setBoolean("toolForge", true);
        FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", tag);
        // Titanium
        tag.setString("fluid", titanium.getName());
        tag.setString("ore", "Foo");
        FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", tag);
    }
}
