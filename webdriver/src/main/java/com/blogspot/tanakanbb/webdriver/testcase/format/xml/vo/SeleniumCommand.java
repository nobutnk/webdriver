/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author nobutnk
 *
 */
@XmlRootElement(name = "command")
@XmlAccessorType(XmlAccessType.FIELD)
public class SeleniumCommand {

    @XmlValue
    private String value;

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
}
