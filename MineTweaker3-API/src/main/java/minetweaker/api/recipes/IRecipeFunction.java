/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minetweaker.api.recipes;

import minetweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.ZenClass;

import java.util.Map;

/**
 *
 * @author Stan
 */
@ZenClass("minetweaker.recipes.IRecipeFunction")
public interface IRecipeFunction {
	IItemStack process(IItemStack output, Map<String, IItemStack> inputs, ICraftingInfo craftingInfo);
}
