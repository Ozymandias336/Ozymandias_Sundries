package net.ozymandias.ozymandiassundries.item.registries;


import io.redspace.ironsspellbooks.api.item.weapons.ExtendedSwordItem;
import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import io.redspace.ironsspellbooks.compat.Curios;
import io.redspace.ironsspellbooks.item.SpellBook;
import io.redspace.ironsspellbooks.item.curios.CurioBaseItem;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import io.redspace.ironsspellbooks.item.weapons.ExtendedWeaponTier;
import io.redspace.ironsspellbooks.item.weapons.StaffItem;
import io.redspace.ironsspellbooks.registries.MobEffectRegistry;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.sounds.SoundEvents;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;

import net.ozymandias.ozymandiassundries.item.armor.*;

import net.ozymandias.ozymandiassundries.item.curios.EldritchEyeCurio;
import net.ozymandias.ozymandiassundries.item.curios.RingOfFeatherCurio;
import net.ozymandias.ozymandiassundries.item.weapons.OZYWeaponTiers;
import net.ozymandias.ozymandiassundries.item.weapons.StormCallerTridentItem;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Supplier;

public class ItemRegistries {
   public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OzymandiasSundries.MOD_ID);

   //weapons

    public static final DeferredHolder<Item, Item> ELDRITCH_GREATSWORD = ITEMS.register("eldritch_greatsword", () ->
            new MagicSwordItem(OZYWeaponTiers.ELDRITCH_GREATSWORD, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.ELDRITCH_GREATSWORD)),
                    SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.SCULK_TENTACLES_SPELL, 4))));

    public static final DeferredHolder<Item, Item> SACRIFICIAL_KRIS = ITEMS.register("sacrificial_kris", () ->
            new MagicSwordItem(OZYWeaponTiers.SACRIFICIAL_KRIS, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.SACRIFICIAL_KRIS)),
                    SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.SACRIFICE_SPELL, 5))));

    public static final DeferredHolder<Item, Item> SANCTIFIED_SWORD = ITEMS.register("sanctified_sword", () ->
            new MagicSwordItem(OZYWeaponTiers.SANCTIFIED_SWORD, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.SANCTIFIED_SWORD)),
                    SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.DIVINE_SMITE_SPELL, 5))));

    public static final DeferredHolder<Item, Item> CINDEROUS_SCIMITAR = ITEMS.register("cinderous_scimitar", () ->
            new MagicSwordItem(OZYWeaponTiers.CINDEROUS_SCIMITAR, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.CINDEROUS_SCIMITAR)),
                    SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.FLAMING_STRIKE_SPELL, 5))));

    public static final DeferredHolder<Item, Item> PERMAFROST_AXE = ITEMS.register("permafrost_axe", () ->
            new MagicSwordItem(OZYWeaponTiers.PERMAFROST_AXE, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.PERMAFROST_AXE)),
                    SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.RAY_OF_FROST_SPELL, 5))));

    public static final DeferredHolder<Item, Item> DRUID_SCYTHE = ITEMS.register("druid_scythe", () ->
            new MagicSwordItem(OZYWeaponTiers.DRUID_SCYTHE, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.DRUID_SCYTHE)),
                    SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.ROOT_SPELL, 10))));

    public static final DeferredHolder<Item, Item> ENDER_GLAIVE = ITEMS.register("ender_glaive", () ->
            new MagicSwordItem(OZYWeaponTiers.ENDER_GLAIVE, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.ENDER_GLAIVE)),
                    SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.DRAGON_BREATH_SPELL, 10))));

    public static final DeferredHolder<Item, Item> CREAKING_SWORD = ITEMS.register("creaking_sword", () ->
            new MagicSwordItem(OZYWeaponTiers.CREAKING_SWORD, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.CREAKING_SWORD)),
                    SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.OAKSKIN_SPELL, 8))));

    public static final DeferredHolder<Item, Item> LEVIN_SWORD = ITEMS.register("levin_sword", () ->
            new MagicSwordItem(OZYWeaponTiers.LEVIN_SWORD, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.LEVIN_SWORD)),
                    SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.CHAIN_LIGHTNING_SPELL, 10))));

    public static final DeferredHolder<Item, Item> SPECTRAL_GREATSWORD = ITEMS.register("spectral_greatsword", () ->
            new MagicSwordItem(OZYWeaponTiers.SPECTRAL_GREATSWORD, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.SPECTRAL_GREATSWORD)),
                    SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.SHIELD_SPELL, 10))));

public static final DeferredHolder<Item, Item> MITHRIL_SWORD = ITEMS.register("mithril_sword", () -> new ExtendedSwordItem(OZYWeaponTiers.MITHRIL_SWORD, ItemPropertiesHelper.equipment().attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.MITHRIL_SWORD))));


  //  public static final DeferredHolder<Item, Item> BLOOD_LORDS_BIDENT = ITEMS.register("blood_lords_bident", () ->
  //          new MagicSwordItem(OZYWeaponTiers.BLOOD_LORDS_BIDENT, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.BLOOD_LORDS_BIDENT)),
   //                 SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.RAISE_DEAD_SPELL, 8))));


    public static final DeferredHolder<Item, Item> STORMCALLER_TRIDENT = ITEMS.register("stormcaller_trident", StormCallerTridentItem::new);


   // public static final DeferredHolder<Item, Item> SPELLBLADE_STAFF = ITEMS.register("spellblade_staff", () ->
        //    new StaffItem(ItemPropertiesHelper.equipment(1).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.SPELLBLADE_STAFF))));

    //public static final DeferredHolder<Item, Item> FIRE_STAFF = ITEMS.register("fire_staff", () ->
     //       new StaffItem(ItemPropertiesHelper.equipment(1).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.FIRE_STAFF))));

    public static final DeferredHolder<Item, Item> KHAKKHARA = ITEMS.register("khakkhara", () ->
            new StaffItem(ItemPropertiesHelper.equipment(1).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.KHAKKHARA))));

  //  public static final DeferredHolder<Item, Item> KERAUNOS = ITEMS.register("keraunos", () ->
      //      new MagicSwordItem(OZYWeaponTiers.KERAUNOS, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.KERAUNOS)),
           //         SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.LIGHTNING_LANCE_SPELL, 10))));


 //spellbooks

    public static final DeferredHolder<Item, Item> FULMINOUS_FOLIO = ITEMS.register("fulminous_folio", () -> new SpellBook(10)
         .withSpellbookAttributes(new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .08,
                 AttributeModifier.Operation.ADD_MULTIPLIED_BASE), (new AttributeContainer(AttributeRegistry.LIGHTNING_SPELL_POWER, .08,
                         AttributeModifier.Operation.ADD_MULTIPLIED_BASE)),
                 new AttributeContainer(AttributeRegistry.MAX_MANA, 200, AttributeModifier.Operation.ADD_VALUE)));

    public static final DeferredHolder<Item, Item> LIBRAM_OF_FLESH = ITEMS.register("libram_of_flesh", () -> new SpellBook(10)
            .withSpellbookAttributes(new AttributeContainer(AttributeRegistry.SUMMON_DAMAGE, .08,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE), (new AttributeContainer(AttributeRegistry.BLOOD_SPELL_POWER, .08,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)),
                    new AttributeContainer(AttributeRegistry.MAX_MANA, 200, AttributeModifier.Operation.ADD_VALUE)));

    //Curios

    public static final Supplier<CurioBaseItem> NECROMANCERS_RING = ITEMS.register("necromancers_ring", () ->
            new CurioBaseItem(ItemPropertiesHelper.equipment(1)).withAttributes(Curios.RING_SLOT,
            new AttributeContainer(AttributeRegistry.SUMMON_DAMAGE, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
            new AttributeContainer(Attributes.MAX_HEALTH, -0.20, AttributeModifier.Operation.ADD_MULTIPLIED_BASE)));

    public static final Supplier<CurioBaseItem> MANA_AMULET = ITEMS.register("mana_amulet", () ->
            new CurioBaseItem(ItemPropertiesHelper.equipment(1)).withAttributes(Curios.NECKLACE_SLOT,
                    new AttributeContainer(AttributeRegistry.MAX_MANA, 100, AttributeModifier.Operation.ADD_VALUE)));

    public static final Supplier<CurioBaseItem> ELDRITCH_EYE = ITEMS.register("eldritch_eye", EldritchEyeCurio::new);


    public static final Supplier<CurioBaseItem> HEALTH_AMULET = ITEMS.register("health_amulet", () ->
            new CurioBaseItem(ItemPropertiesHelper.equipment(1)).withAttributes(Curios.NECKLACE_SLOT,
                    new AttributeContainer(Attributes.MAX_HEALTH, 10, AttributeModifier.Operation.ADD_VALUE)
            )

    );

    public static final Supplier<CurioBaseItem> MERMAID_AMULET = ITEMS.register("mermaid_amulet", () ->
            new CurioBaseItem(ItemPropertiesHelper.equipment(1)).withAttributes(Curios.NECKLACE_SLOT,
                    new AttributeContainer(Attributes.WATER_MOVEMENT_EFFICIENCY, 50, AttributeModifier.Operation.ADD_VALUE),
             new AttributeContainer(Attributes.OXYGEN_BONUS, 50, AttributeModifier.Operation.ADD_VALUE))
    );


    public static final DeferredItem<ArmorItem> MITHRIL_HELMET = ITEMS.register("mithril_helmet", () -> new MithrilMageArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(37))));
    public static final DeferredItem<ArmorItem> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate", () -> new MithrilMageArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(37))));
    public static final DeferredItem<ArmorItem> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings", () -> new MithrilMageArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(37))));
    public static final DeferredItem<ArmorItem> MITHRIL_BOOTS = ITEMS.register("mithril_boots", () -> new MithrilMageArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(37))));

    public static final DeferredItem<ArmorItem> SCULK_HELMET = ITEMS.register("sculk_helmet", () -> new SculkArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(37))));
    public static final DeferredItem<ArmorItem> SCULK_CHESTPLATE = ITEMS.register("sculk_chestplate", () -> new SculkArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(37))));
    public static final DeferredItem<ArmorItem> SCULK_LEGGINGS = ITEMS.register("sculk_leggings", () -> new SculkArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(37))));
    public static final DeferredItem<ArmorItem> SCULK_BOOTS = ITEMS.register("sculk_boots", () -> new SculkArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(37))));








    public static final Supplier<CurioBaseItem> RING_OF_FEATHER_FALLING = ITEMS.register("ring_of_feather_falling", RingOfFeatherCurio::new);












    //public static final Supplier<CurioBaseItem> ILLUSION_AMULET = ITEMS("illusion_amulet", builder -> builder




    //Armor



    // public static final DeferredHolder<Item, Item> NIMBUS_CORONET = ITEMS.register("nimbus_coronet", () -> new NimbusCoronetArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).rarity(Rarity.UNCOMMON).durability(ArmorItem.Type.HELMET.getDurability(26))));

   // public static final DeferredHolder<Item, Item> ANTLER_CROWN = ITEMS.register("antler_crown", () -> new AntlerCrownArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).rarity(Rarity.UNCOMMON).durability(ArmorItem.Type.HELMET.getDurability(26))));

   // public static final DeferredHolder<Item, Item> MANA_CIRCLET = ITEMS.register("mana_circlet", () -> new ManaCircletArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).rarity(Rarity.UNCOMMON).durability(ArmorItem.Type.HELMET.getDurability(26))));




    public static Collection<DeferredHolder<Item, ? extends Item>> getOZYItems()
    {
        return ITEMS.getEntries();
    }

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
}

}
