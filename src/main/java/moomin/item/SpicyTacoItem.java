
package moomin.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import moomin.itemgroup.MoominModItemGroup;

import moomin.MoominModElements;

@MoominModElements.ModElement.Tag
public class SpicyTacoItem extends MoominModElements.ModElement {
	@ObjectHolder("moomin:spicy_taco")
	public static final Item block = null;
	public SpicyTacoItem(MoominModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MoominModItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(5).saturation(0.3f).build()));
			setRegistryName("spicy_taco");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
