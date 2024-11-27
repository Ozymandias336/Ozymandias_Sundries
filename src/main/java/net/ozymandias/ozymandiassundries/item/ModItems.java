package net.ozymandias.ozymandiassundries.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;

import static net.minecraft.world.item.Tiers.DIAMOND;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OzymandiasSundries.MOD_ID);

    public static final DeferredItem<SwordItem> SACRIFICIAL_KRIS = ITEMS.register("sacrificial_kris",
            () -> new SwordItem(DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(DIAMOND, 4, -1.4f))));

    public static final DeferredItem<SwordItem> SANCTIFIED_SWORD = ITEMS.register("sanctified_sword",
            () -> new SwordItem(DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(DIAMOND, 6, -2.4f))));

    public static final DeferredItem<SwordItem> CINDEROUS_SCIMITAR = ITEMS.register("cinderous_scimitar",
            () -> new SwordItem(DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(DIAMOND, 6, -2.4f))));

    public static final DeferredItem<SwordItem> PERMAFROST_AXE = ITEMS.register("permafrost_axe",
            () -> new SwordItem(DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(DIAMOND, 8, -2.9f))));

    public static final DeferredItem<SwordItem> ELDRITCH_GREATSWORD = ITEMS.register("eldritch_greatsword",
            () -> new SwordItem(DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(DIAMOND, 10, -3.1f))));

    public static final DeferredItem<SwordItem> DRUID_SCYTHE = ITEMS.register("druid_scythe",
            () -> new SwordItem(DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(DIAMOND, 7, -2.5f))));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
