package fr.kusuuo.oui;

import fr.kusuuo.oui.init.ModBlocks;
import fr.kusuuo.oui.init.ModFeatures;
import fr.kusuuo.oui.init.ModItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(oui.MODID)

public class oui
{
    public static final String MODID = "oui";

    public static final ItemGroup MODGROUP = new ItemGroup("oui") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.AMETHYSTE_ORE.get());
        }
    };

    public oui()
    {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItem.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);



    }

//effet de rendu
    private void setup(FMLCommonSetupEvent e)
    {
        ModFeatures features = new ModFeatures();
        features.init();
        MinecraftForge.EVENT_BUS.register(features);
    }
    private void clientSetup(FMLClientSetupEvent e)
    {

    }

}
