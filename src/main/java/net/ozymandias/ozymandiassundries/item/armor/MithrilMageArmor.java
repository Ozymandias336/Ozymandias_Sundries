package net.ozymandias.ozymandiassundries.item.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class MithrilMageArmor extends DefaultedItemGeoModel<MithrilMageArmorItem> {

    public MithrilMageArmor() {
        super(ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(MithrilMageArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "geo/mithril_mage.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MithrilMageArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "textures/armor/spellblade_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MithrilMageArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}