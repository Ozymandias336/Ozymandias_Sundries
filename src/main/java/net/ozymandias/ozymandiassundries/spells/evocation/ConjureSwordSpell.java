package net.ozymandias.ozymandiassundries.spells.evocation;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import io.redspace.ironsspellbooks.api.config.DefaultConfig;
import io.redspace.ironsspellbooks.api.magic.MagicData;
import io.redspace.ironsspellbooks.api.registry.SchoolRegistry;
import io.redspace.ironsspellbooks.api.spells.*;
import io.redspace.ironsspellbooks.api.util.AnimationHolder;
import io.redspace.ironsspellbooks.api.util.Utils;
import io.redspace.ironsspellbooks.effect.OakskinEffect;
import io.redspace.ironsspellbooks.network.particles.OakskinParticlesPacket;
import io.redspace.ironsspellbooks.registries.MobEffectRegistry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.network.PacketDistributor;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;
import net.ozymandias.ozymandiassundries.item.registries.ItemRegistries;

import java.util.List;

//@AutoSpellConfig
//public class ConjureSwordSpell extends AbstractSpell {
  //  private final ResourceLocation spellId = ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "conjure_sword");
 //   public ConjureSwordSpell() {
   //     this.baseSpellPower = 1;
   //     this.spellPowerPerLevel = 1;
     //   this.baseManaCost = 100;
    //    this.manaCostPerLevel = 50;
     //   this.castTime = 100;
  //  }

   // @Override
   // public List<MutableComponent> getUniqueInfo(int spellLevel, LivingEntity caster) {
  //      return List.of();
  //  }

  //  private final DefaultConfig defaultConfig = new DefaultConfig()
   //         .setMinRarity(SpellRarity.LEGENDARY)
      //      .setSchoolResource(SchoolRegistry.EVOCATION_RESOURCE)
      //      .setMaxLevel(5)
      //      .setCooldownSeconds(150)
       //     .build();

   // @Override
   // public boolean canBeCraftedBy(Player player) {
   //     return true;
    //}

   // @Override
   // public ResourceLocation getSpellResource() {
   //     return this.spellId;
   // }

   // @Override
  //  public DefaultConfig getDefaultConfig() {
   //     return defaultConfig;
   // }

   // @Override
  //  public CastType getCastType() {
    //    return CastType.LONG;
   // }

    //@Override
  //  public void onCast(Level level, int spellLevel, LivingEntity entity, CastSource castSource, MagicData playerMagicData) {
  //      if (entity instanceof Player p) {
   //         var weapon = new ItemStack(ItemRegistries.SPECTRAL_GREATSWORD, spellLevel);
   //     } super.onCast(level, spellLevel, entity, castSource, playerMagicData);
   // }

   // public int getDuration(int spellLevel, LivingEntity caster) {
   //     return (int) (getSpellPower(spellLevel, caster) * 20);
   // }
//}