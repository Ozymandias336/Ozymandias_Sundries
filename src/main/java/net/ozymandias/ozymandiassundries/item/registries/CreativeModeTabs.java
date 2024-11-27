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

import java.util.function.Supplier;

public class CreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OzymandiasSundries.MOD_ID);

    public static final Supplier<CreativeModeTab> OZY_ITEMS = CREATIVE_MODE_TAB.register("ozy_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemRegistries.SANCTIFIED_SWORD.get()))
                    .title(Component.translatable("creative_tab.ozymandias_sundries.ozy_items"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ItemRegistries.ELDRITCH_GREATSWORD.get());
                        output.accept(ItemRegistries.SACRIFICIAL_KRIS.get());
                        output.accept(ItemRegistries.SANCTIFIED_SWORD.get());
                        output.accept(ItemRegistries.PERMAFROST_AXE.get());
                        output.accept(ItemRegistries.CINDEROUS_SCIMITAR.get());
                        output.accept(ItemRegistries.DRUID_SCYTHE.get());

                       output.accept(ItemRegistries.FULMINOUS_FOLIO.get());
                    }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
