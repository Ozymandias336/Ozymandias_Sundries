package net.ozymandias.ozymandiassundries.item.curios;

import io.redspace.ironsspellbooks.compat.Curios;
import io.redspace.ironsspellbooks.item.curios.SimpleDescriptiveCurio;
import io.redspace.ironsspellbooks.registries.MobEffectRegistry;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;

public class RingOfFeatherCurio extends SimpleDescriptiveCurio {
    public RingOfFeatherCurio() {
        super(ItemPropertiesHelper.equipment().stacksTo(1).fireResistant(), Curios.RING_SLOT);
    }

    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        super.curioTick(slotContext, stack);
        slotContext.entity().addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 0));
    }




}
