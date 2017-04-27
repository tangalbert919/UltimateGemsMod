package com.darknesgaming.ultimategems.handlers;

import com.darknesgaming.ultimategems.items.EmeraldSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class is used to handle weapons. The common proxy will use this to load and register the
 * weapons during pre-initialization.
 */
public class WeaponHandler {
    static Item emeraldsword;
    // TODO: Create classes, textures, and recipes for these weapons.
    static Item palladiumsword;
    static Item titaniumsword;
    public static void init() {
        emeraldsword = new EmeraldSword("emerald_sword", MaterialHandler.EMERALD_WEAPON, CreativeTabHandler.weaponTab);
    }
    public static void register() {
        GameRegistry.register(emeraldsword);
    }
    public static void registerRenders() {
        registerRender(emeraldsword);
    }
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
