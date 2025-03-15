package umpaz.brewinandchewin.common.utility;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

import java.util.Objects;

public class BnCFluidIngredientTagged {

    private TagKey<Fluid> fluidTag;
    private int amount;

    public BnCFluidIngredientTagged(TagKey<Fluid> fluidTag, int amount) {
        this.fluidTag = fluidTag;
        this.amount = amount;
    }

    public TagKey<Fluid> getFluidTag() {
        return fluidTag;
    }

    public void setFluidTag(TagKey<Fluid> fluidTag) {
        this.fluidTag = fluidTag;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BnCFluidIngredientTagged that = (BnCFluidIngredientTagged) o;
        return amount == that.amount && Objects.equals(fluidTag, that.fluidTag);
    }

    @Override
    public int hashCode() {
        int code = 1;
        code = 31 * code + this.getFluidTag().hashCode();
        return code;
    }

    public boolean isFluidTagEqual(BnCFluidIngredientTagged other){
        return this.getFluidTag() == other.getFluidTag();
    }

    public boolean isBnCFluidIngredientIdentical(BnCFluidIngredientTagged other){
        return this.isFluidTagEqual(other) && this.amount == other.amount;
    }


}
