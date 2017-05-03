package com.darknesgaming.ultimategems.handlers;

import com.darknesgaming.ultimategems.items.ModSword;
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
    static Item palladiumsword;
    static Item titaniumsword;
    public static void init() {
        emeraldsword = new ModSword("emerald_sword", MaterialHandler.EMERALD_WEAPON, CreativeTabHandler.weaponTab);
        palladiumsword = new ModSword("palladium_sword", MaterialHandler.PALLADIUM_WEAPON, CreativeTabHandler.weaponTab);
        titaniumsword = new ModSword("titanium_sword", MaterialHandler.TITANIUM_WEAPON, CreativeTabHandler.weaponTab);
    }
    public static void register() {
        GameRegistry.register(emeraldsword);
        GameRegistry.register(palladiumsword);
        GameRegistry.register(titaniumsword);
    }
    public static void registerRenders() {
        registerRender(emeraldsword);
        registerRender(palladiumsword);
        registerRender(titaniumsword);
    }
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
