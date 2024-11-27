package net.ozymandias.ozymandiassundries.item.registries;

import io.redspace.ironsspellbooks.api.item.weapons.ExtendedSwordItem;
import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import io.redspace.ironsspellbooks.item.SpellBook;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;

import net.ozymandias.ozymandiassundries.item.spellbooks.FulminousFolioSpellBook;
import net.ozymandias.ozymandiassundries.item.weapons.OZYWeaponTiers;

import java.util.Collection;

public class ItemRegistries {
   public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OzymandiasSundries.MOD_ID);


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
            new MagicSwordItem(OZYWeaponTiers.CINDEROUS_SCIMITAR, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.SANCTIFIED_SWORD)),
                    SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.FLAMING_STRIKE_SPELL, 5))));

    public static final DeferredHolder<Item, Item> PERMAFROST_AXE = ITEMS.register("permafrost_axe", () ->
            new MagicSwordItem(OZYWeaponTiers.PERMAFROST_AXE, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.PERMAFROST_AXE)),
                    SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.RAY_OF_FROST_SPELL, 5))));

    public static final DeferredHolder<Item, Item> DRUID_SCYTHE = ITEMS.register("druid_scythe", () ->
            new MagicSwordItem(OZYWeaponTiers.DRUID_SCYTHE, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.DRUID_SCYTHE)),
                    SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.ROOT_SPELL, 10))));

    public static final DeferredHolder<Item, Item> FULMINOUS_FOLIO = ITEMS.register("fulminous_folio", () ->
            new SpellBook(10));

    //public static final DeferredHolder<Item, Item> FULMINOUS_FOLIO = ITEMS.register("fulminous_folio", FulminousFolioSpellBook::new);

   //public static final DeferredHolder<Item, Item> FULMINOUS_FOLIO = ITEMS.register("fulminous_folio", () ->
          // new SpellBook(10).withSpellbookAttributes(
                 //  new AttributeContainer(AttributeRegistry.LIGHTNING_SPELL_POWER, .8F, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                 //  new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .8F, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                  // new AttributeContainer(AttributeRegistry.MAX_MANA, 200, AttributeModifier.Operation.ADD_VALUE)));

    public static Collection<DeferredHolder<Item, ? extends Item>> getOZYItems()
    {
        return ITEMS.getEntries();
    }

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
