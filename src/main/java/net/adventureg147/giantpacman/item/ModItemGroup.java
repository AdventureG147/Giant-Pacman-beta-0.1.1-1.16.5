package net.adventureg147.giantpacman.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup
{
    public static final ItemGroup PACMAN_GROUP = new ItemGroup("pacmanModTab") {
        @Override
        public ItemStack createIcon() {
            {
                return new ItemStack(ModItems.PLACEHOLDER.get());
            }
        }
    };
}
