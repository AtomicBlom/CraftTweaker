package minetweaker.mods.jei;

import mezz.jei.api.*;
import mezz.jei.api.ingredients.*;
import mezz.jei.api.recipe.*;
import minetweaker.MineTweakerAPI;
import minetweaker.api.compat.DummyJEIRecipeRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.List;


@mezz.jei.api.JEIPlugin
public class JEIAddonPlugin implements IModPlugin {
	
	public static IJeiHelpers jeiHelpers;
	public static IIngredientRegistry itemRegistry;
	public static IRecipeRegistry recipeRegistry;
	
	
	@Override
	public void registerItemSubtypes(ISubtypeRegistry subtypeRegistry) {
		
	}
	
	@Override
	public void registerIngredients(IModIngredientRegistration registry) {
		
	}
	
	@Override
	public void register(IModRegistry registry) {
		jeiHelpers = registry.getJeiHelpers();
		itemRegistry = registry.getIngredientRegistry();
	}
	
	@Override
	public void onRuntimeAvailable(IJeiRuntime iJeiRuntime) {
		recipeRegistry = iJeiRuntime.getRecipeRegistry();
		if(MineTweakerAPI.getIjeiRecipeRegistry() instanceof DummyJEIRecipeRegistry) {
			MineTweakerAPI.setIjeiRecipeRegistry(new JEIRecipeRegistry(recipeRegistry));
		}
	}
	
	
}
