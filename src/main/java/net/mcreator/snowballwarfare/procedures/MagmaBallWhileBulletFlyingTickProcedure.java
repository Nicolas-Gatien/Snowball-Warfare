package net.mcreator.snowballwarfare.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;

import net.mcreator.snowballwarfare.SnowballWarfareModElements;
import net.mcreator.snowballwarfare.SnowballWarfareMod;

import java.util.Map;

@SnowballWarfareModElements.ModElement.Tag
public class MagmaBallWhileBulletFlyingTickProcedure extends SnowballWarfareModElements.ModElement {
	public MagmaBallWhileBulletFlyingTickProcedure(SnowballWarfareModElements instance) {
		super(instance, 16);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency x for procedure MagmaBallWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency y for procedure MagmaBallWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency z for procedure MagmaBallWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency world for procedure MagmaBallWhileBulletFlyingTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, x, y, z, (int) 2, 0, 0, 0, 0.1);
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.SMOKE, x, y, z, (int) 5, 0, 0, 0, 0.1);
		}
	}
}
