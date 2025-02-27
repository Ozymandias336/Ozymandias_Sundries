package net.ozymandias.ozymandiassundries.item.weapons;

import net.minecraft.world.item.Item;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class KeraunosRenderer<Keraunos extends Item & GeoAnimatable> extends GeoItemRenderer<Keraunos> {
    public KeraunosRenderer() {
        super((GeoModel<Keraunos>) new KeraunosModel());
    }
}
