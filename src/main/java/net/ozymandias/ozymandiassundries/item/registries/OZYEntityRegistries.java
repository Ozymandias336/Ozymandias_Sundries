package net.ozymandias.ozymandiassundries.item.registries;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import io.redspace.ironsspellbooks.entity.spells.fireball.MagicFireball;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;
import net.ozymandias.ozymandiassundries.entity.spells.solar_ray.SolarRay;


public class OZYEntityRegistries {
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, OzymandiasSundries.MOD_ID);

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
    public static final DeferredHolder<EntityType<?>, EntityType<SolarRay>> SOLAR_RAY =
            ENTITIES.register("solar_ray", () -> EntityType.Builder.<SolarRay>of(SolarRay::new, MobCategory.MISC)
                    .sized(1f, 1f)
                    .clientTrackingRange(64)
                    .build(ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "solar_ray").toString()));

    public static final DeferredHolder<EntityType<?>, EntityType<MagicFireball>> MAGIC_FIREBALL =
            ENTITIES.register("sunburst", () -> EntityType.Builder.<MagicFireball>of(MagicFireball::new, MobCategory.MISC)
                    .sized(1f, 1f)
                    .clientTrackingRange(4)
                    .build(ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "sunburst").toString()));

    //public static final DeferredHolder<EntityType<?>, EntityType<SummonedIronGolem>> SUMMONED_IRON_GOLEM =
     //       ENTITIES.register("summoned_iron_golem", () -> EntityType.Builder.<SummonedIronGolem>of(SummonedIronGolem::new, MobCategory.CREATURE)
              //      .sized(1.4F, 1.4F)
                //    .clientTrackingRange(64)
                //    .build(ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "summoned_iron_golem").toString()));

    //public static final DeferredHolder<EntityType<?>, EntityType<SparkProjectile>> SPARK_PROJECTILE =
           // ENTITIES.register("spark", () -> EntityType.Builder.<SparkProjectile>of(SparkProjectile::new, MobCategory.MISC)
             //       .sized(.5f, .5f)
                //    .clientTrackingRange(64)
                  //  .build(ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "spark").toString()));




}
