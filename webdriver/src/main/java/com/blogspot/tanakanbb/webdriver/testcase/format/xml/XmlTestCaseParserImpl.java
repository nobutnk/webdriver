/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.format.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.blogspot.tanakanbb.webdriver.testcase.TestCaseException;
import com.blogspot.tanakanbb.webdriver.testcase.format.TestCaseParser;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.SeleniumTestCase;

/**
 * @author nobutnk
 *
 */
public class XmlTestCaseParserImpl implements TestCaseParser {

    /**
     * ÉçÉO
     */
    private static Log LOGGER = LogFactory.getLog(XmlTestCaseParserImpl.class);
    
    /**
     * @see com.blogspot.tanakanbb.webdriver.testcase.format.TestCaseParser#parse(java.lang.String)
     */
    @Override
    public SeleniumTestCase parse(File xmlFile) throws TestCaseException {
        try {
            JAXBContext context = JAXBContext.newInstance(SeleniumTestCase.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            SeleniumTestCase testCase = (SeleniumTestCase) unmarshaller.unmarshal(xmlFile);
            
            return testCase;
        } catch (JAXBException e) {
            LOGGER.error(e.getMessage(), e);
            throw new TestCaseException(e);
        }
    }

}
