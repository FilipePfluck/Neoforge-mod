package net.pfluck.pastel_chalks.block;

import net.pfluck.pastel_chalks.PastelChalks;
import net.pfluck.pastel_chalks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(PastelChalks.MODID);

    public static final DeferredBlock<Block> BLACK_CHALK = registerBlock("black_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> BLUE_CHALK = registerBlock("blue_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> BROWN_CHALK = registerBlock("brown_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> CHALK = registerBlock("chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> CYAN_CHALK = registerBlock("cyan_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> GRAY_CHALK = registerBlock("gray_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> GREEN_CHALK = registerBlock("green_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> LIGHT_BLUE_CHALK = registerBlock("light_blue_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> LIGHT_GRAY_CHALK = registerBlock("light_gray_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> LIME_CHALK = registerBlock("lime_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> MAGENTA_CHALK = registerBlock("magenta_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> ORANGE_CHALK = registerBlock("orange_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> PINK_CHALK = registerBlock("pink_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> PURPLE_CHALK = registerBlock("purple_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> RED_CHALK = registerBlock("red_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> WHITE_CHALK = registerBlock("white_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> YELLOW_CHALK = registerBlock("yellow_chalk",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block ) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
