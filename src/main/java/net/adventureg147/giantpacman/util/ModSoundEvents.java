package net.adventureg147.giantpacman.util;

import net.adventureg147.giantpacman.GiantPacman;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEvents
{
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GiantPacman.MOD_ID);


    public static RegistryObject<SoundEvent> PACMAN_SOUND =
            registerSoundEvent("pacman_sound");

    public static RegistryObject<SoundEvent> PACMAN_HURT =
            registerSoundEvent("pacman_hurt");

    public static RegistryObject<SoundEvent> PACMAN_DEATH =
            registerSoundEvent("pacman_death");

    public static RegistryObject<SoundEvent> registerSoundEvent(String name) {
      return SOUND_EVENTS.register(name, ()-> new SoundEvent(new ResourceLocation(GiantPacman.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
