package net.ozymandias.ozymandiassundries.item.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.EventBus;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;
import net.ozymandias.ozymandiassundries.item.ModItems;

import java.util.function.Supplier;

public class CreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OzymandiasSundries.MOD_ID);

    public static final Supplier<CreativeModeTab> OZY_ITEMS = CREATIVE_MODE_TAB.register("ozy_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SANCTIFIED_SWORD.get()))
                    .title(Component.translatable("creative_tab.ozymandias_sundries.ozy_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SACRIFICIAL_KRIS);
                        output.accept(ModItems.SANCTIFIED_SWORD);
                        output.accept(ModItems.CINDEROUS_SCIMITAR);
                        output.accept(ModItems.PERMAFROST_AXE);
                        output.accept(ModItems.ELDRITCH_GREATSWORD);
                        output.accept(ModItems.DRUID_SCYTHE);
                    }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
