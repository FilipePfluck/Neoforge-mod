package net.pfluck.pastel_chalks.item;

import net.pfluck.pastel_chalks.PastelChalks;
import net.pfluck.pastel_chalks.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PastelChalks.MODID);

    public static final Supplier<CreativeModeTab> CHALKS_ITEMS_TAB =
            CREATIVE_MODE_TABS.register(
                    "chalks_item_tab",
                    () -> CreativeModeTab
                            .builder()
                            .title(Component.translatable("item_group.pastel_chalks.pastel_chalks"))
                            .icon(() -> new ItemStack(ModBlocks.CHALK.get()))
                            .displayItems((parameters, output) -> {
                                output.accept(ModBlocks.BLACK_CHALK);
                                output.accept(ModBlocks.BLUE_CHALK);
                                output.accept(ModBlocks.BROWN_CHALK);
                                output.accept(ModBlocks.CHALK);
                                output.accept(ModBlocks.CYAN_CHALK);
                                output.accept(ModBlocks.GRAY_CHALK);
                                output.accept(ModBlocks.GREEN_CHALK);
                                output.accept(ModBlocks.LIGHT_BLUE_CHALK);
                                output.accept(ModBlocks.LIGHT_GRAY_CHALK);
                                output.accept(ModBlocks.LIME_CHALK);
                                output.accept(ModBlocks.MAGENTA_CHALK);
                                output.accept(ModBlocks.ORANGE_CHALK);
                                output.accept(ModBlocks.PINK_CHALK);
                                output.accept(ModBlocks.PURPLE_CHALK);
                                output.accept(ModBlocks.RED_CHALK);
                                output.accept(ModBlocks.WHITE_CHALK);
                                output.accept(ModBlocks.YELLOW_CHALK);
                            })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
