package net.ozymandias.ozymandiassundries.item.registries;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

import static io.redspace.ironsspellbooks.registries.ArmorMaterialRegistry.schoolArmorMap;

public class ArmorMaterialRegistry {


    public static final Holder<ArmorMaterial> MITHRIL_MAGE = register("mithril_mage",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.BOOTS, 3);
            }), 9, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 0, () -> Items.IRON_INGOT);

    public static final Holder<ArmorMaterial> SCULK_ARMOR = register("sculk_armor",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.BOOTS, 3);
            }), 9, 0, SoundEvents.ARMOR_EQUIP_DIAMOND, 0, () -> Items.IRON_INGOT);

    public static final Holder<ArmorMaterial> MANA_CIRCLET = register("mana_circlet",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 3);
            }), 9, 0, SoundEvents.ARMOR_EQUIP_DIAMOND, 0, () -> Items.IRON_INGOT);

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, Holder<SoundEvent> equipSound,
                                                  float knockbackResistance,
                                                  Supplier<Item> ingredientItem) {ResourceLocation location =
            ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, name);
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound,
                        ingredient, layers, toughness, knockbackResistance));


    }
}



