/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author nobutnk
 *
 */
@XmlRootElement(name = "selenese")
@XmlAccessorType(XmlAccessType.FIELD)
public class SeleniumSelenese {

    @XmlElement
    private SeleniumCommand command;
    
    @XmlElement
    private SeleniumTarget target;
    
    @XmlElement
    private SeleniumValue value;

    /**
     * @param command the command to set
     */
    public void setCommand(SeleniumCommand command) {
        this.command = command;
    }

    /**
     * @param target the target to set
     */
    public void setTarget(SeleniumTarget target) {
        this.target = target;
    }

    /**
     * @param value the value to set
     */
    public void setValue(SeleniumValue value) {
        this.value = value;
    }

    /**
     * @return the command
     */
    public SeleniumCommand getCommand() {
        return command;
    }

    /**
     * @return the target
     */
    public SeleniumTarget getTarget() {
        return target;
    }

    /**
     * @return the value
     */
    public SeleniumValue getValue() {
        return value;
    }
}
