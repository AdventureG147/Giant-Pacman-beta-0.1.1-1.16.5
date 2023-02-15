package net.adventureg147.giantpacman.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup
{
    public static final ItemGroup PACMAN_GROUP = new ItemGroup("pacmanModTab") {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.PACMAN_SPAWN_EGG.get());
        }
    };
}
