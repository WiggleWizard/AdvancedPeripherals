package de.srendi.advancedperipherals.common.addons.powah;

import dan200.computercraft.api.lua.LuaFunction;
import de.srendi.advancedperipherals.lib.peripherals.APGenericPeripheral;
import net.minecraft.world.item.ItemStack;
import owmii.powah.block.furnator.FurnatorTile;

public class FurnatorIntegration implements APGenericPeripheral {

    @Override
    public String getPeripheralType() {
        return "furnator";
    }

    @LuaFunction(mainThread = true)
    public final boolean isBurning(FurnatorTile blockEntity) {
        return blockEntity.isBurning();
    }

    @LuaFunction(mainThread = true)
    public final double getEnergy(FurnatorTile blockEntity) {
        return blockEntity.getEnergy().getEnergyStored();
    }

    @LuaFunction(mainThread = true)
    public final double getMaxEnergy(FurnatorTile blockEntity) {
        return blockEntity.getEnergy().getMaxEnergyStored();
    }

    @LuaFunction(mainThread = true)
    public final double getCarbon(FurnatorTile blockEntity) {
        return blockEntity.getCarbon().perCent();
    }

    @LuaFunction(mainThread = true)
    public final ItemStack getInventory(FurnatorTile blockEntity) {
        return blockEntity.getInventory().getStackInSlot(1);
    }
}
