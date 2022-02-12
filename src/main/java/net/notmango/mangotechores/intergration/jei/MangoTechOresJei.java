package net.notmango.mangotechores.intergration.jei;

import mezz.jei.api.IModPlugin;
import net.minecraft.resources.ResourceLocation;
import net.notmango.mangotechores.MangoTechOres;

public class MangoTechOresJei implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(MangoTechOres.MOD_ID, "jei_plugin");
    }
}
