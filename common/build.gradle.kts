architectury {
    common("forge", "fabric", "neoforge")
    platformSetupLoomIde()
}

sourceSets.main.get().resources.srcDir("src/main/generated/resources")

dependencies {
    modImplementation("net.fabricmc:fabric-loader:${project.properties["fabric_loader_version"]}")
}
