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
 * clickAndWait�̎��s<br>
 * clickAndWait [id] [] : �����N��{�^�����N���b�N���āC��ʑJ�ڂ�҂�
 * @author nobutnk
 *
 */
public class ClickAndWaitCommandExecutorImpl extends AbstractCommandExecutor {

    /**
     * clickAndWait [id] [] : �����N��{�^�����N���b�N���āC��ʑJ�ڂ�҂�
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
        
        long waitTime = DEFAULT_WAIT_MILLSECONDS;
        if (selenese.getValue().getValue() != null) {
            waitTime = Long.valueOf(selenese.getValue().getValue()).longValue();
        }
        sleep(waitTime);
    }
    
}
