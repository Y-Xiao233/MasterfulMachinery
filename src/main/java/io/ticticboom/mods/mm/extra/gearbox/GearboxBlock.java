package io.ticticboom.mods.mm.extra.gearbox;

import io.ticticboom.mods.mm.Ref;
import io.ticticboom.mods.mm.extra.ExtraBlockModel;
import io.ticticboom.mods.mm.extra.IExtraBlock;
import io.ticticboom.mods.mm.datagen.provider.MMBlockstateProvider;
import io.ticticboom.mods.mm.setup.RegistryGroupHolder;
import io.ticticboom.mods.mm.util.BlockUtils;
import net.minecraft.world.level.block.Block;

public class GearboxBlock extends Block implements IExtraBlock {

    private final ExtraBlockModel model;
    private final RegistryGroupHolder groupHolder;

    public GearboxBlock(ExtraBlockModel model, RegistryGroupHolder groupHolder) {
        super(BlockUtils.createBlockProperties());
        this.model = model;
        this.groupHolder = groupHolder;
    }

    @Override
    public void generateModel(MMBlockstateProvider provider) {
        var mdl = provider.dynamicBlock(groupHolder.getBlock().getId(), Ref.Textures.BASE_BLOCK, Ref.Textures.GEARBOX_OVERLAY);
        provider.simpleBlock(groupHolder.getBlock().get(), mdl);
    }

    @Override
    public ExtraBlockModel getModel() {
        return model;
    }
}
