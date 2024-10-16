package dev.corgitaco.featurerecycler.neoforge;

import dev.corgitaco.featurerecycler.FeatureRecycler;
import net.neoforged.fml.common.Mod;

/**
 * Main class for the mod on the Forge platform.
 */
@Mod(FeatureRecycler.MOD_ID)
public class FeatureRecyclerNeoForge {
    public FeatureRecyclerNeoForge() {
        FeatureRecycler.init();
    }
}
