package net.ozymandias.ozymandiassundries.entity.spells.spark;

import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import io.redspace.ironsspellbooks.api.util.Utils;
import io.redspace.ironsspellbooks.capabilities.magic.MagicManager;
import io.redspace.ironsspellbooks.damage.DamageSources;
import io.redspace.ironsspellbooks.entity.spells.AbstractMagicProjectile;
import io.redspace.ironsspellbooks.entity.spells.magic_missile.MagicMissileProjectile;
import io.redspace.ironsspellbooks.registries.EntityRegistry;
import io.redspace.ironsspellbooks.util.ParticleHelper;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

import java.util.Optional;

//public class SparkProjectile extends AbstractMagicProjectile {
//public SparkProjectile(EntityType<SparkProjectile> entityType, Level level) {
    //    super(entityType, level);
//this.setNoGravity(true);
   // }

//    public SparkProjectile(EntityType<? extends SparkProjectile> entityType, Level levelIn, LivingEntity shooter) {
  //      this(entityType, levelIn);
 //       setOwner(shooter);
  //  }

//public SparkProjectile(Level levelIn, LivingEntity shooter) {
 //       this(EntityRegistry.SPARK_PROJECTILE.get(), levelIn, shooter);
  //  }

  //  public SparkProjectile(EntityType<SparkProjectile> sparkProjectileEntityType, Level level) {
  //  }

//@Override
  //  public void impactParticles(double x, double y, double z) {
//Level level = null;
   //     MagicManager.spawnParticles(level, ParticleHelper.UNSTABLE_ENDER, x, y, z, 25, 0, 0, 0, .18, true);
 //   }

 //   @Override
  //  public float getSpeed() {
   //     return 2.5f;
   // }

//@Override
   // public Optional<Holder<SoundEvent>> getImpactSound() {
   //     return Optional.empty();
   // }


   // @Override
  //  protected void onHitBlock(BlockHitResult blockHitResult) {
//super.onHitBlock(blockHitResult);
        //irons_spellbooks.LOGGER.debug("MagicMissileProjectile.onHitBlock");
     //   discard();


 //   }

  //  @Override
   // protected void onHitEntity(EntityHitResult entityHitResult) {
     //   super.onHitEntity(entityHitResult);
    //    //irons_spellbooks.LOGGER.debug("MagicMissileProjectile.onHitEntity");

//DamageSources.applyDamage(entityHitResult.getEntity(), damage, SpellRegistry.MAGIC_MISSILE_SPELL.get().getDamageSource(this, getOwner()));
//discard();

   // }

   // @Override
   // public void trailParticles() {
     //   for (int i = 0; i < 2; i++) {
     //       double speed = .02;
       //     double dx = Utils.random.nextDouble() * 2 * speed - speed;
      //      double dy = Utils.random.nextDouble() * 2 * speed - speed;
       //     double dz = Utils.random.nextDouble() * 2 * speed - speed;
        //    LevelRenderer level = null;
//level.addParticle(ParticleHelper.UNSTABLE_ENDER, this.getX() + dx, this.getY() + dy, this.getZ() + dz, dx, dy, dz);
           // if (tickCount > 1)
//level.addParticle(ParticleHelper.UNSTABLE_ENDER, this.getX() + dx - getDeltaMovement().x / 2, this.getY() + dy - getDeltaMovement().y / 2, this.getZ() + dz - getDeltaMovement().z / 2, dx, dy, dz);

       // }
  //  }
//}
