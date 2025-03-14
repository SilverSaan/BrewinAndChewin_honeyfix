package umpaz.brewinandchewin.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import umpaz.brewinandchewin.BrewinAndChewin;
import umpaz.brewinandchewin.common.registry.BnCFluids;
import umpaz.brewinandchewin.common.tag.BnCCompatTags;
import umpaz.brewinandchewin.common.tag.BnCTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class BnCFluidTags extends FluidTagsProvider {
    public BnCFluidTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, BrewinAndChewin.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //
        tag(BnCCompatTags.FORGE_HONEY)
                .add(BnCFluids.HONEY_FLUID.get());
    }
}
