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
public class Selenese {

    @XmlElement
    private Command command;
    
    @XmlElement
    private Target target;
    
    @XmlElement
    private Value value;

    /**
     * @param command the command to set
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * @param target the target to set
     */
    public void setTarget(Target target) {
        this.target = target;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * @return the command
     */
    public Command getCommand() {
        return command;
    }

    /**
     * @return the target
     */
    public Target getTarget() {
        return target;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }
}
