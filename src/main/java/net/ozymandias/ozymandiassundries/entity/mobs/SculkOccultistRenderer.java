package net.ozymandias.ozymandiassundries.entity.mobs;

import io.redspace.ironsspellbooks.entity.mobs.abstract_spell_casting_mob.AbstractSpellCastingMobRenderer;
import io.redspace.ironsspellbooks.entity.mobs.wizards.cultist.CultistModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SculkOccultistRenderer extends AbstractSpellCastingMobRenderer {

    public SculkOccultistRenderer(EntityRendererProvider.Context context) {
        super(context, new CultistModel());
    }

}
