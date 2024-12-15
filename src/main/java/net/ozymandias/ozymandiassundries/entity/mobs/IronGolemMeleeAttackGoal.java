package net.ozymandias.ozymandiassundries.entity.mobs;

import net.minecraft.world.entity.ai.goal.Goal;

public class IronGolemMeleeAttackGoal extends Goal {
    @Override
    public boolean canUse() {
        return false;
    }
}
