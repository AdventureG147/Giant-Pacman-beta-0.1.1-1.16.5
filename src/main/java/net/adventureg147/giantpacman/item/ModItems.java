package net.adventureg147.giantpacman.item;

import net.adventureg147.giantpacman.GiantPacman;
import net.adventureg147.giantpacman.entity.ModEntityTypes;
import net.minecraft.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GiantPacman.MOD_ID);

    public static final RegistryObject<ForgeSpawnEggItem> PACMAN_SPAWN_EGG = ITEMS.register("pacman_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.GIANT_PACMAN, 0xF1E702, 0x767106, new Item.Properties().tab(ModItemGroup.PACMAN_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
