package texture_layer_lib;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TextureLayerLib.MODID)
public class TextureLayerLib
{
    public static final String MODID = "texture_layer_lib";

    public static Logger logger = LogManager.getLogger(MODID);

    public TextureLayerLib()
    {

    }

    private void clientSetup(final FMLClientSetupEvent event)
    {

    }

    public void commonSetup(final FMLCommonSetupEvent event) {
    }
}
