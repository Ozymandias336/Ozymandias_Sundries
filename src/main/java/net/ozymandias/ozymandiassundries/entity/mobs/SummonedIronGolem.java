package net.ozymandias.ozymandiassundries.entity.mobs;

import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import io.redspace.ironsspellbooks.api.util.Utils;
import io.redspace.ironsspellbooks.capabilities.magic.MagicManager;
import io.redspace.ironsspellbooks.entity.mobs.IMagicSummon;
import io.redspace.ironsspellbooks.entity.mobs.goals.*;
import io.redspace.ironsspellbooks.registries.EntityRegistry;
import io.redspace.ironsspellbooks.registries.MobEffectRegistry;
import io.redspace.ironsspellbooks.util.OwnerHelper;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;
import java.util.UUID;

//public class SummonedIronGolem extends IronGolem implements IMagicSummon {
 //   public SummonedIronGolem(EntityType<? extends IronGolem> pEntityType, Level pLevel) {
  //      super(pEntityType, pLevel);
   //     xpReward = 0;
   // }

   // public SummonedIronGolem(Level pLevel, LivingEntity owner) {
   //     this(EntityRegistry.SUMMONED_IRON_GOLEM.get(), pLevel);
    //    setSummoner(owner);
   // }

   // protected LivingEntity cachedSummoner;
  //  protected UUID summonerUUID;

  //  @Override
  //  public float maxUpStep() {
  //      return 1f;
  //  }
//
  //  @Override
  //  public void registerGoals() {

   //     this.goalSelector.addGoal(0, new FloatGoal(this));
   //     this.goalSelector.addGoal(1, new IronGolemMeleeAttackGoal());
       // this.goalSelector.addGoal(7, new GenericFollowOwnerGoal(this, this::getSummoner, 0.9f, 15, 5, false, 25));
     //   this.goalSelector.addGoal(8, new WaterAvoidingRandomStrollGoal(this, 0.8D));
    //    this.goalSelector.addGoal(9, new LookAtPlayerGoal(this, Player.class, 3.0F, 1.0F));
     //   this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, Mob.class, 8.0F));

     //   this.targetSelector.addGoal(1, new GenericOwnerHurtByTargetGoal(this, this::getSummoner));
     //   this.targetSelector.addGoal(2, new GenericOwnerHurtTargetGoal(this, this::getSummoner));
     //   this.targetSelector.addGoal(3, new GenericCopyOwnerTargetGoal(this, this::getSummoner));
     //   this.targetSelector.addGoal(4, (new GenericHurtByTargetGoal(this, (entity) -> entity == getSummoner())).setAlertOthers());

   // }




   // @Override
   // public LivingEntity getSummoner() {
  //      Level level = null;
    //    return OwnerHelper.getAndCacheOwner(level, cachedSummoner, summonerUUID);
   // }

   // @Override
  //  public void onUnSummon() {

 //   }

   // public void setSummoner(@Nullable LivingEntity owner) {
     //   if (owner != null) {
     //       this.summonerUUID = owner.getUUID();
      //      this.cachedSummoner = owner;
     //   }
 //   }

  //  @Override
  //  public void die(DamageSource pDamageSource) {
    //    this.onDeathHelper();
       // super.die(pDamageSource);
    //}

  //  @Override
   // public void onRemovedFromLevel() {
   //     this.onRemovedHelper(this, MobEffectRegistry.POLAR_BEAR_TIMER);
   //     super.onRemovedFromLevel();
  //  }

  //  @Override
   // public void readAdditionalSaveData(CompoundTag compoundTag) {
     //   super.readAdditionalSaveData(compoundTag);
       // this.summonerUUID = OwnerHelper.deserializeOwner(compoundTag);
 //   }

   // @Override
   // public void addAdditionalSaveData(CompoundTag compoundTag) {
    //    super.addAdditionalSaveData(compoundTag);
    //    OwnerHelper.serializeOwner(compoundTag, summonerUUID);
   // }

   // @Override
   // public boolean doHurtTarget(Entity pEntity) {
    //    return Utils.doMeleeAttack(this, pEntity, SpellRegistry.SUMMON_POLAR_BEAR_SPELL.get().getDamageSource(this, getSummoner()));
   // }

    //@Override
    //public boolean isAlliedTo(Entity pEntity) {
     //   return super.isAlliedTo(pEntity) || this.isAlliedHelper(pEntity);
  //  }

   // @Override
   // public boolean hurt(DamageSource pSource, float pAmount) {
   //     if (shouldIgnoreDamage(pSource))
    //        return false;
    //    return super.hurt(pSource, pAmount);
  //  }

   // public static AttributeSupplier.Builder createAttributes() {
   //     return Mob.createMobAttributes()
                //Health and Damage overridden by summoning via spell
        //        .add(Attributes.MAX_HEALTH, 100.0D)
        //        .add(Attributes.FOLLOW_RANGE, 20.0D)
         //       .add(Attributes.MOVEMENT_SPEED, 0.3D)
         //       .add(Attributes.STEP_HEIGHT, 1)
           //     .add(Attributes.ATTACK_DAMAGE, 7.5D);
 //   }

    //@Nullable
   // public LivingEntity getControllingPassenger() {
    //    Entity entity = this.getFirstPassenger();
   //     if (entity instanceof Mob) {
     //       return (Mob) entity;
   //     } else {
   //         entity = this.getFirstPassenger();
         //   if (entity instanceof Player) {
        //        return (Player) entity;
       //     }

        //    return null;
     //   }
 //   }

  //  @Override
   // protected void tickRidden(Player player, Vec3 p_275242_) {
      //  super.tickRidden(player, p_275242_);
      //  this.yRotO = this.getYRot();
      //  this.setYRot(player.getYRot());
      //  this.setXRot(player.getXRot());
     //   this.setRot(this.getYRot(), this.getXRot());
     //   this.yBodyRot = this.yRotO;
      //  this.yHeadRot = this.getYRot();
   // }

//}