package com.darknesgaming.ultimategems.handlers;

import com.darknesgaming.ultimategems.items.ModAxe;
import com.darknesgaming.ultimategems.items.ModHoe;
import com.darknesgaming.ultimategems.items.ModPickaxe;
import com.darknesgaming.ultimategems.items.ModSpade;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class is used to handle tools. The common proxy will use this to load and
 * register these tools during pre-initialization.
 */
public class ToolHandler {
    // Emerald Tools
    static Item emeraldpickaxe;
    static Item emeraldaxe;
    static Item emeraldspade;
    static Item emeraldhoe;
    // Palladium Tools
    static Item palladiumpickaxe;
    static Item palladiumaxe;
    static Item palladiumspade;
    static Item palladiumhoe;
    // Titanium Tools
    static Item titaniumpickaxe;
    static Item titaniumaxe;
    static Item titaniumspade;
    static Item titaniumhoe;
    // Ruby Tools
    static Item rubypickaxe;
    static Item rubyaxe;
    static Item rubyspade;
    static Item rubyhoe;
    // Sapphire Tools
    static Item sapphirepickaxe;
    static Item sapphireaxe;
    static Item sapphirespade;
    static Item sapphirehoe;
    // Topaz Tools
    static Item topazpickaxe;
    static Item topazaxe;
    static Item topazspade;
    static Item topazhoe;
    // Peridot Tools
    static Item peridotpickaxe;
    static Item peridotaxe;
    static Item peridotspade;
    static Item peridothoe;
    // Tools are initialized here.
    public static void init() {
        emeraldpickaxe = new ModPickaxe("emerald_pickaxe", MaterialHandler.EMERALD_TOOL, CreativeTabHandler.toolTab);
        emeraldaxe = new ModAxe("emerald_axe", MaterialHandler.EMERALD_AXE, CreativeTabHandler.toolTab);
        emeraldspade = new ModSpade("emerald_spade", MaterialHandler.EMERALD_TOOL, CreativeTabHandler.toolTab);
        emeraldhoe = new ModHoe("emerald_hoe", MaterialHandler.EMERALD_TOOL, CreativeTabHandler.toolTab);
        // Palladium Tools
        palladiumpickaxe = new ModPickaxe("palladium_pickaxe", MaterialHandler.PALLADIUM_TOOL, CreativeTabHandler.toolTab);
        palladiumaxe = new ModAxe("palladium_axe", MaterialHandler.PALLADIUM_AXE, CreativeTabHandler.toolTab);
        palladiumspade = new ModSpade("palladium_spade", MaterialHandler.PALLADIUM_TOOL, CreativeTabHandler.toolTab);
        palladiumhoe = new ModHoe("palladium_hoe", MaterialHandler.PALLADIUM_TOOL, CreativeTabHandler.toolTab);
        // Titanium Tools
        titaniumpickaxe = new ModPickaxe("titanium_pickaxe", MaterialHandler.TITANIUM_TOOL, CreativeTabHandler.toolTab);
        titaniumaxe = new ModAxe("titanium_axe", MaterialHandler.TITANIUM_AXE, CreativeTabHandler.toolTab);
        titaniumspade = new ModSpade("titanium_spade", MaterialHandler.TITANIUM_TOOL, CreativeTabHandler.toolTab);
        titaniumhoe = new ModHoe("titanium_hoe", MaterialHandler.TITANIUM_TOOL, CreativeTabHandler.toolTab);
        // Ruby Tools
        rubypickaxe = new ModPickaxe("ruby_pickaxe", MaterialHandler.RS_TOOL, CreativeTabHandler.toolTab);
        rubyaxe = new ModAxe("ruby_axe", MaterialHandler.RS_AXE, CreativeTabHandler.toolTab);
        rubyspade = new ModSpade("ruby_spade", MaterialHandler.RS_TOOL, CreativeTabHandler.toolTab);
        rubyhoe = new ModHoe("ruby_hoe", MaterialHandler.RS_TOOL, CreativeTabHandler.toolTab);
        // Sapphire Tools
        sapphirepickaxe = new ModPickaxe("sapphire_pickaxe", MaterialHandler.RS_TOOL, CreativeTabHandler.toolTab);
        sapphireaxe = new ModAxe("sapphire_axe", MaterialHandler.RS_AXE, CreativeTabHandler.toolTab);
        sapphirespade = new ModSpade("sapphire_spade", MaterialHandler.RS_TOOL, CreativeTabHandler.toolTab);
        sapphirehoe = new ModHoe("sapphire_hoe", MaterialHandler.RS_TOOL, CreativeTabHandler.toolTab);
        // Topaz Tools
        topazpickaxe = new ModPickaxe("topaz_pickaxe", MaterialHandler.PT_TOOL, CreativeTabHandler.toolTab);
        topazaxe = new ModAxe("topaz_axe", MaterialHandler.PT_AXE, CreativeTabHandler.toolTab);
        topazspade = new ModSpade("topaz_spade", MaterialHandler.PT_TOOL, CreativeTabHandler.toolTab);
        topazhoe = new ModHoe("topaz_hoe", MaterialHandler.PT_TOOL, CreativeTabHandler.toolTab);
        // Peridot Tools
        peridotpickaxe = new ModPickaxe("peridot_pickaxe", MaterialHandler.PT_TOOL, CreativeTabHandler.toolTab);
        peridotaxe = new ModAxe("peridot_axe", MaterialHandler.PT_AXE, CreativeTabHandler.toolTab);
        peridotspade = new ModSpade("peridot_spade", MaterialHandler.PT_TOOL, CreativeTabHandler.toolTab);
        peridothoe = new ModHoe("peridot_hoe", MaterialHandler.PT_TOOL, CreativeTabHandler.toolTab);
    }
    // These tools will then be registered.
    public static void register() {
        GameRegistry.register(emeraldaxe);
        GameRegistry.register(emeraldhoe);
        GameRegistry.register(emeraldpickaxe);
        GameRegistry.register(emeraldspade);
        GameRegistry.register(palladiumaxe);
        GameRegistry.register(palladiumhoe);
        GameRegistry.register(palladiumpickaxe);
        GameRegistry.register(palladiumspade);
        GameRegistry.register(titaniumaxe);
        GameRegistry.register(titaniumhoe);
        GameRegistry.register(titaniumpickaxe);
        GameRegistry.register(titaniumspade);
        // TODO: Make textures for these tools.
        GameRegistry.register(rubyaxe);
        GameRegistry.register(rubyhoe);
        GameRegistry.register(rubypickaxe);
        GameRegistry.register(rubyspade);
        GameRegistry.register(sapphireaxe);
        GameRegistry.register(sapphirehoe);
        GameRegistry.register(sapphirepickaxe);
        GameRegistry.register(sapphirespade);
        GameRegistry.register(topazaxe);
        GameRegistry.register(topazhoe);
        GameRegistry.register(topazpickaxe);
        GameRegistry.register(topazspade);
        GameRegistry.register(peridotaxe);
        GameRegistry.register(peridothoe);
        GameRegistry.register(peridotpickaxe);
        GameRegistry.register(peridotspade);
    }
    // The renderings need to be registered as well.
    public static void registerRenders() {
        registerRender(emeraldaxe);
        registerRender(emeraldhoe);
        registerRender(emeraldpickaxe);
        registerRender(emeraldspade);
        registerRender(palladiumaxe);
        registerRender(palladiumhoe);
        registerRender(palladiumpickaxe);
        registerRender(palladiumspade);
        registerRender(titaniumaxe);
        registerRender(titaniumhoe);
        registerRender(titaniumpickaxe);
        registerRender(titaniumspade);
        registerRender(rubyaxe);
        registerRender(rubyhoe);
        registerRender(rubypickaxe);
        registerRender(rubyspade);
        registerRender(sapphireaxe);
        registerRender(sapphirehoe);
        registerRender(sapphirepickaxe);
        registerRender(sapphirespade);
        registerRender(topazaxe);
        registerRender(topazhoe);
        registerRender(topazpickaxe);
        registerRender(topazspade);
        registerRender(peridotaxe);
        registerRender(peridothoe);
        registerRender(peridotpickaxe);
        registerRender(peridotspade);
    }
    // Forge needs to know how to search for the models and textures.
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
