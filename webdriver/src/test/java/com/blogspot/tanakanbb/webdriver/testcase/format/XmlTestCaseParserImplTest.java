package com.blogspot.tanakanbb.webdriver.testcase.format;

import static org.junit.Assert.*;

import java.io.File;
import java.net.URL;

import org.junit.Test;

import com.blogspot.tanakanbb.webdriver.testcase.TestCaseException;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.TestCase;

public class XmlTestCaseParserImplTest {

    @Test
    public void testParse() {
        String xmlFilePath = "example.xml";
        URL xmlURL = XmlTestCaseParserImplTest.class.getClassLoader().getResource(xmlFilePath);
        File xml = new File(xmlURL.getPath());
        
        XmlTestCaseParserImpl target = new XmlTestCaseParserImpl();
        try {
            TestCase testCase = target.parse(xml);
            System.out.println(testCase.getSelenese().size());
        } catch (TestCaseException e) {
            e.printStackTrace();
            fail();
        }
    }

}
