package com.darknesgaming.ultimategems.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

class CreativeTabHandler {
    static CreativeTabs blockTab = new CreativeTabs("block_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemFromBlock(BlockHandler.palladiumore));
        }
    };
    static CreativeTabs itemTab = new CreativeTabs("item_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemById(Item.getIdFromItem(ItemHandler.palladiumingot)));
        }
    };
    static CreativeTabs toolTab = new CreativeTabs("tool_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemById(Item.getIdFromItem(ToolHandler.emeraldpickaxe)));
        }
    };
    static CreativeTabs weaponTab = new CreativeTabs("weapon_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemById(Item.getIdFromItem(WeaponHandler.emeraldsword)));
        }
    };
}
