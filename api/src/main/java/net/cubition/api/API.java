package net.cubition.api;

/**
 * Class for Getting Information About the API<br>
 * Allows for the returning of API version, maker, model, homepage, etc.
 *
 * @author beeselmane
 * @version 0.3
 */
public class API
{
    /**
     * Returns the name for this API
     * @return The name of the Cubition API
     */
    public static String getName() {
        return API.class.getPackage().getSpecificationTitle();
    }

    /**
     * Returns the current version for this API
     * @return The current version of the Cubition API
     */
    public static String getVersion() {
        return API.class.getPackage().getSpecificationVersion();
    }

    /**
     * Returns the vendor for this API
     * @return The vendor of the Cubition API
     */
    public static String getVendor() {
        return API.class.getPackage().getSpecificationVendor();
    }

    /**
     * Returns the package name for this API
     * @return The package name of the Cubition API
     */
    public static String getPackageName() {
        return API.class.getPackage().getName();
    }

    /**
     * Reads the package for the name of the current program
     * @return The packaged name for the current program
     */
    public static String getProgramName() {
        return API.class.getPackage().getImplementationTitle();
    }

    /**
     * Reads the package for the version of the current program
     * @return The packaged version for the current program
     */
    public static String getProgramVersion() {
        return API.class.getPackage().getImplementationVersion();
    }

    /**
     * Reads the package for the vendor of the current program
     * @return The packaged vendor for the current program
     */
    public static String getProgramVendor() {
        return API.class.getPackage().getImplementationVendor();
    }

    /**
     * Instance Lock
     */
    private API() {}
}
