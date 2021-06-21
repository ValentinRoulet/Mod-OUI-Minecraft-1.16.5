package fr.kusuuo.oui.init;

import fr.kusuuo.oui.oui;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.data.TexturedModel;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks
{

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, oui.MODID);

    public static final RegistryObject<Block> AMETHYSTE_BLOCK = createBlock("amethyste_block",() -> new Block(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(3).sound(SoundType.METAL).speedFactor(1.3F).strength(10.0F)));
    public static final RegistryObject<Block> AMETHYSTE_ORE = createBlock("amethyste_ore",()-> new Block(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().harvestLevel(3).harvestTool(ToolType.PICKAXE).dynamicShape().sound(SoundType.STONE).strength(2.0F)));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItem.ITEMS.register(name, ()  -> new BlockItem(block.get(), new Item.Properties().tab(oui.MODGROUP)));
        return block;
    }

}
