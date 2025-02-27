package net.ozymandias.ozymandiassundries.item.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;
import software.bernie.geckolib.model.DefaultedItemGeoModel;


public class SculkArmor extends DefaultedItemGeoModel<SculkArmorItem> {

    public SculkArmor() {
        super(ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(SculkArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "geo/sculk_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SculkArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "textures/armor/sculk_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SculkArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}