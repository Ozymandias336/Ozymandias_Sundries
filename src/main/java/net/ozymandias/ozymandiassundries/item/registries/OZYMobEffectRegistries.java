package net.ozymandias.ozymandiassundries.item.registries;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import io.redspace.ironsspellbooks.effect.AbyssalShroudEffect;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;


public class OZYMobEffectRegistries {
    public static final DeferredRegister<MobEffect> MOB_EFFECT_DEFERRED_REGISTER = DeferredRegister.create(Registries.MOB_EFFECT, OzymandiasSundries.MOD_ID);

    public static final DeferredHolder<MobEffect, MobEffect> DEATH_WARD = MOB_EFFECT_DEFERRED_REGISTER.register("death_ward", () -> new AbyssalShroudEffect(MobEffectCategory.BENEFICIAL, 0));

    public static final DeferredHolder<MobEffect, MobEffect> MAGE_ARMOR = MOB_EFFECT_DEFERRED_REGISTER.register("mage_armor", () -> new AbyssalShroudEffect(MobEffectCategory.BENEFICIAL, 0));


    public static void register(IEventBus eventBus) {
        MOB_EFFECT_DEFERRED_REGISTER.register(eventBus);
    }

}



