package net.adventureg147.giantpacman.item;

import net.adventureg147.giantpacman.GiantPacman;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GiantPacman.MOD_ID);

    public static final RegistryObject<Item> PLACEHOLDER =
            ITEMS.register("placeholder", () -> new Item(new Item.Properties().group(ModItemGroup.PACMAN_GROUP)));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
