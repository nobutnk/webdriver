/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.executor;

import org.openqa.selenium.WebDriver;

import com.blogspot.tanakanbb.webdriver.testcase.exception.TestCaseExecutorException;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.SeleniumSelenese;

/**
 * @author nobutnk
 *
 */
public interface SeleniumCommandExecutor {

    /**
     * Selenium�̃R�}���h�����s����
     * @param selenese �R�}���h�ꎮ
     * @param webDriver �h���C�o
     * @throws TestCaseExecutorException �R�}���h���s��O
     */
    public void execute(SeleniumSelenese selenese, final WebDriver webDriver)
            throws TestCaseExecutorException;
}
