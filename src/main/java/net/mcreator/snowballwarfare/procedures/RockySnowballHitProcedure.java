package net.mcreator.snowballwarfare.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.snowballwarfare.item.RockySnowBallItem;
import net.mcreator.snowballwarfare.SnowballWarfareModElements;
import net.mcreator.snowballwarfare.SnowballWarfareMod;

import java.util.Map;

@SnowballWarfareModElements.ModElement.Tag
public class RockySnowballHitProcedure extends SnowballWarfareModElements.ModElement {
	public RockySnowballHitProcedure(SnowballWarfareModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency x for procedure RockySnowballHit!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency y for procedure RockySnowballHit!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency z for procedure RockySnowballHit!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SnowballWarfareMod.LOGGER.warn("Failed to load dependency world for procedure RockySnowballHit!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() < 0.5)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RockySnowBallItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.SNOWBALL, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
