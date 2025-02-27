package net.ozymandias.ozymandiassundries.item.registries;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import io.redspace.ironsspellbooks.entity.spells.fireball.MagicFireball;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;
import net.ozymandias.ozymandiassundries.entity.spells.solar_ray.SolarRay;

import java.util.function.Supplier;


public class OZYEntityRegistries {
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, OzymandiasSundries.MOD_ID);


   // public static final Supplier<EntityType<StormCallerTridentProjectileEntity>> STORM_CALLER_TRIDENT =
   //         ENTITIES.register("stormcaller_trident", () -> EntityType.Builder.<StormCallerTridentProjectileEntity>of(StormCallerTridentProjectileEntity::new, MobCategory.MISC)
         //           .sized(0.5f, 1.15f).build("stormcaller_trident"));

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













}
