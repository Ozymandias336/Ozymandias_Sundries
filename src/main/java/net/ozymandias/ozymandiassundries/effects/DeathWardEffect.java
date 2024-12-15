package net.ozymandias.ozymandiassundries.effects;

import io.redspace.ironsspellbooks.effect.MagicMobEffect;
import io.redspace.ironsspellbooks.util.TooltipsUtils;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.ozymandias.ozymandiassundries.item.registries.OZYMobEffectRegistries;
import net.ozymandias.ozymandiassundries.spells.holy.DeathWard;

import java.util.ArrayList;
import java.util.List;

//public class DeathWard extends MobEffect {
  //  public DeathWard (MobEffectCategory category, int color) {

 //   }
//}

//@SubscribeEvent
//public static void onEntityDeath(LivingDeathEvent event) {
  //  LivingEntity entity = event.getEntity();
  //  if (entity.hasEffect(OZYMobEffectRegistries.DEATH_WARD)) {

      //  event.setCanceled(true);

     //   entity.removeEffect(OZYMobEffectRegistries.DEATH_WARD);

     //   teleportEntityToRecordedPosition(entity);

      //  clearRecordedPosition(entity);
   // }
//}
