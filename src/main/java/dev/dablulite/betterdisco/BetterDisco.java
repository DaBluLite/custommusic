package dev.dablulite.betterdisco;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import dev.dablulite.betterdisco.item.ModItems;

public class BetterDisco implements ModInitializer {
    @Override
    public void onInitialize() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.SIMPLE_DUNGEON_CHEST.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .with(ItemEntry.builder(ModItems.LENA_RAINE_CREATOR_MUSIC_DISC).weight(1))
                    .with(ItemEntry.builder(ModItems.PRECIPICE_MUSIC_DISC).weight(1))
                    .with(ItemEntry.builder(ModItems.KOMM_SUSSER_TOD_MUSIC_DISC).weight(1))
                    .with(ItemEntry.builder(ModItems.MIWA_CHANGE_MUSIC_DISC).weight(1))
                    .with(ItemEntry.builder(ModItems.REMEMBER_THAT_NIGHT_MUSIC_DISC).weight(1))
                    .with(ItemEntry.builder(ModItems.VIGNETTE_MUSIC_DISC).weight(1));
                tableBuilder.pool(poolBuilder);
            }
        });

        ModItems.registerModItems();
    }
}