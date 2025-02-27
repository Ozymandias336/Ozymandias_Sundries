package net.ozymandias.ozymandiassundries.item.weapons;


import io.redspace.ironsspellbooks.api.item.weapons.ExtendedSwordItem;
import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class StormCallerTridentItem extends MagicSwordItem {
    public StormCallerTridentItem() {
        super(
                OZYWeaponTiers.STORMCALLER_TRIDENT,
                ItemPropertiesHelper.equipment().fireResistant().rarity(Rarity.EPIC).attributes(ExtendedSwordItem.createAttributes(OZYWeaponTiers.STORMCALLER_TRIDENT)
                ),
                SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.THUNDERSTORM_SPELL, 8)
        ));
    }






}