/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.executor.command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.blogspot.tanakanbb.webdriver.testcase.exception.TestCaseExecutorException;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.SeleniumSelenese;

/**
 * click�̎��s<br>
 * click [id] [] : �����N��{�^�����N���b�N
 * @author nobutnk
 *
 */
public class ClickCommandExecutorImpl extends AbstractCommandExecutor {

    /**
     * click [id] [] : �����N��{�^�����N���b�N
     * 
     * @param selenese �R�}���h�ꎮ. target���K�{
     * @param webDriver �h���C�o
     * @throws TestCaseExecutorException �R�}���h���s��O
     */
    @Override
    public void execute(SeleniumSelenese selenese, WebDriver webDriver)
            throws TestCaseExecutorException {
        By by = search(selenese.getTarget().getValue());
        WebElement element = webDriver.findElement(by);
        
        element.click();
    }
    
}
