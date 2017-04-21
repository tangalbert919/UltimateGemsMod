package com.darknesgaming.ultimategems.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabHandler {
    public static CreativeTabs blockTab = new CreativeTabs("block_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemFromBlock(BlockHandler.block));
        }
    };
    public static CreativeTabs itemTab = new CreativeTabs("item_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemById(Item.getIdFromItem(ItemHandler.item)));
        }
    };
    public static CreativeTabs toolTab = new CreativeTabs("tool_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemById(Item.getIdFromItem(ToolHandler.emeraldpickaxe)));
        }
    };
    public static CreativeTabs weaponTab = new CreativeTabs("weapon_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemById(Item.getIdFromItem(ItemHandler.emeraldsword)));
        }
    };
}
