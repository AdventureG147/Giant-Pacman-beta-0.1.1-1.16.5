package net.adventureg147.giantpacman.entity;


import net.adventureg147.giantpacman.GiantPacman;
//import net.adventureg147.giantpacman.entity.custom.GiantPacmanEntity;
import net.minecraft.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, GiantPacman.MOD_ID);



    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
