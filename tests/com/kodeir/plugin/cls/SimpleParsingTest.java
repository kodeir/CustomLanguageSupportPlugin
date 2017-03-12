package com.kodeir.plugin.cls;

import com.intellij.testFramework.ParsingTestCase;

import java.io.File;

/**
 * Created by Sergei Riabinin on 12.03.2017.
 */
public class SimpleParsingTest extends ParsingTestCase {
    public SimpleParsingTest() {
        super("", "simple", new SimpleParserDefinition());
    }

    public void testParsingTestData() {
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return "testData/";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}

