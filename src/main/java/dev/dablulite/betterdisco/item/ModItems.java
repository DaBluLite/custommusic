package dev.dablulite.betterdisco.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import dev.dablulite.betterdisco.sound.ModSounds;
import net.minecraft.item.*;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.MusicDiscItem;

public class ModItems {
    public static final Item LENA_RAINE_CREATOR_MUSIC_DISC = registerItem("lena_raine_creator_music_disc",
            new MusicDiscItem(15, ModSounds.LENA_RAINE_CREATOR, new FabricItemSettings().maxCount(1), 177));

    public static final Item PRECIPICE_MUSIC_DISC = registerItem("precipice_music_disc",
            new MusicDiscItem(15, ModSounds.PRECIPICE, new FabricItemSettings().maxCount(1), 299));

    public static final Item VIGNETTE_MUSIC_DISC = registerItem("vignette_music_disc",
            new MusicDiscItem(15, ModSounds.VIGNETTE, new FabricItemSettings().maxCount(1), 202));

    public static final Item KOMM_SUSSER_TOD_MUSIC_DISC = registerItem("komm_susser_tod_music_disc",
            new MusicDiscItem(15, ModSounds.KOMM_SUSSER_TOD, new FabricItemSettings().maxCount(1), 473));

    public static final Item NEVER_GONNA_GIVE_YOU_UP_MUSIC_DISC = registerItem("never_gonna_give_you_up_music_disc",
            new MusicDiscItem(15, ModSounds.NEVER_GONNA_GIVE_YOU_UP, new FabricItemSettings().maxCount(1), 215));

    public static final Item MIWA_CHANGE_MUSIC_DISC = registerItem("miwa_change_music_disc",
            new MusicDiscItem(15, ModSounds.MIWA_CHANGE, new FabricItemSettings().maxCount(1), 249));

    public static final Item REMEMBER_THAT_NIGHT_MUSIC_DISC = registerItem("remember_that_night_music_disc",
            new MusicDiscItem(15, ModSounds.REMEMBER_THAT_NIGHT, new FabricItemSettings().maxCount(1), 249));

    public static final Item ROUTINES_IN_THE_NIGHT_MUSIC_DISC = registerItem("routines_in_the_night_music_disc",
            new MusicDiscItem(15, ModSounds.ROUTINES_IN_THE_NIGHT, new FabricItemSettings().maxCount(1), 249));

    public static final Item NAVIGATING_MUSIC_DISC = registerItem("navigating_music_disc",
            new MusicDiscItem(15, ModSounds.NAVIGATING, new FabricItemSettings().maxCount(1), 249));

    public static final Item PALADIN_STRAIT_MUSIC_DISC = registerItem("paladin_strait_music_disc",
            new MusicDiscItem(15, ModSounds.PALADIN_STRAIT, new FabricItemSettings().maxCount(1), 249));

    public static final Item ALL_MY_LIFE_MUSIC_DISC = registerItem("all_my_life_music_disc",
            new MusicDiscItem(15, ModSounds.ALL_MY_LIFE, new FabricItemSettings().maxCount(1), 194));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier("betterdisco", name), item);
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(LENA_RAINE_CREATOR_MUSIC_DISC);
        entries.add(PRECIPICE_MUSIC_DISC);
        entries.add(VIGNETTE_MUSIC_DISC);
        entries.add(KOMM_SUSSER_TOD_MUSIC_DISC);
        entries.add(NEVER_GONNA_GIVE_YOU_UP_MUSIC_DISC);
        entries.add(MIWA_CHANGE_MUSIC_DISC);
        entries.add(REMEMBER_THAT_NIGHT_MUSIC_DISC);
        entries.add(ROUTINES_IN_THE_NIGHT_MUSIC_DISC);
        entries.add(NAVIGATING_MUSIC_DISC);
        entries.add(PALADIN_STRAIT_MUSIC_DISC);
        entries.add(ALL_MY_LIFE_MUSIC_DISC);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToIngredientItemGroup);
    }
}