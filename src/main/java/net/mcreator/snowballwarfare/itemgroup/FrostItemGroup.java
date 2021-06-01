
package net.mcreator.snowballwarfare.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.snowballwarfare.item.ExplosiveSnowballItem;
import net.mcreator.snowballwarfare.SnowballWarfareModElements;

@SnowballWarfareModElements.ModElement.Tag
public class FrostItemGroup extends SnowballWarfareModElements.ModElement {
	public FrostItemGroup(SnowballWarfareModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfrost") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ExplosiveSnowballItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
