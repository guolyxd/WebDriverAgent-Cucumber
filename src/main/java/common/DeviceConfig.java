package common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by twe on 03/03/2017.
 */
public class DeviceConfig {
    public static Map<String, String> deviceUrl = new HashMap<String, String>() {
        {
            put("7p", "http://localhost:8100/session");
//            put("6sp", "http://localhost:8100/session");
        }
    };
    public static String appPath = "/Users/twe/Documents/app/RESI-Internal.app";

    public static String commandPath = "/usr/local/bin/fbsimctl";

    public static String bundleId = "com.rea-group.reapa.internal";

    public static Map<String, String> deviceInfo = new HashMap<String, String>() {
        {
            put("7p", "24B252BC-6FB6-4A30-8E67-62B6DDDF9FD2");
//            put("6sp", "51C14A74-5014-4EDA-A64D-2541C14FB164");
        }
    };
}
