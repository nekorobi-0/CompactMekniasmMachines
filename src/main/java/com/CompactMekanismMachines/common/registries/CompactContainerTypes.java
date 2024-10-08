package com.CompactMekanismMachines.common.registries;

import com.CompactMekanismMachines.common.CompactMekanismMachines;
import com.CompactMekanismMachines.common.tile.TileEntityCompactFissionReactor;
import com.CompactMekanismMachines.common.tile.TileEntityCompactIndustrialTurbine;
import mekanism.common.inventory.container.tile.MekanismTileContainer;
import mekanism.common.registration.impl.ContainerTypeDeferredRegister;
import mekanism.common.registration.impl.ContainerTypeRegistryObject;
import mekanism.generators.common.MekanismGenerators;
import mekanism.generators.common.registries.GeneratorsBlocks;
import mekanism.generators.common.registries.GeneratorsContainerTypes;
import com.CompactMekanismMachines.common.registries.CompactBlockTypes;
import mekanism.generators.common.tile.TileEntityGasGenerator;
import org.checkerframework.checker.units.qual.C;
import org.spongepowered.asm.mixin.Mixin;

public class CompactContainerTypes {
    private CompactContainerTypes(){

    }

    public static final ContainerTypeDeferredRegister CONTAINER_TYPES = new ContainerTypeDeferredRegister(CompactMekanismMachines.MODID);

    public static final ContainerTypeRegistryObject<MekanismTileContainer<TileEntityCompactFissionReactor>> COMPACT_FISSION_REACTOR = CONTAINER_TYPES.register(CompactBlocks.COMPACT_FISSION_REACTOR, TileEntityCompactFissionReactor.class);
    public static final ContainerTypeRegistryObject<MekanismTileContainer<TileEntityCompactIndustrialTurbine>> COMPACT_INDUSTRIAL_TURBINE = CONTAINER_TYPES.register(CompactBlocks.COMPACT_INDUSTRIAL_TURBINE, TileEntityCompactIndustrialTurbine.class);
}
