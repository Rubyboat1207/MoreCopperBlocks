package com.rubyboat.morecopper.material;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;

public class CopperMaterial implements ToolMaterial {
    float miningSpeed = 0;

    public static CopperMaterial INSTANCE = new CopperMaterial();

    public void setMiningSpeedMultiplier(float Speed)
    {
        miningSpeed = Speed;
    }
    @Override
    public int getDurability() {
        return 400;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return 3;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return -32;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.fromTag(new OxidizedCopperTag());
    }
}
