package net.adventureg147.giantpacman.entity;

import net.adventureg147.giantpacman.GiantPacman;
import net.adventureg147.giantpacman.entity.custom.GeoGPacmanEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, GiantPacman.MOD_ID);

    public static final RegistryObject<EntityType<GeoGPacmanEntity>> GIANT_PACMAN = ENTITY_TYPES.register("giant_pacman",
            () -> EntityType.Builder.of(GeoGPacmanEntity::new, EntityClassification.MONSTER)
                    .sized(2f, 2f)
                    .build(new ResourceLocation(GiantPacman.MOD_ID, "giant_pacman").toString()));





    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
