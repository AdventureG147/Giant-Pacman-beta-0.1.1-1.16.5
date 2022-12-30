package net.adventureg147.giantpacman.entity;


import net.adventureg147.giantpacman.GiantPacman;
//import net.adventureg147.giantpacman.entity.custom.GiantPacmanEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, GiantPacman.MOD_ID);

    //public static final RegistryObject<EntityType<GiantPacmanEntity>> GIANT_PACMAN =
            //ENTITY_TYPES.register("giant_pacman",
                   // () -> {
                        //return EntityType.Builder.create(GiantPacmanEntity::new,
                                       // EntityClassification.MONSTER).size(1f, 3f)
                                //build(new ResourceLocation(GiantPacman.MOD_ID, "giant_pacman").toString());
                   // });
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
