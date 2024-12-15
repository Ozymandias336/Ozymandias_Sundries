package net.ozymandias.ozymandiassundries.spells.holy;

import io.redspace.ironsspellbooks.api.config.DefaultConfig;
import io.redspace.ironsspellbooks.api.magic.MagicData;
import io.redspace.ironsspellbooks.api.registry.SchoolRegistry;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.CastSource;
import io.redspace.ironsspellbooks.api.spells.CastType;
import io.redspace.ironsspellbooks.api.spells.SpellRarity;
import io.redspace.ironsspellbooks.api.util.Utils;
import io.redspace.ironsspellbooks.capabilities.magic.MagicManager;
import io.redspace.ironsspellbooks.capabilities.magic.RecastInstance;
import io.redspace.ironsspellbooks.damage.DamageSources;
import io.redspace.ironsspellbooks.entity.spells.eldritch_blast.EldritchBlastVisualEntity;
import io.redspace.ironsspellbooks.entity.spells.ray_of_frost.RayOfFrostVisualEntity;
import io.redspace.ironsspellbooks.registries.SoundRegistry;
import io.redspace.ironsspellbooks.util.ParticleHelper;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;
import net.ozymandias.ozymandiassundries.entity.spells.solar_ray.SolarRayRenderer;
import net.ozymandias.ozymandiassundries.item.registries.SpellRegistries;

import java.util.Optional;

public class SolarRay extends AbstractSpell {

    private final ResourceLocation spellId = ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "solar_ray");

    private final DefaultConfig defaultConfig = new DefaultConfig()
            .setMinRarity(SpellRarity.COMMON)
            .setSchoolResource(SchoolRegistry.HOLY_RESOURCE)
            .setMaxLevel(5)
            .setCooldownSeconds(15)
            .build();



    public SolarRay()
    {
        this.manaCostPerLevel = 15;
        this.baseSpellPower = 10;
        this.spellPowerPerLevel = 1;
        this.castTime = 0;
        this.baseManaCost = 50;
    }

    public SolarRay(Level level, Vec3 eyePosition, Vec3 location, LivingEntity entity) {
    }

    @Override
    public ResourceLocation getSpellResource() {
        return spellId;
    }

    @Override
    public DefaultConfig getDefaultConfig() {
        return defaultConfig;
    }

    @Override
    public CastType getCastType() {
        return CastType.INSTANT;
    }

    @Override
    public Optional<SoundEvent> getCastFinishSound() {
        return Optional.of(SoundRegistry.SUNBEAM_IMPACT.get());
    }

    @Override
    public void onCast(Level level, int spellLevel, LivingEntity entity, CastSource castSource, MagicData playerMagicData) {
        if (!playerMagicData.getPlayerRecasts().hasRecastForSpell(getSpellId())) {
            playerMagicData.getPlayerRecasts().addRecast(new RecastInstance(getSpellId(), spellLevel, getRecastCount(spellLevel, entity), 80, castSource, null), playerMagicData);
        }

        var hitResult = Utils.raycastForEntity(level, entity, getRange(spellLevel, entity), true, .15f);
        level.addFreshEntity(new EldritchBlastVisualEntity(level, entity.getEyePosition().subtract(0, .75f, 0), hitResult.getLocation(), entity));
        if (hitResult.getType() == HitResult.Type.ENTITY) {
            Entity target = ((EntityHitResult) hitResult).getEntity();
            if (target instanceof LivingEntity) {
                DamageSources.applyDamage(target, getDamage(spellLevel, entity), getDamageSource(entity));
            }
        }
        MagicManager.spawnParticles(level, ParticleHelper.WISP, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z, 50, 0, 0, 0, .3, false);
        super.onCast(level, spellLevel, entity, castSource, playerMagicData);
    }

    public static float getRange(int level, LivingEntity caster) {
        return 30;
    }

    private float getDamage(int spellLevel, LivingEntity caster) {
        return getSpellPower(spellLevel, caster);
    }

    private int getFreezeTime(int spellLevel, LivingEntity caster) {
        return (int) (getSpellPower(spellLevel, caster) * 30);
    }

   // @Override
   // public void onCast(Level level, int spellLevel, LivingEntity entity, CastSource castSource, MagicData playerMagicData) {
      //  var hitResult = Utils.raycastForEntity(level, entity, 30, true, 0.15F);
      //  SolarRay ray = new SolarRay(level, entity.getEyePosition(), hitResult.getLocation(), entity);
       // level.addFreshEntity(ray);

     //   if (hitResult.getType() == HitResult.Type.ENTITY)
      //  {
      //      Entity target = ((EntityHitResult) hitResult).getEntity();
//DamageSources.applyDamage(target, getDamage(spellLevel, entity), SpellRegistries.SOLAR_RAY.get().getDamageSource(entity));
         //   if (target instanceof LivingEntity livingTarget)
        //    {
          //      livingTarget.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 1, true, true, true));
          //      MagicManager.spawnParticles(level, ParticleHelper.EMBERS, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z, 10, 0, 0, 0, 0.1, true);
//}
          //  else if (hitResult.getType() == HitResult.Type.BLOCK)
          //  {
             //   MagicManager.spawnParticles(level, ParticleHelper.EMBERS, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z, 10, 0, 0, 0, 0.1, false);
//}
           // MagicManager.spawnParticles(level, ParticleHelper.EMBERS, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z, 10, 0, 0, 0, 0.1, false);
     //   }

       // super.onCast(level, spellLevel, entity, castSource, playerMagicData);
//
   // private float getDamage(int spellLevel, LivingEntity caster)
    //{
//return getSpellPower(spellLevel, caster) * 2F;
    //}
}

