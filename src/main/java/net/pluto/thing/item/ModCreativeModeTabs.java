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

    public static final RegistryObject<CreativeModeTab> PHASE_0 = CREATIVE_MODE_TABS.register("mod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WORLD_KEY.get()))
                    .title(Component.translatable("creativetab.thing.phase_0"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BLANK_KEY.get());
                        output.accept(ModItems.DRAGON_FRAGMENT.get());
                        output.accept(ModItems.WITHER_FRAGMENT.get());
                        output.accept(ModItems.WARDEN_FRAGMENT.get());
                        output.accept(ModItems.WORLD_KEY.get());
                        output.accept(ModBlocks.WORLD_BLOCK.get());
                        output.accept(ModBlocks.XIELSTONE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> CORRUPTED = CREATIVE_MODE_TABS.register("corrupted",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CORRUPTED_GROUND.get()))
                    .withTabsBefore(PHASE_0.getId())
                    .title(Component.translatable("creativetab.thing.mod_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.CORRUPTED_GROUND.get());
                        output.accept(ModBlocks.CORRUPTED_ORE.get());
                        output.accept(ModBlocks.CORRUPTED_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
