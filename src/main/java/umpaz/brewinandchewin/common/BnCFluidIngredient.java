package umpaz.brewinandchewin.common;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Optional;

public class BnCFluidIngredient {
    private final Optional<TagKey<Fluid>> fluidTag;
    private final Optional<FluidStack> fluidIngredient ;
    private final int amount;

    public BnCFluidIngredient(TagKey<Fluid> fluidTag, int amount) {
        this.fluidTag = Optional.of(fluidTag);
        this.amount = amount;
        this.fluidIngredient = Optional.empty();
    }

    public BnCFluidIngredient( FluidStack fluidIngredient){
        this.fluidIngredient = Optional.ofNullable(fluidIngredient);
        this.fluidTag = Optional.empty();
        assert fluidIngredient != null;
        this.amount = fluidIngredient.getAmount();
    }

    public Optional<TagKey<Fluid>> getFluidTag() {
        return this.fluidTag;
    }

    public Optional<FluidStack> getFluidIngredient(){
        return this.fluidIngredient;
    }

    public int getAmount() {
        return amount;
    }

    //Returns Ta
    public String serialize() {
        if(fluidTag != null && fluidTag.isPresent()){
            return fluidTag.get().location().toString();
        }

        if (fluidIngredient != null && fluidIngredient.isPresent()){
            return ForgeRegistries.FLUIDS.getKey(fluidIngredient.get().getFluid()).toString();
        }

        return null;
    }
}
