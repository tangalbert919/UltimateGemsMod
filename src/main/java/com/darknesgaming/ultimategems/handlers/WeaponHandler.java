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
    static Item rubysword;
    static Item sapphiresword;
    static Item topazsword;
    static Item peridotsword;
    public static void init() {
        emeraldsword = new ModSword("emerald_sword", MaterialHandler.EMERALD_WEAPON, CreativeTabHandler.weaponTab);
        palladiumsword = new ModSword("palladium_sword", MaterialHandler.PALLADIUM_WEAPON, CreativeTabHandler.weaponTab);
        titaniumsword = new ModSword("titanium_sword", MaterialHandler.TITANIUM_WEAPON, CreativeTabHandler.weaponTab);
        rubysword = new ModSword("ruby_sword", MaterialHandler.RS_WEAPON, CreativeTabHandler.weaponTab);
        sapphiresword = new ModSword("sapphire_sword", MaterialHandler.RS_WEAPON, CreativeTabHandler.weaponTab);
        topazsword = new ModSword("topaz_sword", MaterialHandler.PT_WEAPON, CreativeTabHandler.weaponTab);
        peridotsword = new ModSword("peridot_sword", MaterialHandler.PT_WEAPON, CreativeTabHandler.weaponTab);
    }
    public static void register() {
        GameRegistry.register(emeraldsword);
        GameRegistry.register(palladiumsword);
        GameRegistry.register(titaniumsword);
        GameRegistry.register(rubysword);
        GameRegistry.register(sapphiresword);
        GameRegistry.register(topazsword);
        GameRegistry.register(peridotsword);
    }
    public static void registerRenders() {
        registerRender(emeraldsword);
        registerRender(palladiumsword);
        registerRender(titaniumsword);
        registerRender(rubysword);
        registerRender(sapphiresword);
        registerRender(topazsword);
        registerRender(peridotsword);
    }
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
