package net.ozymandias.ozymandiassundries.item.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;
import software.bernie.geckolib.model.GeoModel;

public class AntlerCrownModel extends GeoModel<AntlerCrownArmorItem> {

    public AntlerCrownModel() {
        super();

    }

    @Override
    public ResourceLocation getModelResource(AntlerCrownArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "geo/antler_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AntlerCrownArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "textures/armor/antler_crown.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AntlerCrownArmorItem animatable) {
        {
            return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
        }


    }
}