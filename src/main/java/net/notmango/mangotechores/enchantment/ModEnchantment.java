package net.notmango.mangotechores.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.notmango.mangotechores.MangoTechOres;

public class ModEnchantment {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS
            = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MangoTechOres.MOD_ID);

    public static RegistryObject<Enchantment> WRATH_OF_ZEUS =
            ENCHANTMENTS.register("wrath_of_zeus",
                    () -> new WrathOfZeusEnchantment(Enchantment.Rarity.RARE,
                            EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
