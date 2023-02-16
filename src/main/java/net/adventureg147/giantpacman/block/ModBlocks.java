package net.adventureg147.giantpacman.block;

import net.adventureg147.giantpacman.GiantPacman;
import net.adventureg147.giantpacman.block.custom.TrophyBlock;
import net.adventureg147.giantpacman.item.ModItemGroup;
import net.adventureg147.giantpacman.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GiantPacman.MOD_ID);

    public static final RegistryObject<Block> PACMAN_TROPHY = registerBlock("pacman_trophy", () -> new TrophyBlock(AbstractBlock.Properties.of(Material.DECORATION).noOcclusion()));
    public static final RegistryObject<Block> GOLDEN_TROPHY = registerBlock("golden_pacman_trophy", () -> new TrophyBlock(AbstractBlock.Properties.of(Material.DECORATION).noOcclusion()));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
         RegistryObject<T> toReturn = BLOCKS.register(name, block);
         registerBlockItem(name, toReturn);
         return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.PACMAN_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
