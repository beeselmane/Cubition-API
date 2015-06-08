package net.cubition.apitest.util;

import static java.lang.System.out;

import net.cubition.apitest.TestCase;
import net.cubition.api.util.Color;

/**
 * Test Case for net.cubition.api.util.Color
 *
 * @author beeselmane
 * @version 0.3
 */
public class TestCaseColor implements TestCase
{
    private int rgba = 0x64F07814;
    private byte red = (byte)240;
    private byte green = (byte)120;
    private byte blue = (byte)20;
    private byte alpha = (byte)100;
    private Color color = null;

    public String getName() {
        return "net.cubition.api.util.Color";
    }

    public boolean run(boolean verbose) {
        return true;
    }
}
