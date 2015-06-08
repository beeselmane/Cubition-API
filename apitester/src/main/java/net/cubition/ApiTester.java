package net.cubition;

import net.cubition.apitest.TestCase;
import net.cubition.api.API;

import net.cubition.apitest.util.*;
import net.cubition.apitest.*;

/**
 * Test Class for the Cubition API
 *
 * @author beeselmane
 * @version 0.3
 */
public class ApiTester
{
    private static boolean verbose = false;

    private static final TestCase testCases[] = {
        new TestCaseAPI(),
        new TestCaseColor()
    };

    private static void printRunInfo() {
        System.out.format("Testing %s version %s (from %s)...\n", API.getName(), API.getVersion(), API.getVendor());
        System.out.format("Packaged Name: %s\n\n", API.getPackageName());

        System.out.format("Running in program named %s version %s from %s.\n",
            API.getProgramName(), API.getProgramVersion(), API.getProgramVendor());
    }

    private static void runTestCases() {
        System.out.format("Running %d Test Cases%s...\n", ApiTester.testCases.length, (verbose ? " [VERBOSE]" : ""));
        int total = ApiTester.testCases.length;
        int passed = 0;

        for (TestCase testCase : ApiTester.testCases) {
            System.out.format("Running Test Case for %s...%s", testCase.getName(), (verbose ? "\n" : ""));

            if (testCase.run(verbose)) {
                System.out.format("%s[PASS]\n", (verbose ? "" : " "));
                passed++;
            } else {
                System.out.format("%s[FAIL]\n", (verbose ? "" : " "));
            }
        }

        System.out.format("Passed %d out of %d Test Cases. (%f%%)\n",
            passed, total, (((float)passed / (float)total) * 100.0F));
    }

    public static void main(String ...args)
    {
        if (args.length == 1 && args[0].equalsIgnoreCase("--verbose"))
            ApiTester.verbose = true;

        ApiTester.printRunInfo();
        ApiTester.runTestCases();
    }
}
