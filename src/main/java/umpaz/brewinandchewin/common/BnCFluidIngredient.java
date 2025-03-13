package umpaz.brewinandchewin.common;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class BnCFluidIngredient {
    private final TagKey<Fluid> fluidTag;
    private final FluidStack fluidIngredient ;
    private final int amount;

    public BnCFluidIngredient(TagKey<Fluid> fluidTag, int amount) {
        this.fluidTag = fluidTag;
        this.amount = amount;
        this.fluidIngredient = null;
    }

    public BnCFluidIngredient( FluidStack fluidIngredient){
        this.fluidIngredient = fluidIngredient;
        this.fluidTag = null;
        this.amount = fluidIngredient.getAmount();
    }

    public TagKey<Fluid> getFluidTag() {
        return this.fluidTag;
    }

    public FluidStack getFluidIngredient(){
        return this.fluidIngredient;
    }

    public int getAmount() {
        return amount;
    }
}
