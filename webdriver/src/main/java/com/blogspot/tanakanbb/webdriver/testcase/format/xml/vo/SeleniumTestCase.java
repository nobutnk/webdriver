/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author nobutnk
 *
 */
@XmlRootElement(name = "TestCase")
@XmlAccessorType(XmlAccessType.FIELD)
public class SeleniumTestCase {
    @XmlAttribute
    private String seleniumIDEVersion;
    
    @XmlAttribute
    private String baseURL;
    
    @XmlElement
    private List<SeleniumSelenese> selenese;

    /**
     * @param seleniumIDEVersion the seleniumIDEVersion to set
     */
    public void setSeleniumIDEVersion(String seleniumIDEVersion) {
        this.seleniumIDEVersion = seleniumIDEVersion;
    }

    /**
     * @param baseURL the baseURL to set
     */
    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    /**
     * @return the selenese
     */
    public List<SeleniumSelenese> getSelenese() {
        return selenese;
    }

    /**
     * @return the seleniumIDEVersion
     */
    public String getSeleniumIDEVersion() {
        return seleniumIDEVersion;
    }

    /**
     * @return the baseURL
     */
    public String getBaseURL() {
        return baseURL;
    }

    /**
     * @param selenese the selenese to set
     */
    public void setSelenese(List<SeleniumSelenese> selenese) {
        this.selenese = selenese;
    }
}
