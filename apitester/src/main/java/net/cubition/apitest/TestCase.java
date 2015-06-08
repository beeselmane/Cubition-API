package net.cubition.apitest;

/**
 * An interface to represent an API test case
 *
 * @author beeselmane
 * @version 0.3
 */
public interface TestCase
{
    /**
     * Get the name for this test case
     * @return The name of this test case
     */
    String getName();

    /**
     * Run this test case
     *
     * @param verbose Weather or not to print debugging information
     * @return Weather or not the test was passed
     */
    boolean run(boolean verbose);
}
