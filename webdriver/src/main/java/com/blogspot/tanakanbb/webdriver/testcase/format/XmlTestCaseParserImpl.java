/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.format;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.blogspot.tanakanbb.webdriver.testcase.TestCaseException;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.TestCase;

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
    public TestCase parse(File xmlFile) throws TestCaseException {
        try {
            JAXBContext context = JAXBContext.newInstance(TestCase.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            TestCase testCase = (TestCase) unmarshaller.unmarshal(xmlFile);
            
            return testCase;
        } catch (JAXBException e) {
            LOGGER.error(e.getMessage(), e);
            throw new TestCaseException(e);
        }
    }

}
