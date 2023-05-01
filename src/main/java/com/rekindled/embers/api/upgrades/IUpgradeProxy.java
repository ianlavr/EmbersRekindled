package com.rekindled.embers.api.upgrades;

import java.util.List;

import net.minecraft.core.Direction;

public interface IUpgradeProxy {
	void collectUpgrades(List<IUpgradeProvider> upgrades, int distanceLeft);
	boolean isSocket(Direction facing);
	boolean isProvider(Direction facing);
}
