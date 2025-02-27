package net.ozymandias.ozymandiassundries.item.curios;

import io.redspace.ironsspellbooks.compat.Curios;
import io.redspace.ironsspellbooks.item.curios.SimpleDescriptiveCurio;
import io.redspace.ironsspellbooks.registries.MobEffectRegistry;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.AABB;
import net.ozymandias.ozymandiassundries.item.registries.OZYMobEffectRegistries;
import top.theillusivec4.curios.api.SlotContext;

import java.util.List;


public class EldritchEyeCurio extends SimpleDescriptiveCurio {
    public EldritchEyeCurio() {
        super(ItemPropertiesHelper.equipment().stacksTo(1).fireResistant(), Curios.NECKLACE_SLOT);
    }

    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        super.curioTick(slotContext, stack);
        slotContext.entity().removeEffect(MobEffects.DARKNESS);
        slotContext.entity().addEffect(new MobEffectInstance(MobEffectRegistry.PLANAR_SIGHT, 200, 0));

        //slotContext.entity().addEffect(new MobEffectInstance(OZYMobEffectRegistries.FLIGHT, 200, 0));
        
    }






    }









