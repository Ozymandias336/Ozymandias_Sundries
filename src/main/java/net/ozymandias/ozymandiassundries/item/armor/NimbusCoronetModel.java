package net.ozymandias.ozymandiassundries.item.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import io.redspace.ironsspellbooks.item.armor.TarnishedCrownArmorItem;
import net.minecraft.resources.ResourceLocation;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;
import software.bernie.geckolib.model.GeoModel;

public class NimbusCoronetModel extends GeoModel<NimbusCoronetArmorItem> {

    public NimbusCoronetModel() {
        super();

    }

    @Override
    public ResourceLocation getModelResource(NimbusCoronetArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "geo/nimbus_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NimbusCoronetArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "textures/armor/nimbus.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NimbusCoronetArmorItem animatable) {
        {
            return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
        }


    }
}