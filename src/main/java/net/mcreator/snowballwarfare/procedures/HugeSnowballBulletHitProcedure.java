package net.mcreator.snowballwarfare.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.snowballwarfare.SnowballWarfareModElements;
import net.mcreator.snowballwarfare.SnowballWarfareMod;

import java.util.Map;

@SnowballWarfareModElements.ModElement.Tag
public class HugeSnowballBulletHitProcedure extends SnowballWarfareModElements.ModElement {
	public HugeSnowballBulletHitProcedure(SnowballWarfareModElements instance) {
		super(instance, 11);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency x for procedure HugeSnowballBulletHit!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency y for procedure HugeSnowballBulletHit!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency z for procedure HugeSnowballBulletHit!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency world for procedure HugeSnowballBulletHit!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), Blocks.SNOW_BLOCK.getDefaultState(), 3);
	}
}
