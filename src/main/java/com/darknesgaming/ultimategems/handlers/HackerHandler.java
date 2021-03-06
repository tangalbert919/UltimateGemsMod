package com.darknesgaming.ultimategems.handlers;

import com.darknesgaming.ultimategems.items.ModAxe;
import com.darknesgaming.ultimategems.items.ModPickaxe;
import com.darknesgaming.ultimategems.items.ModSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class handles what hackers will absolutely LOVE to use.
 * Unless you want to mess with people, don't let the proxies use this class.
 */
public class HackerHandler {
    private static Item hackeraxe;
    private static Item hackersword;
    private static Item hackerpickaxe;
    public static void init() {
        hackeraxe = new ModAxe("hackers_axe", MaterialHandler.HACKER).setNoRepair();
        hackersword = new ModSword("hackers_sword", MaterialHandler.HACKER).setNoRepair();
        hackerpickaxe = new ModPickaxe("hackers_pickaxe", MaterialHandler.HACKER).setNoRepair();
    }
    public static void register() {
        GameRegistry.register(hackersword);
        GameRegistry.register(hackeraxe);
        GameRegistry.register(hackerpickaxe);
    }
    public static void registerRenders() {
        registerRender(hackeraxe);
        registerRender(hackersword);
        registerRender(hackerpickaxe);
    }
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
