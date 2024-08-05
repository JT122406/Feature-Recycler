package dev.corgitaco.featurerecycler.fabric;

import dev.corgitaco.featurerecycler.FeatureRecycler;
import net.fabricmc.api.ModInitializer;

/**
 * This class is the entrypoint for the mod on the Fabric platform.
 */
public class FeatureRecyclerFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        FeatureRecycler.init();
    }
}
