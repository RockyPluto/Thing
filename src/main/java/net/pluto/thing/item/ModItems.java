package net.pluto.thing.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pluto.thing.Thing;
import net.pluto.thing.item.custom.ChiselItem;
import net.pluto.thing.item.custom.FuelItem;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Thing.MOD_ID);

    public static final RegistryObject<Item> BLANK_KEY = ITEMS.register("blank_key",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_FRAGMENT = ITEMS.register("dragon_frag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WITHER_FRAGMENT = ITEMS.register("wither_frag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WARDEN_FRAGMENT = ITEMS.register("warden_frag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WORLD_KEY = ITEMS.register("world_key",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.thing.world_key"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
    public static final RegistryObject<Item> CORRUPTED_INGOT = ITEMS.register("corrupted_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORRUPTED_SHARD = ITEMS.register("corrupted_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WORLD_INGOT = ITEMS.register("world_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASMITE = ITEMS.register("asmite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ASMITE = ITEMS.register("raw_asmite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BARITE = ITEMS.register("barite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BARITE = ITEMS.register("raw_barite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDERITE = ITEMS.register("enderite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ENDERITE = ITEMS.register("raw_enderite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ONION)));
    public static final RegistryObject<Item> NULLED_COAL = ITEMS.register("nulled_coal",
            () -> new FuelItem(new Item.Properties(), 800));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
