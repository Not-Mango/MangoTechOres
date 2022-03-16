package net.notmango.mangotechores.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.notmango.mangotechores.MangoTechOres;
import net.notmango.mangotechores.block.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MangoTechOres.MOD_ID);

    public static final RegistryObject<BlockEntityType<CompoundFurnaceBlockEntity>> COMPOUND_FURNACE =
            BLOCK_ENTITIES.register("compound_furnace", () ->
                    BlockEntityType.Builder.of(CompoundFurnaceBlockEntity::new,
                            ModBlocks.COMPOUND_FURNACE.get()).build(null));


    public static final RegistryObject<BlockEntityType<ObliteratorBlockEntity>> OBLITERATOR =
            BLOCK_ENTITIES.register("obliterator", () ->
                    BlockEntityType.Builder.of(ObliteratorBlockEntity::new,
                            ModBlocks.OBLITERATOR.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
