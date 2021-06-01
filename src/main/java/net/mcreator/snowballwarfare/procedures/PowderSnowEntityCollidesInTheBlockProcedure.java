package net.mcreator.snowballwarfare.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.block.Blocks;

import net.mcreator.snowballwarfare.SnowballWarfareModElements;
import net.mcreator.snowballwarfare.SnowballWarfareMod;

import java.util.Map;

@SnowballWarfareModElements.ModElement.Tag
public class PowderSnowEntityCollidesInTheBlockProcedure extends SnowballWarfareModElements.ModElement {
	public PowderSnowEntityCollidesInTheBlockProcedure(SnowballWarfareModElements instance) {
		super(instance, 18);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency x for procedure PowderSnowEntityCollidesInTheBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency y for procedure PowderSnowEntityCollidesInTheBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency z for procedure PowderSnowEntityCollidesInTheBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency world for procedure PowderSnowEntityCollidesInTheBlock!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.ITEM_SNOWBALL, x, y, z, (int) 10, 0.5, 0.5, 0.5, 1);
		}
	}
}
