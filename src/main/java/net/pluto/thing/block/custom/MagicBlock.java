package net.pluto.thing.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.pluto.thing.item.ModItems;

public class MagicBlock extends Block {

    public MagicBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
        pLevel.playSound(pPlayer, pPos, SoundEvents.AMETHYST_CLUSTER_PLACE, SoundSource.BLOCKS, 1f, 1f);
        return InteractionResult.SUCCESS;
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if (pEntity instanceof ItemEntity itemEntity){
            if (itemEntity.getItem().getItem() == ModItems.RAW_ENDERITE.get()){
                itemEntity.setItem(new ItemStack(ModItems.ENDERITE.get(), itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == ModItems.RAW_ASMITE.get()){
                itemEntity.setItem(new ItemStack(ModItems.ASMITE.get(), itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == ModItems.RAW_BARITE.get()){
                itemEntity.setItem(new ItemStack(ModItems.BARITE.get(), itemEntity.getItem().getCount()));
            }
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
