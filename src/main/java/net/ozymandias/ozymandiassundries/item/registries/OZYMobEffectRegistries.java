package net.ozymandias.ozymandiassundries.item.registries;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.effect.AbyssalShroudEffect;
import io.redspace.ironsspellbooks.effect.MagicMobEffect;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;


import static net.neoforged.neoforge.common.damagesource.DamageContainer.Reduction.MOB_EFFECTS;


public class OZYMobEffectRegistries {
    public static final DeferredRegister<MobEffect> MOB_EFFECT_DEFERRED_REGISTER = DeferredRegister.create(Registries.MOB_EFFECT, OzymandiasSundries.MOD_ID);

    public static final DeferredHolder<MobEffect, MobEffect> DEATH_WARD = MOB_EFFECT_DEFERRED_REGISTER.register("death_ward", () -> new AbyssalShroudEffect(MobEffectCategory.BENEFICIAL, 0));












    public static final DeferredHolder<MobEffect, MobEffect> STONE_SKIN = MOB_EFFECT_DEFERRED_REGISTER.register("stone_skin", () -> new MagicMobEffect(MobEffectCategory.BENEFICIAL, 0xD9C043).addAttributeModifier(Attributes.ARMOR, IronsSpellbooks.id("mobeffect_stone_skin"), .10, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL).addAttributeModifier(Attributes.ATTACK_SPEED, IronsSpellbooks.id("mobeffect_stone_skin"), .10, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL).addAttributeModifier(AttributeRegistry.MANA_REGEN, IronsSpellbooks.id("mobeffect_stone_skin"), .10, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL).addAttributeModifier(AttributeRegistry.CAST_TIME_REDUCTION, IronsSpellbooks.id("mobeffect_stone_skin"), .10, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    public static void register(IEventBus eventBus) {
        MOB_EFFECT_DEFERRED_REGISTER.register(eventBus);
    }

}



