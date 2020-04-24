package net.mcreator.sixheadeddragon.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.sixheadeddragon.SixHeadedDragonElements;

@SixHeadedDragonElements.ModElement.Tag
public class SixHeadedDragonPlayerCollidesWithThisEntityProcedure extends SixHeadedDragonElements.ModElement {
	public SixHeadedDragonPlayerCollidesWithThisEntityProcedure(SixHeadedDragonElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SixHeadedDragonPlayerCollidesWithThisEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.LIGHTNING_BOLT, (float) 4);
	}
}
