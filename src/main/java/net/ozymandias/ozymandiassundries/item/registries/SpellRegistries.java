package net.ozymandias.ozymandiassundries.item.registries;

import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ozymandias.ozymandiassundries.OzymandiasSundries;
import net.ozymandias.ozymandiassundries.spells.ender.LevitateSpell;
import net.ozymandias.ozymandiassundries.spells.evocation.PerfectWarriorSpell;
import net.ozymandias.ozymandiassundries.spells.holy.DeathWard;
import net.ozymandias.ozymandiassundries.spells.holy.SolarRay;
import net.ozymandias.ozymandiassundries.spells.holy.SunBurstSpell;

import java.util.function.Supplier;

import static io.redspace.ironsspellbooks.api.registry.SpellRegistry.SPELL_REGISTRY_KEY;

public class SpellRegistries {
        public static final DeferredRegister<AbstractSpell> SPELLS = DeferredRegister.create(SPELL_REGISTRY_KEY, OzymandiasSundries.MOD_ID);

        public static Supplier<AbstractSpell> registerSpell(AbstractSpell spell) {
            return SPELLS.register(spell.getSpellName(), () -> spell);
        }


        public static final Supplier<AbstractSpell> LEVITATE = registerSpell(new LevitateSpell());

       // public static final Supplier<AbstractSpell> SOLAR_RAY = registerSpell(new SolarRay());

        //public static final Supplier<AbstractSpell> DEATH_WARD = registerSpell(new DeathWard());

        //public static final Supplier<AbstractSpell> SUNBURST = registerSpell(new SunBurstSpell());


   // public static final Supplier<AbstractSpell> CONJURE_SWORD = registerSpell(new ConjureSwordSpell());


    //  public static final Supplier<AbstractSpell> BUBBLE_BEAM = registerSpell(new BubbleBeamSpell());

       // public static final Supplier<AbstractSpell> SPARK = registerSpell(new SparkSpell());




    public static void register(IEventBus eventBus)
        {
            SPELLS.register(eventBus);
        }
    }
