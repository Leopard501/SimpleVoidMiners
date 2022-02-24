package leopard501.simplevoidminers;

import leopard501.simplevoidminers.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = SimpleVoidMiners.MODID,
        name = SimpleVoidMiners.NAME,
        version = SimpleVoidMiners.VERSION
)
public class SimpleVoidMiners {
    public static final String MODID = "simplevoidminers";
    public static final String NAME = "Simple Void Miners";
    public static final String VERSION = "0.0.0";

    @SidedProxy(
            clientSide = "leopard501.simplevoidminers.proxy.ClientProxy",
            serverSide = "leopard501.simplevoidminers.proxy.ServerProxy"
    )
    public static CommonProxy proxy;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
//        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
