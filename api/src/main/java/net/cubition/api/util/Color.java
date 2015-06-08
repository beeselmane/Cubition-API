package net.cubition.api.util;

/**
 * This class represents an immutable RGBA color<br>
 * Note: methods returning a 'byte' type return unsigned bytes.
 *
 * @author beeselmane
 * @version 0.3
 */
public class Color
{
    /**
     * The red Component of this Color
     */
    private byte red;

    /**
     * The green Component of this Color
     */
    private byte green;

    /**
     * The blue Component of this Color
     */
    private byte blue;

    /**
     * The alpha Component of this Color
     */
    private byte alpha;

    /**
     * Create a new Color with the given RGBA components<br>
     * Equivalent to {@link #Color(byte, byte, byte, byte)}
     *
     * @param red The red component of this Color (0 - 255)
     * @param green The green component of this Color (0 - 255)
     * @param blue The blue component of this Color (0 - 255)
     * @param alpha The alpha (transparency) value for this Color (0 - 255)
     * @return A new Color with the given RGBA components
     */
    public static Color colorWithRGBAComponents(byte red, byte green, byte blue, byte alpha) {
        return new Color(red, green, blue, alpha);
    }

    /**
     * Create a new Color with the given RGB components<br>
     * The alpha component of this Color will be set to 0xFF (full) by default<br>
     * Equivalent to {@link #Color(byte, byte, byte)}
     *
     * @param red The red component of this Color (0 - 255)
     * @param green The green component of this Color (0 - 255)
     * @param blue The blue component of this Color (0 - 255)
     * @return A new Color with the given RGB components
     */
    public static Color colorWithRGBComponents(byte red, byte green, byte blue) {
        return new Color(red, green, blue);
    }

    /**
     * Create a new Color with the provided RGBA values
     *
     * @param rgba The RGBA components for the new Color
     * @return A new Color with the provided RGBA values
     */
    public static Color colorWithRGBA(int rgba) {
        return new Color(rgba & 0x00FFFFFF, (byte)(rgba >> 24));
    }

    /**
     * Create a new Color with the provided RGB values<br>
     * The alpha component of this Color will be set to 0xFF (full) by default<br>
     * Equivalent to {@link #Color(int)}
     *
     * @param rgb The RGB components for the new Color
     * @return A new Color with the provided RGB values
     */
    public static Color colorWithRGB(int rgb) {
        return new Color(rgb);
    }

    /**
     * Construct a new Color using the provided RGBA color values
     *
     * @param red The red component of this Color (0 - 255)
     * @param green The green component of this Color (0 - 255)
     * @param blue The blue component of this Color (0 - 255)
     * @param alpha The alpha (transparency) value for this Color (0 - 255)
     */
    public Color(byte red, byte green, byte blue, byte alpha) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    /**
     * Construct a new Color using the provided RGB color values<br>
     * The alpha component of this Color will be set to 0xFF (full) by default
     *
     * @param red The red component of this Color (0 - 255)
     * @param green The green component of this Color (0 - 255)
     * @param blue The blue component of this Color (0 - 255)
     */
    public Color(byte red, byte green, byte blue) {
        this(red, green, blue, (byte)0xFF);
    }

    /**
     * Construct a Color using the provided RGB and alpha values<br>
     * See {@link Color#colorWithRGBA} to create a color with a single RGBA value
     *
     * @param rgb The RGB components for the new Color
     * @param alpha The alpha component of the new Color
     */
    public Color(int rgb, byte alpha) {
        this((byte)((rgb >> 16) & 0xFF), (byte)((rgb >> 8) & 0xFF), (byte)(rgb & 0xFF), alpha);
    }

    /**
     * Construct a Color using the provided RGB values<br>
     * The alpha component of this Color will be set to 0xFF (full) by default
     *
     * @param rgb The RGB components for the new Color
     */
    public Color(int rgb) {
        this(rgb, (byte)0xFF);
    }

    /**
     * Retrieve the red component of this Color
     * @return The red component of this Color
     */
    public byte getRed() {
        return this.red;
    }

    /**
     * Retrieve the green component of this Color
     * @return The green component of this Color
     */
    public byte getGreen() {
        return this.green;
    }

    /**
     * Retrieve the blue component of this Color
     * @return The blue component of this Color
     */
    public byte getBlue() {
        return this.blue;
    }

    /**
     * Retrieve the alpha component of this Color
     * @return The alpha component of this Color
     */
    public byte getAlpha() {
        return this.alpha;
    }

    /**
     * Create a single integer to represent the full RGBA representation for this Color
     * @return The RGBA representation of this Color
     */
    public int getRGBA() {
        return (this.alpha << 24) | this.getRGB();
    }

    /**
     * Create a single integer to represent the full RGB representation for this Color
     * @return The RGB representation of this Color
     */
    public int getRGB() {
        return (this.red << 16) | (this.green << 8) | this.blue;
    }

    /**
     * Create a new Color with the components of this Color and the provided red value
     *
     * @param newRed The red component for the new Color
     * @return A new Color with the provided red component
     */
    public Color setRed(byte newRed) {
        return new Color(newRed, this.green, this.blue, this.alpha);
    }

    /**
     * Create a new Color with the components of this Color and the provided green value
     *
     * @param newGreen The green component for the new Color
     * @return A new Color with the provided green component
     */
    public Color setGreen(byte newGreen) {
        return new Color(this.red, newGreen, this.blue, this.alpha);
    }

    /**
     * Create a new Color with the components of this Color and the provided blue value
     *
     * @param newBlue The blue component for the new Color
     * @return A new Color with the provided blue component
     */
    public Color setBlue(byte newBlue) {
        return new Color(this.red, this.green, newBlue, this.alpha);
    }

    /**
     * Create a new Color with the components of this Color and the provided alpha value
     *
     * @param newAlpha The alpha component for the new Color
     * @return A new Color with the provided alpha component
     */
    public Color setAlpha(byte newAlpha) {
        return new Color(this.red, this.green, this.blue, newAlpha);
    }
}
