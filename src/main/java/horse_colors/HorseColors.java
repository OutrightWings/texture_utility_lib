package sekelsta.horse_colors;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import sekelsta.horse_colors.breed.BreedManager;
import sekelsta.horse_colors.client.HorseGui;
import sekelsta.horse_colors.config.HorseConfig;
import sekelsta.horse_colors.entity.ModEntities;
import sekelsta.horse_colors.item.ModItems;
import sekelsta.horse_colors.world.HorseReplacer;
import sekelsta.horse_colors.world.Spawns;

@Mod(HorseColors.MODID)
public class HorseColors
{
    public static final String MODID = "horse_colors";

    public static Logger logger = LogManager.getLogger(MODID);

    public HorseColors()
    {

    }

    private void clientSetup(final FMLClientSetupEvent event)
    {

    }

    public void commonSetup(final FMLCommonSetupEvent event) {
    }
}
