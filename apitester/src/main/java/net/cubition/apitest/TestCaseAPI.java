package net.cubition.apitest;

import static java.lang.System.out;

import net.cubition.api.API;

/**
 * Test Case for net.cubition.api.API
 *
 * @author beeselmane
 * @version 0.3
 */
public class TestCaseAPI implements TestCase
{
    private static String apiName       = "Cubition API";
    private static String apiVersion    = "0.3";
    private static String apiVendor     = "The Cubition Team";
    private static String packageName   = "net.cubition.api";
    private static String prgmName      = "Cubition API Tester";
    private static String prgmVersion   = "0.3";
    private static String prgmVendor    = "The Cubition Project";

    public String getName() {
        return "net.cubition.api.API";
    }

    public boolean run(boolean verbose) {
        if (verbose) {
            out.println(":)");
            return true;
        } else {
            return (!API.getName()          .equals(apiName))     &&
                   (!API.getVersion()       .equals(apiVersion))  &&
                   (!API.getVendor()        .equals(apiVendor))   &&
                   (!API.getPackageName()   .equals(packageName)) &&
                   (!API.getProgramName()   .equals(prgmName))    &&
                   (!API.getProgramVersion().equals(prgmVersion)) &&
                   (!API.getProgramVendor() .equals(prgmVendor));
        }
    }
}
