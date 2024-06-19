package dev.dablulite.betterdisco.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent LENA_RAINE_CREATOR = registerSoundEvent("lena_raine_creator");

    public static SoundEvent PRECIPICE = registerSoundEvent("precipice");

    public static SoundEvent VIGNETTE = registerSoundEvent("vignette");

    public static SoundEvent KOMM_SUSSER_TOD = registerSoundEvent("komm_susser_tod");

    public static SoundEvent NEVER_GONNA_GIVE_YOU_UP = registerSoundEvent("never_gonna_give_you_up");

    public static SoundEvent MIWA_CHANGE = registerSoundEvent("miwa_change");

    public static SoundEvent REMEMBER_THAT_NIGHT = registerSoundEvent("remember_that_night");

    public static SoundEvent ROUTINES_IN_THE_NIGHT = registerSoundEvent("routines_in_the_night");

    public static SoundEvent NAVIGATING = registerSoundEvent("navigating");

    public static SoundEvent PALADIN_STRAIT = registerSoundEvent("paladin_strait");

    public static SoundEvent ALL_MY_LIFE = registerSoundEvent("all_my_life");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier("betterdisco", name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}