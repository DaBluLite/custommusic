package dev.dablulite.betterdisco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import dev.dablulite.betterdisco.item.ModItems;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LENA_RAINE_CREATOR_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRECIPICE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.VIGNETTE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.KOMM_SUSSER_TOD_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEVER_GONNA_GIVE_YOU_UP_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIWA_CHANGE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.REMEMBER_THAT_NIGHT_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROUTINES_IN_THE_NIGHT_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.NAVIGATING_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALL_MY_LIFE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOULLESS_EXISTENCE_MUSIC_DISC, Models.GENERATED);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }
}