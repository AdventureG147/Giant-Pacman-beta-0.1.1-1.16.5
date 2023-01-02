package net.adventureg147.giantpacman.block;

import net.adventureg147.giantpacman.GiantPacman;
import net.adventureg147.giantpacman.item.ModItemGroup;
import net.adventureg147.giantpacman.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.IntArray;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapeCube;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import javax.swing.text.html.BlockView;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;


public class ModBlocks {


    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GiantPacman.MOD_ID);

    public static final RegistryObject<Block> PACMAN_TROPHY =
            registerBlock("pacman_trophy",
                    () -> new Block(AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                            .hardnessAndResistance(3f).notSolid()));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
         RegistryObject<T> toReturn = BLOCKS.register(name, block);
         registerBlockItem(name, toReturn);
         return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.PACMAN_GROUP)));
    }






    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


}
