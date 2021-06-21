package fr.kusuuo.oui.init;

import fr.kusuuo.oui.oui;
import fr.kusuuo.oui.utils.AmethysteArmor;
import fr.kusuuo.oui.utils.CustomeItemTiers;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItem
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, oui.MODID);


    public static final RegistryObject<Item> AMETHYSTE_INGOT = ITEMS.register("amethyste_ingot", () -> new Item( new Item.Properties().tab(oui.MODGROUP)));


    public static final  RegistryObject<Item> AMETHYSTE_SWORD = ITEMS.register("amethyste_sword", () -> new SwordItem(CustomeItemTiers.AMETHYSTE,3,-2.4F, new Item.Properties().stacksTo(1).tab(oui.MODGROUP) ));
    public static final  RegistryObject<Item> AMETHYSTE_PICKAXE = ITEMS.register("amethyste_pickaxe", () -> new PickaxeItem(CustomeItemTiers.AMETHYSTE,1,-2.8F, new Item.Properties().stacksTo(1).tab(oui.MODGROUP) ));
    public static final  RegistryObject<Item> AMETHYSTE_AXE = ITEMS.register("amethyste_axe", () -> new AxeItem(CustomeItemTiers.AMETHYSTE,5,-3.0F, new Item.Properties().stacksTo(1).tab(oui.MODGROUP) ));
    public static final  RegistryObject<Item> AMETHYSTE_SHOVEL = ITEMS.register("amethyste_shovel", () -> new ShovelItem(CustomeItemTiers.AMETHYSTE,0,-2.4F, new Item.Properties().stacksTo(1).tab(oui.MODGROUP) ));
    public static final  RegistryObject<Item> AMETHYSTE_HOE = ITEMS.register("amethyste_hoe", () -> new HoeItem(CustomeItemTiers.AMETHYSTE,-4,0.0F, new Item.Properties().stacksTo(1).tab(oui.MODGROUP) ));


    public static final RegistryObject<Item> AMETHYSTE_HELMET = ITEMS.register("amethyste_helmet", () -> new ArmorItem(AmethysteArmor.AMETHYSTE_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(oui.MODGROUP).fireResistant()));
    public static final RegistryObject<Item> AMETHYSTE_CHESTPLATE = ITEMS.register("amethyste_chestplate", () -> new ArmorItem(AmethysteArmor.AMETHYSTE_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(oui.MODGROUP).fireResistant()));
    public static final RegistryObject<Item> AMETHYSTE_LEGGINGS = ITEMS.register("amethyste_leggings", () -> new ArmorItem(AmethysteArmor.AMETHYSTE_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(oui.MODGROUP).fireResistant()));
    public static final RegistryObject<Item> AMETHYSTE_BOOTS = ITEMS.register("amethyste_boots", () -> new ArmorItem(AmethysteArmor.AMETHYSTE_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(oui.MODGROUP).fireResistant()));

    public static final  RegistryObject<Item> AMETHYSTE_BOW = ITEMS.register("amethyste_bow", () -> new BowItem(new Item.Properties().tab(oui.MODGROUP).stacksTo(1)));

}
