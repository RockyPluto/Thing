package net.pluto.thing.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pluto.thing.Thing;

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
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
