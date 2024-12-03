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

    public static final RegistryObject<CreativeModeTab> MOD_ITEMS = CREATIVE_MODE_TABS.register("mod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLANK_KEY.get()))
                    .title(Component.translatable("creativetab.thing.mod_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BLANK_KEY.get());
                        output.accept(ModItems.DRAGON_FRAGMENT.get());
                        output.accept(ModItems.WITHER_FRAGMENT.get());
                        output.accept(ModItems.WARDEN_FRAGMENT.get());
                        output.accept(ModItems.WORLD_KEY.get());
                    }).build());

    /*public static final RegistryObject<CreativeModeTab> MOD_BLOCKS = CREATIVE_MODE_TABS.register("mod_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks. Name here .get()))
                    .withTabsBefore(MOD_ITEMS.getId())
                    .title(Component.translatable("creativetab.thing.mod_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks. Name here .get());
                    }).build());*/

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
