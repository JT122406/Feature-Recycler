package dev.corgitaco.featurerecycler.mixin;

import dev.corgitaco.featurerecycler.FeatureRecycler;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.FeatureSorter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;
import java.util.function.Function;

@Mixin(value = FeatureSorter.class, priority = 1)
public class FeatureSorterMixin {


    @Inject(method = "buildFeaturesPerStep", at = @At("HEAD"), cancellable = true)
    private static <T extends Holder<Biome>> void handleSorting(List<T> biomes, Function<T, List<HolderSet<PlacedFeature>>> toFeatureSetFunction, boolean notRecursiveFlag, CallbackInfoReturnable<List<FeatureSorter.StepFeatureData>> cir) {
        cir.setReturnValue(FeatureRecycler.recycle(biomes, toFeatureSetFunction));
    }
}
