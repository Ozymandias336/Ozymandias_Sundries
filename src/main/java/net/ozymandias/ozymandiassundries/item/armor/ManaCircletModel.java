package net.ozymandias.ozymandiassundries.item.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;
import software.bernie.geckolib.model.GeoModel;

public class ManaCircletModel extends GeoModel<ManaCircletArmorItem> {

    public ManaCircletModel() {
        super();

    }

    @Override
    public ResourceLocation getModelResource(ManaCircletArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "geo/mana_circlet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ManaCircletArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "textures/armor/mana_circlet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ManaCircletArmorItem animatable) {
        {
            return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
        }


    }
}