package net.pluto.thing.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pluto.thing.Thing;
import net.pluto.thing.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Thing.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NON_STORY_LINE = CREATIVE_MODE_TABS.register("non_story_line",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ASMITE.get()))
                    .title(Component.translatable("creativetab.thing.non_story_line"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ASMITE.get());
                        output.accept(ModItems.RAW_ASMITE.get());
                        output.accept(ModBlocks.ASMITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ASMITE_BLOCK.get());
                        output.accept(ModBlocks.ASMITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_ASMITE_ORE.get());
                        output.accept(ModItems.BARITE.get());
                        output.accept(ModItems.RAW_BARITE.get());
                        output.accept(ModBlocks.BARITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_BARITE_BLOCK.get());
                        output.accept(ModBlocks.BARITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_BARITE_ORE.get());
                        output.accept(ModItems.ENDERITE.get());
                        output.accept(ModItems.RAW_ENDERITE.get());
                        output.accept(ModBlocks.ENDERITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ENDERITE_BLOCK.get());
                        output.accept(ModBlocks.ENDERITE_ORE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> PHASE_0 = CREATIVE_MODE_TABS.register("phase_0",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WORLD_KEY.get()))
                    .withTabsBefore(NON_STORY_LINE.getId())
                    .title(Component.translatable("creativetab.thing.phase_0"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BLANK_KEY.get());
                        output.accept(ModItems.DRAGON_FRAGMENT.get());
                        output.accept(ModItems.WITHER_FRAGMENT.get());
                        output.accept(ModItems.WARDEN_FRAGMENT.get());
                        output.accept(ModItems.WORLD_KEY.get());
                        output.accept(ModBlocks.WORLD_BLOCK.get());
                        output.accept(ModBlocks.XIELSTONE.get());
                        output.accept(ModItems.WORLD_INGOT.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> CORRUPTED = CREATIVE_MODE_TABS.register("corrupted",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CORRUPTED_GROUND.get()))
                    .withTabsBefore(PHASE_0.getId())
                    .title(Component.translatable("creativetab.thing.corrupted"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.CORRUPTED_GROUND.get());
                        output.accept(ModBlocks.CORRUPTED_ORE.get());
                        output.accept(ModBlocks.CORRUPTED_BLOCK.get());
                        output.accept(ModItems.CORRUPTED_INGOT.get());
                        output.accept(ModItems.CORRUPTED_SHARD.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
