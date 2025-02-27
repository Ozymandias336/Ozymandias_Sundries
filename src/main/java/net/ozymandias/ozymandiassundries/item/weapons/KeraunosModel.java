package net.ozymandias.ozymandiassundries.item.weapons;

import net.minecraft.resources.ResourceLocation;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;

public class KeraunosModel extends GeoModel <Keraunos> {
    @Override
    public ResourceLocation getModelResource(Keraunos object) {
        return  ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "geo/keraunos.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Keraunos object) {
        return ResourceLocation.fromNamespaceAndPath(OzymandiasSundries.MOD_ID, "textures/item/keraunos.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Keraunos object) {
        return null;
    }
}
