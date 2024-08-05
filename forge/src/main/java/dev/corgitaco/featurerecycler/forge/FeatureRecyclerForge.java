package dev.corgitaco.featurerecycler.forge;

import dev.corgitaco.featurerecycler.FeatureRecycler;
import net.minecraftforge.fml.common.Mod;

/**
 * Main class for the mod on the Forge platform.
 */
@Mod(FeatureRecycler.MOD_ID)
public class FeatureRecyclerForge {
    public FeatureRecyclerForge() {
        FeatureRecycler.init();
    }
}
